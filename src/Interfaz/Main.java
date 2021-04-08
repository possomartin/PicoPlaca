/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import PicoPlaca.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author marst
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static Time t1;
    public static Time t2;
    public static Time t3;
    public static Time t4;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Time time = new Time(9, 40);
        
        PicoPlaca p = new PicoPlaca("ABC-1239", "9/4/2021", time);
        System.out.println(p.getPlate() + "\n" + p.getDate() + "\n" + p.getTime());
        
        System.out.println("Time Left: " + p.getTimeLeft());
        
        System.out.println("Yoy Have Pico & Placa: " + p.checkPico() + " Cannot mobilize in Pico Hour: " + p.checkPicoHours());
        
    }
    
}
