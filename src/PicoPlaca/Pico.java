/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PicoPlaca;

/**
 *
 * @author marst
 */
public class Pico {
    
    private String Day;
    private int P1;
    private int P2;
    
    public Pico(String day, int p1, int p2)
    {
        setP1(p1);
        setP2(p2);
        setDay(day);
    }
    
    public void setDay(String day)
    {
        Day = day;
    }
    
    public void setP1(int p1)
    {
        P1 = p1;
    }
    
    public void setP2(int p2)
    {
        P2 = p2;
    }
    
    public String getDay() {return Day; }
    public int getP1() { return P1; }
    public int getP2() { return P2; }
    
    
}
