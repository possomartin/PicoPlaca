/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PicoPlaca;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marst
 */
public class PicoPlaca {
    
    private String Plate;
    private String Date;
    private Time Time;
   
    //Variable for Pico days
    private List<Pico> PicoDays;
   
    //Variables for Pico Hours
    private Time R1;
    private Time R2;
    private Time R3;
    private Time R4;
           
    public PicoPlaca(String Plate, String Date, Time Time)
    {
        PicoDays = new ArrayList<Pico>();
        
        setPlate(Plate);
        setDate(Date);
        setTime(Time);
        
        setPicoDays();
        setPicoHours();
    }
    
    public void setPicoHours()
    {
        R1 = new Time(7, 0);
        R2 = new Time(9, 30);
        R3 = new Time(16, 0);
        R4 = new Time(19, 30);
        
    }
    
    public void setPicoDays()
    {
        PicoDays.add(new Pico("Monday", 1, 2));
        PicoDays.add(new Pico("Tuesday", 3, 4));
        PicoDays.add(new Pico("Wednesday", 5, 6));
        PicoDays.add(new Pico("Thursday", 7, 8));
        PicoDays.add(new Pico("Friday", 9, 0));        
    }
    
    
    public void setPlate(String plate)
    {
        Plate = plate;
    }
    
    public void setDate(String date)
    {
        Date = date;
    }
    
    public void setTime(Time time)
    {
        Time = time;
    }
    
    //Method to check Pico Days using the License Plate
    
    public boolean checkPico()
    {
        String weekDay =  new SimpleDateFormat("EEEE").format(getDate());
       
        Iterator<Pico> it = PicoDays.iterator();
        
        while(it.hasNext())
        {
            Pico p = it.next();
            
            if(p.getDay().equals(weekDay))
            {
                if(p.getP1() == getPlate() || p.getP2() == getPlate())
                    return true;
            }
        }
        
        return false;
    }
    
    //Method to check whether or not the time input is between pico Hours
    
    public boolean checkPicoHours() 
    {
        if(checkPico())
        {
            if((Time.betweenRange(R1) && R2.betweenRange(Time)) || (Time.betweenRange(R3) && R4.betweenRange(Time)))
                return true;
        }
        return false;
    }
    
    //Returns the time left to get To a Pico Hour or time left to end Pico hour
    
    public Time getTimeLeft()
    {
        long elapsedMinutes = 0;
        
        if(Time.betweenRange(R2))
            elapsedMinutes = Duration.between(Time.toLocalTime(), R3.toLocalTime()).toMinutes();
        if(R1.getHours() >= Time.getHours())
            elapsedMinutes = Duration.between(Time.toLocalTime(), R1.toLocalTime()).toMinutes();
        if(Time.betweenRange(R1) && R2.betweenRange(Time))
            elapsedMinutes = Duration.between(Time.toLocalTime(), R2.toLocalTime()).toMinutes();
        if(Time.betweenRange(R3) && R4.betweenRange(Time))
            elapsedMinutes = Duration.between(Time.toLocalTime(), R4.toLocalTime()).toMinutes();
        
        
        int Minutes = (int)Math.abs(elapsedMinutes) % 60;
        int Hours = (int)Math.abs(elapsedMinutes) / 60;
        
        return new Time(Hours, Minutes);
    }
    
    
    public Time getTime()
    {
        return Time;
    }
    
    //Returns the last digit of the License Plate
    
    public int getPlate()
    {
        return Character.getNumericValue(Plate.charAt(Plate.length() - 1));
    }
    
    //Rerturns the input String Date as a variable of type Date
    
    public Date getDate()
    {
        try
        {
            return new SimpleDateFormat("dd/MM/yyyy").parse(Date); 
        }
        catch(ParseException e)
        {
            return null;
        }
    }
    
}
