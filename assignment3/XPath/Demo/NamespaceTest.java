package xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jiayiwu on 17/4/21.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public class NamespaceTest {

    public static void main(String agrs[]) throws DocumentException {
        new NamespaceTest().notHaveNamespaceSetting();
        new NamespaceTest().HaveNamespaceSetting();
    }



    public void notHaveNamespaceSetting() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        File file = new File("namespace.xml");
        Document document = saxReader.read(file);
        XPath x = document.createXPath("//list-property/structure/property");
         List<Node> nodes = x.selectNodes(document);
        System.out.println("--------------------本方法没有设置Namespace----------------------");
        System.out.println("查找到节点个数为->"+nodes.size());
        for(int i=0;i<nodes.size();i++)
            System.out.println(nodes.get(i).getText());
    }

    public void HaveNamespaceSetting() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        File file = new File("namespace.xml");
        Document document = saxReader.read(file);
        Map map = new HashMap();
        map.put("fivedreamer","http://www.fivedreamer.com");
        XPath x = document.createXPath("//fivedreamer:list-property/fivedreamer:structure/fivedreamer:property");
        x.setNamespaceURIs(map);
        List<Node> nodes = x.selectNodes(document);
        System.out.println("--------------------本方法了设置Namespace----------------------");
        System.out.println("查找到节点个数为->"+nodes.size());
        for(int i=0;i<nodes.size();i++)
            System.out.println(nodes.get(i).getText());
    }
}
