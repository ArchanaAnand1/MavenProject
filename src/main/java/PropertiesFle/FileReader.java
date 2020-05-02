package PropertiesFle;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
	
	public Properties getProperty(String fileName) throws IOException
	{
		FileInputStream inputStream=null;
        Properties properties = new Properties();
        try {        	 
            properties.load(new FileInputStream("src/test/resources/PropertyFile/"+fileName));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
       } 
         return properties;	
}

}
