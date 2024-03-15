/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegorosales;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class FechaThread implements Runnable{
    JLabel jl;
    
    @Override
    public void run() {
        while(true){
            Date l = new Date();
            SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
            String f = a.format(l);
            
            jl.setText(f+"");
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(FechaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}

    public FechaThread(JLabel jl) {
        this.jl = jl;
    }
    
}
