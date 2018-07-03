/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author shrey
 */
public class myCustomFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".png");
    }

    @Override
    public String getDescription() {
        return "PNG Image (.png)";//To change body of generated methods, choose Tools | Templates.
    }
    
}
