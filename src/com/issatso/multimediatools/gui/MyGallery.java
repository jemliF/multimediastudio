/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.issatso.multimediatools.gui;

import com.issatso.multimediatools.assets.SettingsLoader;
import java.awt.BorderLayout;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import org.apache.log4j.Logger;

/**
 *
 * @author fathi jemli
 */
public class MyGallery extends JInternalFrame {
    
    static org.apache.log4j.Logger logger = Logger.getRootLogger();
    
    private JSplitPane jSplitPane;
    private JTree jTree;
    private JScrollPane jScrollPane;
    private JScrollPane jScrollTree;
    private SettingsLoader settingsLoader = new SettingsLoader();
    private Map<String, String> settings = new HashMap<String, String>();
    
    public MyGallery() {
        setTitle("Gallery");
        setSize(500, 550);
        setVisible(true);
        setLayout(new BorderLayout());
        setClosable(true);
        setResizable(true);
        setIconifiable(true);
        setMaximizable(true);
        
        settings = settingsLoader.loadSettings();
        listRoot();
        
        jTree.addTreeSelectionListener(new TreeSelectionListener() {
            
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                File file = new File(getAbsolutePath(e.getPath()));
                System.out.println(file.getAbsolutePath());
                if (file.isFile()) {
                    try {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
                        logger.info("Opening file: " + file.getAbsolutePath());
                    } catch (Exception exp) {
                        logger.warn(exp.getMessage());
                        exp.printStackTrace();
                    }
                } else {
                    
                }
            }
            
            private String getAbsolutePath(TreePath treePath) {
                String str = "";
                for (Object name : treePath.getPath()) {
                    if (name.toString() != null) {
                        str = str
                                + "\\" + name.toString();
                    }
                }
                return str;
            }
        });
        
    }
    
    private synchronized void listRoot() {
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode();
        File root = new File(settings.get("rootDirectory"));
        System.out.println(root.getAbsolutePath());
        for (File f : root.listFiles()) {
            DefaultMutableTreeNode lecteur = new DefaultMutableTreeNode(
                    f.getAbsolutePath());
            try {
                DefaultMutableTreeNode node;
                for (File nom : f.listFiles()) {
                    node = new DefaultMutableTreeNode(nom.getName() + "\\");
                    //lecteur.add(node);
                    lecteur.add(listFile(nom, node));
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            racine.add(lecteur);
        }
        jTree = new JTree(racine);
        jScrollPane = new JScrollPane(jTree);
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BorderLayout());
        panelCenter.add(jScrollPane, BorderLayout.CENTER);
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jScrollTree,
                panelCenter);
        jSplitPane.setDividerLocation(150);
        getContentPane().add(jSplitPane);
        revalidate();
        repaint();
    }
    
    private DefaultMutableTreeNode listFile(File file, DefaultMutableTreeNode node) {
        int count = 0;
        if (file.isFile()) {
            return new DefaultMutableTreeNode(file.getName());
        } else {
            File[] files
                    = file.listFiles();
            if (files == null) {
                return new DefaultMutableTreeNode(file.getName());
            }
            for (File f : files) {
                count++;
                if (count < 10) {
                    DefaultMutableTreeNode subNode;
                    if (f.isDirectory()) {
                        subNode = new DefaultMutableTreeNode(f.getName() + "\\");
                        node.add(listFile(f, subNode));
                    } else {
                        subNode = new DefaultMutableTreeNode(f.getName());
                    }
                    node.add(subNode);
                }
            }
        }
        return node;
    }
}
