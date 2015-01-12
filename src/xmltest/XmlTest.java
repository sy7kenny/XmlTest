/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltest;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author GTL
 */
public class XmlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        File file = new File("c:\\Users\\Mad\\Desktop\\suiteXml.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
       
        NodeList nodeLst = doc.getElementsByTagName("point");
        System.out.println("Information of AggieVillage");
           // Loop through the list
        for (int s = 0; s < nodeLst.getLength(); s++) {

          Node fstNode = nodeLst.item(s);

          if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                 Element fstElmnt = (Element) fstNode;
                 String name = fstElmnt.getAttribute("name");
                 String value = fstElmnt.getAttribute("value");


            System.out.println("Point " + name + " : " + "value " + value);
          }

            }
            } catch (Exception e) {
    e.printStackTrace();
  }
    }
    
}
