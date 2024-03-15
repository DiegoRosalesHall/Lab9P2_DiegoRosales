/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegorosales;

import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */
public class HoraThread implements Runnable{
    
    JLabel jl;
    
    @Override
    public void run() {
        while(true){
        Date a = new Date();
        
        jl.setText(a.getHours()+""+":"+a.getMinutes()+""+":"+a.getSeconds()+"");
        }
    }

    public HoraThread(JLabel jl) {
        this.jl =jl;
    }
    
}
