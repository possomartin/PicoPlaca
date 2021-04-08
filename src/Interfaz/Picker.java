/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import PicoPlaca.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.optionalusertools.PickerUtilities;
import java.awt.Color;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 *
 * @author marst
 */
public class Picker extends javax.swing.JFrame {

    /**
     * Creates new form Picker
     */
    private List<JLabel> jlist;
    private PicoPlaca p;
    
    public Picker() {
        initComponents();
        
        setResizable(false);
        
        DatePickerSettings dS = new DatePickerSettings();
        dS.setFormatForDatesCommonEra(PickerUtilities.createFormatterFromPatternString("dd/MM/yyyy", Locale.ENGLISH)); 
        dS.setFormatForDatesBeforeCommonEra(PickerUtilities.createFormatterFromPatternString("dd/MM/yyyy", Locale.ENGLISH));
        datePicker1.setSettings(dS);
        
        //Initialize List
        
        Monday.setName("Monday");
        Tuesday.setName("Tuesday");
        Wednesday.setName("Wednesday");
        Thursday.setName("Thursday");
        Friday.setName("Friday");
        
        jlist = new ArrayList<JLabel>();
        
        jlist.add(Monday);
        jlist.add(Tuesday);
        jlist.add(Wednesday);
        jlist.add(Thursday);
        jlist.add(Friday);
                
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        LicensePlate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Monday = new javax.swing.JLabel();
        Friday = new javax.swing.JLabel();
        Tuesday = new javax.swing.JLabel();
        Wednesday = new javax.swing.JLabel();
        Thursday = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        PicoPlaca = new javax.swing.JTextArea();
        PicoHours = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PlateResult = new javax.swing.JTextField();
        DateResult = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TimeLeft = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TimeResult = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pico & Placa Predictor");
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 65));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 378));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(timePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 170, -1));
        jPanel1.add(LicensePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 170, 30));

        jLabel2.setText("Pick a Time");
        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 110, -1));

        jLabel3.setText("Enter License Plate");
        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 110, -1));

        jLabel4.setText("Pick a Date");
        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 110, -1));

        jButton1.setText("Predict");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 100, -1));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 170, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/car.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 40, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/calendar (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 40, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/clock (2).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 40, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 6.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 710, -1));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1090, 487));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/stop.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/clock (3).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jLabel10.setText("Pico & Placa:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pico Hours:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 70, -1));

        Monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 1.png"))); // NOI18N
        jPanel2.add(Monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, -1, -1));
        Monday.getAccessibleContext().setAccessibleName("Monday");

        Friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 5.png"))); // NOI18N
        jPanel2.add(Friday, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, -1, -1));
        Friday.getAccessibleContext().setAccessibleName("Friday");

        Tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 2.png"))); // NOI18N
        jPanel2.add(Tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));
        Tuesday.getAccessibleContext().setAccessibleName("Tuesday");

        Wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 3.png"))); // NOI18N
        jPanel2.add(Wednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, -1, -1));
        Wednesday.getAccessibleContext().setAccessibleName("Wednesday");

        Thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 4.png"))); // NOI18N
        jPanel2.add(Thursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, -1));
        Thursday.getAccessibleContext().setAccessibleName("Thursday");

        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        jPanel2.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 120, -1));

        PicoPlaca.setColumns(20);
        PicoPlaca.setEditable(false);
        PicoPlaca.setRows(5);
        PicoPlaca.setWrapStyleWord(true);
        PicoPlaca.setAutoscrolls(false);
        jPanel2.add(PicoPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, 70));

        PicoHours.setColumns(20);
        PicoHours.setEditable(false);
        PicoHours.setRows(5);
        PicoHours.setWrapStyleWord(true);
        jPanel2.add(PicoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, 60));

        jLabel12.setText("License Plate:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel13.setText("Date Picked:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/calendar (1).png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/car.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, -1));

        PlateResult.setEditable(false);
        PlateResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(PlateResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 200, -1));

        DateResult.setEditable(false);
        jPanel2.add(DateResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 200, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 8.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 7.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        jLabel19.setText("Time Left:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, 30));
        jPanel2.add(TimeLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 250, -1));

        jLabel20.setText("Time Picked:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 70, -1));
        jPanel2.add(TimeResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 200, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/clock (2).png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/timer.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1090, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        try
        {
            //gets Variables
            String date = datePicker1.getText();
            String Plate = LicensePlate.getText();
            LocalTime t = timePicker1.getTime();
            
            System.out.println("Time: " + t);
            
            //Sets Time
            Time time = new Time(t.getHour(), t.getMinute());
            
            //Initializes PicoPlaca with License Plate, Date and Time
            p = new PicoPlaca(Plate, date, time);

            //Changes Screen
            jTabbedPane1.setSelectedIndex(1);
            
            //Checks whether you are in Pico y Placa or not 
            if(p.checkPico())
            {
                PicoPlaca.setText("You have Pico & Placa today" + "\n" + "So you can't drive around town");
            }
            else
            {
                PicoPlaca.setText("You can drive freely in the city");
            }

            if(p.checkPicoHours())
            {
                PicoHours.setText("You can't move your car right now");
            }

            if(p.checkPico() && !p.checkPicoHours())
            {
                PicoHours.setText("You can drive freely in the city" + "\n" + " until your next Pico Hour");
            }
            else if(!p.checkPico() && !p.checkPicoHours())
            {
                PicoHours.setText("You can drive freely Anywhere you want");
            }
            
            //Sets border on Label that matches the WeekDay
            String weekDay = new SimpleDateFormat("EEEE").format(p.getDate());
            
            Iterator<JLabel> it = jlist.iterator();
            
            while(it.hasNext())
            {
                JLabel jl = it.next();
                
                if(jl.getName().equals(weekDay))
                    jl.setBorder(BorderFactory.createLineBorder(Color.gray, 2));    
            }
            
            //Sets the Jlabel text to display the users input
            
            PlateResult.setText(LicensePlate.getText());
            DateResult.setText("" + p.getDate());
            TimeResult.setText("" + p.getTime());
            
            TimeLeft.setText("" + p.getTimeLeft().toString());
            
            if(p.checkPico() && !p.checkPicoHours())
                TimeLeft.setText(p.getTimeLeft() + " To next Pico Hour");
            if(p.checkPicoHours())
                TimeLeft.setText(p.getTimeLeft() + " for Pico Hour to finish");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Unexcpected Error Found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        
        PicoHours.setText("");
        PicoPlaca.setText("");
        
        LicensePlate.setText("");
        
        datePicker1.setText("");
        timePicker1.setText("");
        
        TimeLeft.setText("");
        TimeResult.setText("");
        
        Monday.setBorder(null);
        Tuesday.setBorder(null);
        Wednesday.setBorder(null);
        Thursday.setBorder(null);
        Friday.setBorder(null);
        
        jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_BackBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Picker().setVisible(true);
            }
        });
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DateResult;
    private javax.swing.JLabel Friday;
    private javax.swing.JTextField LicensePlate;
    private javax.swing.JLabel Monday;
    private javax.swing.JTextArea PicoHours;
    private javax.swing.JTextArea PicoPlaca;
    private javax.swing.JTextField PlateResult;
    private javax.swing.JLabel Thursday;
    private javax.swing.JTextField TimeLeft;
    private javax.swing.JTextField TimeResult;
    private javax.swing.JLabel Tuesday;
    private javax.swing.JLabel Wednesday;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
