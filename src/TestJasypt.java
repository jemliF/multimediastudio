
import org.jasypt.util.text.BasicTextEncryptor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fathi jemli
 */
public class TestJasypt {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("jfcode");
        //String encryptedText = encryptor.encrypt("Jemli");
        String decryptedText = encryptor.decrypt("hOMwecgI8ZlD2iSLMdwA44S9ZVWIIsyg");
        //System.out.println(encryptedText);
        System.out.println(decryptedText);

    }
}
