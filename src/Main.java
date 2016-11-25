
import com.issatso.multimediatools.gui.MainGui;
import com.issatso.multimediatools.gui.StartingSettings;
import java.io.File;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fathi jemli
 */
public class Main {

    static org.apache.log4j.Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            File preferencesFile = new File("settings.properties");
            if (!preferencesFile.exists()) {
                logger.warn("You are using Multimedia-tools for the first time");
                StartingSettings startingSettings = new StartingSettings();
                startingSettings.setVisible(true);
            } else {
                new MainGui();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
