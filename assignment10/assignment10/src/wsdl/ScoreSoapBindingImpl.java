/**
 * ScoreSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import fault.AddScoreFault;
import fault.DeleteScoreFault;
import fault.ModifyScoreFault;
import fault.SearchScoreFault;
import schema.删除成绩类型;
import schema.单项成绩类型;
import schema.成绩性质类型;
import schema.添加或修改成绩类型;
import service.ScoreInterface;

public class ScoreSoapBindingImpl implements ScoreInterface {
    public 单项成绩类型[] searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, SearchScoreFault {
        Document document = getDocument();
        ArrayList< schema.单项成绩类型> list = new ArrayList< schema.单项成绩类型>();

        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");

        for(int i=0; i<nodes.getLength(); i++){
            NodeList childNodes = nodes.item(i).getChildNodes();

            NamedNodeMap nodeAttr = nodes.item(i).getAttributes();

            System.out.println("课程编号与成绩类型:"+nodeAttr.getNamedItem("成绩性质")+"　"+nodeAttr.getNamedItem("课程编号"));
            for(int j=0; j<childNodes.getLength(); j++){
                Node temp = childNodes.item(j);
                if(temp.getNodeType() != Node.ELEMENT_NODE) {  //忽略空格
                    continue;
                }
                // 比较学号
                String stuID="";
                int score=0;
                for(int k=0;k<temp.getChildNodes().getLength();k++){
                    if(temp.getChildNodes().item(k).getNodeType() != Node.ELEMENT_NODE) {  //忽略空格
                        continue;
                    } else{
                        //System.out.println(temp.getChildNodes().item(k).getNodeName());
                        if(temp.getChildNodes().item(k).getNodeName().equals("tns:学号")){
                            stuID = temp.getChildNodes().item(k).getTextContent();
                        } else if(temp.getChildNodes().item(k).getNodeName().equals("tns:得分")){
                            score = Integer.parseInt( temp.getChildNodes().item(k).getTextContent() );
                        }
                    }
                }
                if(stuID.equals(studentNo)){
                    schema.单项成绩类型 single = new schema.单项成绩类型();
                    single.set得分(score);
                    single.set成绩性质(new 成绩性质类型(nodeAttr.getNamedItem("成绩性质").getTextContent()));
                    single.set课程编号(nodeAttr.getNamedItem("课程编号").getTextContent());
                    list.add(single);
                }
            }
        }
        schema.单项成绩类型[] result = new schema.单项成绩类型[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public java.lang.String addScore(添加或修改成绩类型 addScore) throws java.rmi.RemoteException, AddScoreFault {
        Document document = getDocument();

        /*
         * 检验课程和成绩性质是否已经存在
         */
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");
        Element scoreType = null;
        for (int i = 0; i < nodes.getLength(); i++) {
            NamedNodeMap scoreAttr = nodes.item(i).getAttributes();
            if (scoreAttr.getNamedItem("课程编号").getTextContent().equals(addScore.get课程编号()) && scoreAttr.getNamedItem("成绩性质").getTextContent().equals(addScore.get成绩性质().toString()) ) {
                System.out.println("课程与成绩类型存在");
                scoreType = (Element) nodes.item(i);
                break;
            }
        }
        // 课程与成绩类型不存在，添加课程和成绩类型，暂时还没实现，不知道为什么是bug
        if(scoreType==null){
            System.out.println("课程与成绩类型不存在");
            scoreType = document.createElement("tns:课程成绩");
            scoreType.setAttribute("成绩性质", addScore.get成绩性质().toString());
            scoreType.setAttribute("课程编号", addScore.get课程编号().toString());
        }
        Element score = document.createElement("tns:成绩");
        Element studentID = document.createElement("tns:学号");
        studentID.setTextContent(addScore.get学号());
        Element number = document.createElement("tns:得分");
        number.setTextContent( String.valueOf(addScore.get得分()) );
        score.appendChild(studentID);
        score.appendChild(number);
        //再把成绩添加进课程组
        scoreType.appendChild(score);

        return writeXML(document);
    }

    public java.lang.String deleteScore(删除成绩类型 delScore) throws java.rmi.RemoteException, DeleteScoreFault {
        Document document = getDocument();

        /*
         * 检验课程和成绩性质是否已经存在
         */
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");

        for (int i = 0; i < nodes.getLength(); i++) {
            if(nodes.item(i).getNodeType() != Node.ELEMENT_NODE) {  //忽略空格
                continue;
            }
            NamedNodeMap scoreAttr = nodes.item(i).getAttributes();
            String lessonid = scoreAttr.getNamedItem("课程编号").getTextContent();
            String type = scoreAttr.getNamedItem("成绩性质").getTextContent();
            if (lessonid.equals(delScore.get课程编号()) && type.equals(delScore.get成绩性质().toString())){
                NodeList childNodes = nodes.item(i).getChildNodes();
                for(int j=0;j<childNodes.getLength();j++){
                    Node temp = childNodes.item(j);
                    if(temp.getNodeType() != Node.ELEMENT_NODE) {  //忽略空格
                        continue;
                    }
                    // 比较学号
                    for(int k=0;k<temp.getChildNodes().getLength();k++){
                        if(temp.getChildNodes().item(k).getNodeType() != Node.ELEMENT_NODE) {  //忽略空格
                            continue;
                        } else{
                            //System.out.println(temp.getChildNodes().item(k).getNodeName());
                            if(temp.getChildNodes().item(k).getNodeName().equals("tns:学号")){
                                System.out.println(temp.getChildNodes().item(k).getTextContent());
                                if(temp.getChildNodes().item(k).getTextContent().equals(delScore.get学号())){
                                    nodes.item(i).removeChild(temp);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            }
        }

        return writeXML(document);
    }

    public java.lang.String modifyScore(添加或修改成绩类型 modSocre) throws java.rmi.RemoteException, ModifyScoreFault {
        删除成绩类型 del = new 删除成绩类型(modSocre.get学号(), modSocre.get课程编号(), modSocre.get成绩性质());
        //deleteScore(del);
        return deleteScore(del);
    }

    private Document getDocument(){
        URL url = getClass().getResource("");
        String filePath = url.getPath().replace("WEB-INF/classes/wsdl", "");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);

        Document document=null;
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(filePath + "ScoreList.xml");
            //score = document.getDocumentElement();
        } catch(Exception e){
            e.printStackTrace();
        }
        return document;
    }

    private String writeXML(Document document){
        URL url = getClass().getResource("");
        String filePath = url.getPath().replace("WEB-INF/classes/wsdl", "");

        try{
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath + "ScoreList.xml"));
            transformer.transform(source, result);
            return "操作成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败： " + e.getMessage();
        }
    }
}
