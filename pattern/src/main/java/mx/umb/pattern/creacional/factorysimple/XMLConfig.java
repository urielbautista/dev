package mx.umb.pattern.creacional.factorysimple;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLConfig {
	private static Map <String, String> tiposInstanciables= new HashMap<String, String>();
	private static XMLConfig instance = null;
	
	private XMLConfig(){
		try {
			String current = new java.io.File( "." ).getCanonicalPath();
			System.out.println("Current dir:"+current);
			
			String currentDir = System.getProperty("user.dir");
			System.out.println("Current dir using System:" +currentDir);
		        
		   Path currentRelativePath = Paths.get("");
		   String s = currentRelativePath.toAbsolutePath().toString();
		   System.out.println("Current relative path is: " + s);
		        
		        
			File fXmlFile = new File(current+"/src/main/java/mx/umb/pattern/creacional/simplefactory/simple-factory.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList amtNodeList = doc.getElementsByTagName(EnumMotor.MOTOR_TYPES.getMotor());

			for (int temp = 0; temp < amtNodeList.getLength(); temp++) {
				Node amtNode = amtNodeList.item(temp);
				System.out.println("Current Element :" + amtNode.getNodeName());
				NodeList mtNodeList = amtNode.getChildNodes();
				for (int i = 0; i < mtNodeList.getLength(); i++) {
					Node mtNode = mtNodeList.item(i);
					if (mtNode.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) mtNode;
						if (element.getAttribute("isEnabled").equalsIgnoreCase("true")){
							tiposInstanciables.put( element.getAttribute("id"), element.getAttribute("class"));
						}
					}
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

    public static synchronized XMLConfig getInstance(){
        if(instance == null){
        	instance = new XMLConfig();
        }
        return instance;
   }
    
	
	public static String obtenerTipo(String nombreTipo){
	    if (tiposInstanciables == null)
	        return null;
	    else
	    	return tiposInstanciables.get(nombreTipo);
	}

}
