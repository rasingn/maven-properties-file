package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        System.out.println( "Hello World!" );
        Properties properties = new Properties();
        try {
        // Load the configuration file based on the active profile
        // String configFilePath =  "application.properties";
        InputStream propertiesInputStream = App.class.getResourceAsStream("/application.properties");
       properties.load(propertiesInputStream);
       
    
        String dbUrl = properties.getProperty("db.url");
        System.out.println(dbUrl);
        }catch(Exception e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
