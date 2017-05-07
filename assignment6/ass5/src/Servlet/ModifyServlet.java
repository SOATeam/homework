package Servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

/**
 * Created by Administrator on 2017/5/3.
 */
@WebServlet("/score/modify")
public class ModifyServlet extends HttpServlet {

    ServletContext servletContext;
    private SOAPConnection conn;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        servletContext = config.getServletContext();
        try {
            // 创建一个SOAP链接工厂
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            // 创建一个SOAP链接
            conn = factory.createConnection();
        } catch (SOAPException e) {
            System.out.println("创建SOAP链接失败!");
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String  studentID=request.getParameter("studentid");
//        String courseID=request.getParameter("courseid");
//        String score=request.getParameter("score");

        String urlString = "http://localhost:8080/score/find";
        String xmlFile = "/request.xml";// 要发送的soap格式文件
//        System.out.println(ModifyServlet.class.getResource("/hh").getFile());
        //?
//        String soapActionString = "http://WebXml.com.cn/getWeatherbyCityName";//Soap 1.1中使用
        URL url = new URL(urlString);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        File fileToSend = new File(xmlFile);
        byte[] buf = new byte[(int) fileToSend.length()];// 用于存放文件数据的数组
        new FileInputStream(xmlFile).read(buf);
//      httpConn.setRequestProperty("Content-Length",
//              String.valueOf(buf.length));//这句话可以不用写，即使是随便写
        //根据我的测试，过去的请求头中的Content-Length长度也是正确的，也就是说它会自动进行计算
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
//        httpConn.setRequestProperty("soapActionString",soapActionString);//Soap
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out = httpConn.getOutputStream();
        out.write(buf);
        out.close();
        InputStreamReader is = new InputStreamReader(httpConn.getInputStream(),
                "utf-8");
        BufferedReader in = new BufferedReader(is);
        String inputLine;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("/result.xml"),"utf-8"));// 将结果存放的位置
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            bw.write(inputLine);
            bw.newLine();
        }
        bw.close();
        in.close();
        httpConn.disconnect();

//        PrintWriter out = response.getWriter();
//
//        //TODO
////        response.setContentType("text/html; charset=UTF-8");
//        try {
//            // 1.创建消息工厂
//            MessageFactory factory = MessageFactory.newInstance();
//            // 2.创建soap消息reqMsg
//            SOAPMessage reqMsg = factory.createMessage();
//            // 3.创建soap消息的部分reqMsgpart
//            SOAPPart part = reqMsg.getSOAPPart();
//            // 3.1.创建sope信封envelope，开始写信
//            SOAPEnvelope envelope = part.getEnvelope();
//            // envelope.setPrefix("soap");	// 默认是SOAP-ENV
//            // 3.2.写header
//            // SOAPHeader header = envelope.getHeader();
//            // 3.3.写body
//
////            SOAPHeader soapHeader = envelope.getHeader();
//
//
//
//            SOAPBody body = envelope.getBody();
//            // 3.4.向body中添加元素，即要传递的数据
//            SOAPBodyElement element = body.addBodyElement(envelope.createName("修改信息"));
//            element.addChildElement(envelope.createName("学号")).addTextNode(studentID);
//            element.addChildElement(envelope.createName("课程编号")).addTextNode(courseID);
//            element.addChildElement(envelope.createName("新成绩")).addTextNode(score);
//            // 4.创建SOAP消息的目标对象（服务端点endPoint），即消息发给谁
////            String reqBaseUrl = getReqBaseUrl(request);
//            //TODO
//            URL endPoint = new URL("http://localhost:8080/score/find");
//
//            System.out.print("URL!!!!!!!!!!!");
//            // 5.发送SOAP消息，并接收返回信息
//            SOAPMessage respMsg = conn.call(reqMsg, endPoint);
//
//            out.print("success!!!!!!!!!!!!!!");
//            System.out.println("\n=====================请求的消息 : ");
//            reqMsg.writeTo(System.out);
//            System.out.println("\n=====================接收的消息 : ");
//            respMsg.writeTo(System.out);
//        } catch (SOAPException e) {
//            e.printStackTrace();
//            out.print("error!\n" + e.getMessage());
//        }
//        out.flush();
//        out.close();

    }

    private SOAPFault faultFactory(QName qName, String message, SOAPBody soapBody) throws SOAPException {
        SOAPFault soapFault = soapBody.addFault();
        soapFault.setFaultCode(qName);
        soapFault.setFaultString(message, Locale.CHINESE);
        return soapFault;
    }
    private String getReqBaseUrl(HttpServletRequest req) {
        StringBuffer urlSB = new StringBuffer();
        urlSB.append(req.getScheme()).append("://").append(req.getServerName()).append(":").append(req.getServerPort()).append(req.getContextPath());
        System.out.println("ggagg"+urlSB.toString());
        return urlSB.toString();
    }
}
