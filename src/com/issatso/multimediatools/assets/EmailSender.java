/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.issatso.multimediatools.assets;

import java.awt.Cursor;
import static java.awt.Cursor.DEFAULT_CURSOR;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.WAIT_CURSOR;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
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
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import java.net.*;
import javax.swing.JInternalFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author fathi jemli
 */
public class EmailSender extends JInternalFrame {

    private JPanel contentPane;
    private JTextField txtEmail;
    private JTextField txtJemliflivecom;
    private JTextField txtHiIUsed;
    private JFileChooser fc = new JFileChooser();
    private File file;
    private JPasswordField passwordField;

    /**
     * Create the frame.
     */
    public EmailSender() {
        setTitle("JFCode Email Sender (Gmail & Yahoo)");
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 765, 476);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress("www.google.com", 80);

        /*try {
         sock.connect(addr, 3000);
         JOptionPane.showMessageDialog(null, "");
         } catch (Exception e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(EmailSender.this,
         "Check your internet connection", "Error Message",
         JOptionPane.ERROR_MESSAGE, new ImageIcon(
         "hungryFace.png"));

         } finally {
         try {

         } catch (Exception e2) {
         e2.printStackTrace();
         }
         }
        try {
            InputStream in = new FileInputStream(new File("Skype connection sound - YouTube.wav"));
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        final JTextArea textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(232, 187, 517, 249);
        contentPane.add(scroll);
        JButton btnSend = new JButton("Send");
        btnSend.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSend.setBounds(10, 362, 212, 74);
        contentPane.add(btnSend);
        btnSend.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        JLabel lblFrom = new JLabel("From ");
        lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblFrom.setBounds(232, 25, 112, 30);
        contentPane.add(lblFrom);

        JLabel lblNewLabel = new JLabel("To");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(232, 67, 112, 30);
        contentPane.add(lblNewLabel);

        JLabel lblSubject = new JLabel("Subject");
        lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblSubject.setBounds(232, 119, 112, 30);
        contentPane.add(lblSubject);

        JLabel lblFileAttatchment = new JLabel("File attatchment :");
        lblFileAttatchment.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblFileAttatchment.setHorizontalAlignment(SwingConstants.CENTER);
        lblFileAttatchment.setBounds(10, 187, 212, 30);
        contentPane.add(lblFileAttatchment);

        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Tahoma", Font.ITALIC, 11));
        txtEmail.setText("jemlifathi2013@gmail.com");
        txtEmail.setBounds(403, 22, 167, 30);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);

        txtJemliflivecom = new JTextField();
        txtJemliflivecom.setText("jemli_f@live.com");
        txtJemliflivecom.setFont(new Font("Tahoma", Font.ITALIC, 11));
        txtJemliflivecom.setBounds(403, 67, 325, 30);
        contentPane.add(txtJemliflivecom);
        txtJemliflivecom.setColumns(10);

        txtHiIUsed = new JTextField();
        txtHiIUsed.setText("This Email was sent using JFCode Email sender");
        txtHiIUsed.setBounds(403, 117, 325, 30);
        contentPane.add(txtHiIUsed);
        txtHiIUsed.setColumns(10);

        JButton btnNewButton = new JButton("Browse");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btnNewButton.setBounds(10, 218, 212, 40);
        contentPane.add(btnNewButton);

        JLabel label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setIcon(new ImageIcon("C:\\Users\\fathi jemli\\Documents\\JavaWorkspaceMessenger\\EmailSenderGmail\\1405668656_contact.png"));
        label.setBounds(20, 38, 138, 111);
        contentPane.add(label);

        final JLabel label_1 = new JLabel("");
        label_1.setFont(new Font("Arial", Font.PLAIN, 11));
        label_1.setHorizontalAlignment(SwingConstants.LEFT);
        label_1.setBounds(10, 260, 212, 60);
        label_1.setToolTipText(label_1.getText());
        contentPane.add(label_1);

        JLabel lblYourMessage = new JLabel("Your message :");
        lblYourMessage.setFont(new Font("Tahoma", Font.ITALIC, 11));
        lblYourMessage.setBounds(232, 162, 112, 22);
        contentPane.add(lblYourMessage);

        passwordField = new JPasswordField();
        passwordField.setToolTipText("password");
        passwordField.setBounds(580, 22, 148, 29);
        contentPane.add(passwordField);

        JButton btnClearAttatchment = new JButton("Clear Attatchment");
        btnClearAttatchment.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btnClearAttatchment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                file = null;
                label_1.setText("");
            }
        });
        btnClearAttatchment.setBounds(49, 331, 128, 23);
        contentPane.add(btnClearAttatchment);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(10, 0, 97, 21);
        contentPane.add(menuBar);

        JMenu mnAbout = new JMenu("About");
        menuBar.add(mnAbout);

        JMenuItem mntmAbout = new JMenuItem("About");
        mntmAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(EmailSender.this,
                        "all rights reserved JFCode 2014 �: jemlifathi2013@gmail.com / jemli_f@live.com", "Email Sender",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        mnAbout.add(mntmAbout);

        JMenuItem mntmVisit = new JMenuItem("Visit us");
        mntmVisit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String url = "https://www.facebook.com/fjemli";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        JSeparator separator = new JSeparator();
        mnAbout.add(separator);
        mnAbout.add(mntmVisit);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(232, 66, 112, 2);
        contentPane.add(separator_1);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(232, 108, 112, 2);
        contentPane.add(separator_2);

        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(232, 147, 112, 2);
        contentPane.add(separator_3);

        fc.setFileFilter(new FileFilter() {

            @Override
            public String getDescription() {
                return "Tous les fichiers";
            }

            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return false;
                } else {
                    return true;
                }
            }
        });

        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (txtEmail.getText().equals("") || txtJemliflivecom.getText().equals("") || passwordField.getText().equals("")) {
                    JOptionPane.showMessageDialog(EmailSender.this,
                            "From or To are empty!", "Error Message",
                            JOptionPane.ERROR_MESSAGE, new ImageIcon(
                                    "hungryFace.png"));
                } else {
                    try {
                        getContentPane().setCursor(Cursor.getPredefinedCursor(WAIT_CURSOR));
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
                                                txtEmail.getText(),
                                                passwordField.getText());
                                    }
                                });

                        Message message = (Message) new MimeMessage(session);
                        message.setFrom(new InternetAddress(
                                txtEmail.getText()));
                        message.setRecipients(Message.RecipientType.TO,
                                InternetAddress.parse(txtJemliflivecom.getText()));
                        message.setSubject(txtHiIUsed.getText());

                        if (file != null) {
                            MimeBodyPart messageBodyPart = new MimeBodyPart();
                            messageBodyPart.setText(textArea.getText());
                            Multipart multipart = new MimeMultipart();
                            multipart.addBodyPart(messageBodyPart);
                            messageBodyPart = new MimeBodyPart();
                            DataSource source = new FileDataSource(file.getAbsolutePath());
                            messageBodyPart.setDataHandler(new DataHandler(source));
                            messageBodyPart.setFileName(file.getName());
                            multipart.addBodyPart(messageBodyPart);
                            message.setContent(multipart);
                        } else {
                            message.setText(textArea.getText());
                        }
                        Transport.send(message);
                        JOptionPane.showMessageDialog(EmailSender.this,
                                "Message to: " + txtJemliflivecom.getText(),
                                "Your message was sent",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(EmailSender.this,
                                "Check your internet connection or your parameters", "Error Message",
                                JOptionPane.ERROR_MESSAGE, new ImageIcon(
                                        "hungryFace.png"));
                    }
                    getContentPane().setCursor(Cursor.getPredefinedCursor(DEFAULT_CURSOR));
                }
            }
        });
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                fc.showOpenDialog(null);
                if (fc.getSelectedFile() != null) {
                    if (fc.getSelectedFile().length() <= 25000000) {
                        file = fc.getSelectedFile();
                        label_1.setText(file.getAbsolutePath());
                        System.out.println(fc.getSelectedFile().length());
                    } else {
                        JOptionPane.showMessageDialog(EmailSender.this,
                                "Size > 25MO", "Error Message",
                                JOptionPane.ERROR_MESSAGE, new ImageIcon(
                                        "hungryFace.png"));
                    }
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmailSender();
    }
}
