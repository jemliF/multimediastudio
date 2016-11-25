package com.issatso.multimediatools.assets;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author fathi jemli
 */
public class SettingsLoader {

    public Map<String, String> loadSettings() {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("jfcode");
        Map<String, String> settings = new HashMap<String, String>();
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("settings.properties");
            properties.load(inputStream);
            settings.put("firstname", properties.getProperty("firstname"));
            settings.put("lastname", properties.getProperty("lastname"));
            settings.put("email", properties.getProperty("email"));
            settings.put("login", properties.getProperty("login"));
            settings.put("signature", properties.getProperty("signature"));
            
            settings.put("rootDirectory", properties.getProperty("rootdirectory"));

            settings.put("videoprefix", properties.getProperty("videoprefix"));
            settings.put("videoextension", properties.getProperty("videoextension"));

            settings.put("audioprefix", properties.getProperty("audioprefix"));
            settings.put("audioextension", properties.getProperty("audioextension"));

            settings.put("textprefix", properties.getProperty("textprefix"));
            
            settings.put("photoprefix", properties.getProperty("photoprefix"));
            settings.put("photoextension", properties.getProperty("photoextension"));
            
            settings.put("tel", properties.getProperty("tel"));
            settings.put("password", encryptor.decrypt(properties.getProperty("password")));
            settings.put("emailpassword", encryptor.decrypt(properties.getProperty("emailpassword"))); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return settings;
    }

}
