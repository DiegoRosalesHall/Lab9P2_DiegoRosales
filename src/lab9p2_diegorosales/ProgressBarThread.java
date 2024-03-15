/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegorosales;

import java.awt.TextArea;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ProgressBarThread implements Runnable{
    JProgressBar bar;
    File archivo = null;
    String path;
    JTextArea ta;
    
    @Override
    public void run() {
        bar.setValue(0);
        int cont=1;
        while(cont<=100){
            bar.setValue(bar.getValue()+1);
                
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBarThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cont++;
            
        }
        
        
        
        
        
            AdminArchivos adm = new AdminArchivos(path, ta);
                    try {
                        adm.cargarArchivo();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
        
        
     }

   

    public ProgressBarThread(JProgressBar bar, File archivo, String path, JTextArea ta) {
        this.bar = bar;
        this.archivo = archivo;
        this.path = path;
        this.ta = ta;
    }
    
    
    
}
