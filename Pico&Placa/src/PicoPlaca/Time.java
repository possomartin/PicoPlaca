/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PicoPlaca;

import java.time.LocalTime;

/**
 *
 * @author marst
 */
public class Time {
    
    private int Hour;
    private int Minutes;
    
    //Constructor Method
    
    public Time(int Hours, int Minutes)
    {
        setHour(Hours);
        setMinutes(Minutes);
    }
    
    public void setHour(int hour)
    {
        Hour = hour;
    }
    
    public void setMinutes(int minutes)
    {
        Minutes = minutes; 
    }
    
    //Checks if it is Between a Range
    
    public boolean betweenRange(Time t2)
    {
        if(getHours() >= t2.getHours() && getMinutes() >= t2.getMinutes())
            return true;
        return false;
    }
    
    
    public int getHours(){ return Hour; }
    
    public int getMinutes() { return Minutes; }
    
    //Parses the Time to LocalTime
    
    public LocalTime toLocalTime() { return LocalTime.parse(toString()); }
    
    @Override
    
    public String toString()
    {
        if(Minutes < 10 && Hour < 10)
        {
            return "0" + Hour + ":" + "0" + Minutes;
        }
        if(Minutes < 10 && Hour >= 10)
        {
            return Hour + ":" + "0" + Minutes;
        }
        if(Hour < 10 && Minutes >= 10)
        {
            return "0" + Hour + ":" + Minutes;
        }
        if(Hour >= 10 && Minutes >= 10)
        {
            return Hour + ":" + Minutes;
        }
        
        return "00:00";    
        
    }
        
}
