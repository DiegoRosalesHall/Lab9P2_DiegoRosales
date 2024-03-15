/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegorosales;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JTextArea;


public class AdminArchivos {
    File archivo = null;
    JTextArea texto;
    
    
    public AdminArchivos(String path, JTextArea texto){
        archivo = new File(path);
        this.texto = texto;
    }
    
    
      public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            String a = texto.getText();
            System.out.println(a);
            
                
                bw.write(texto.getText());
           
           
            

                
                
            
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() throws FileNotFoundException {
        Scanner sc = null;
        
        if (archivo.exists()) {
            String a="";
                sc = new Scanner(archivo);
                while(sc.hasNext()){
               
                    
                    a+=sc.next()+" ";
                
                texto.setText(a);
                    
    
        }
    }
    }
}
   
         

