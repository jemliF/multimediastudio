/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.issatso.multimediatools.gui;

import com.issatso.multimediatools.assets.SettingsLoader;
import static com.issatso.multimediatools.gui.MyGallery.logger;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author fathi jemli
 */
public class MainGui extends javax.swing.JFrame {

    static org.apache.log4j.Logger logger = Logger.getRootLogger();

    /**
     * Creates new form Main
     */
    public MainGui() {

        try {

            //javax.swing.UIManager.setLookAndFeel("org.gtk.java.swing.plaf.gtk.GtkLookAndFeel");
            //UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
            //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
            //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel");
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            logger.warn(e.getMessage());
            e.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        settings = settingsLoader.loadSettings();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        desktopPane.setBackground(java.awt.Color.white);
        desktopPane.setOpaque(false);

        menuBar.setBackground(java.awt.Color.white);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Tools");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Picture capture");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Text to speech");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Email sender");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        jMenuItem1.setText("Gallery");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("Settings");

        jMenuItem2.setText("Settings");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Technical support");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        JInternalFrameThread jInternalFrameThread = new JInternalFrameThread(new PictureCapture());
        jInternalFrameThread.start();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        JInternalFrameThread jInternalFrameThread = new JInternalFrameThread(new TextToSpeech());
        jInternalFrameThread.start();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        JInternalFrameThread jInternalFrameThread = new JInternalFrameThread(new EmailSender());
        jInternalFrameThread.start();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed

    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JInternalFrameThread jInternalFrameThread = new JInternalFrameThread(new MyGallery());
        jInternalFrameThread.start();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        StartingSettings startingSettings = new StartingSettings();
        startingSettings.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        final String email = settings.get("email");
        final String password = settings.get("emailpassword");
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(
                                    email,
                                    password);
                        }
                    });

            Message message = (Message) new MimeMessage(session);
            message.setFrom(new InternetAddress(
                    email));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("suppmultimedia.contact@yahoo.com"));//TODO
            message.setSubject("Some troubles with Multimedia-tools");
            File attatchmentFile = new File("C:\\tmp\\multimedia-tools.log");
            if (attatchmentFile != null) {
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText("I encountered some problems with Multimedia-tools");
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                messageBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(attatchmentFile.getAbsolutePath());
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(attatchmentFile.getName());
                multipart.addBodyPart(messageBodyPart);
                message.setContent(multipart);
            } else {
                JOptionPane.showMessageDialog(MainGui.this,
                        "We cannot locate log file", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }
            Transport.send(message);
            JOptionPane.showMessageDialog(MainGui.this,
                    "We successfuly received your report",
                    "Your message was sent",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            logger.warn(e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(MainGui.this,
                    "Check your internet connection or your parameters", "Error Message",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_contentMenuItemActionPerformed

    class PictureCaptureThread extends Thread {

        @Override
        public void run() {
            desktopPane.add(new PictureCapture());
        }

    }

    class TextToSpeechThread extends Thread {

        @Override
        public void run() {
            desktopPane.add(new TextToSpeech());
        }

    }

    class EmailSenderThread extends Thread {

        @Override
        public void run() {
            desktopPane.add(new EmailSender());
        }

    }

    class JInternalFrameThread extends Thread {

        private JInternalFrame frame;

        public JInternalFrameThread(JInternalFrame frame) {
            this.frame = new JInternalFrame();
            this.frame = frame;
        }

        @Override
        public void run() {
            try {
                frame.setVisible(true);
                desktopPane.add(frame);
            } catch (Exception ee) {
                logger.warn(ee.getMessage());
                ee.printStackTrace();
            }
            System.out.println("internelframe thread started");
        }

    }

    private SettingsLoader settingsLoader = new SettingsLoader();
    private Map<String, String> settings = new HashMap<String, String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}