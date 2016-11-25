/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.issatso.multimediatools.assets;

import java.io.File;

/**
 *
 * @author fathi jemli
 */
public class SavingUtilities {

    public int getLastFile(String folderName) {
        File folder = new File(folderName);
        int lastNameIndex = 0;
        for (File file : folder.listFiles()) {
            if (lastNameIndex < Integer.parseInt(file.getName())) {
                lastNameIndex = Integer.parseInt(file.getName());
            }
        }
        return lastNameIndex;
    }
}
