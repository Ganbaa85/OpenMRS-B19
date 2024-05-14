package openMrs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readProperty(String key){

        //Get file location
        File file = new File("configuration.properties");

        //Reads file
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(file));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);

    }

}
