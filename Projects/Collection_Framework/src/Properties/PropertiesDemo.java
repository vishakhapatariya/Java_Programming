// Properties Class
// Storing and accessing data in txt and xml files

package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");

        // Storing data in txt file
        p.store(new FileOutputStream("src/Properties/MyData.txt"), "Laptop");
        // Storing data in xml file
        p.storeToXML(new FileOutputStream("src/Properties/MyData.xml"), "Laptop");

        // Reading data from txt file
        p.load(new FileInputStream("src/Properties/MyData.txt"));
        // Reading data from xml file
        p.loadFromXML(new FileInputStream("src/Properties/MyData.xml"));

        System.out.println(p);
        System.out.println(p.getProperty("Brand"));
    }
}
