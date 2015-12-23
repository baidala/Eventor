/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.itstepandroid11.baidala;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id = 10;
        Callback buttonFirst = new FirstButton(0);
        Callback duplicateButtonFirst = new FirstButton(1);
        Callback buttonSecond = new SecondButton(2);
        
        SystemTimer st = new SystemTimer();
        System.out.println("System started.");
        
        
        st.addToSystemTimer(buttonFirst);
        System.out.println("Add new button0.");
                
        st.addToSystemTimer(duplicateButtonFirst);
        System.out.println("Add new button1.");
        
        
        st.addToSystemTimer(buttonSecond);
        System.out.println("Add new button2.");
        
        st.addToSystemTimer(  new Callback() {
            private int buttonId = 3;
            
            @Override
            public void startButtonById(int id) {
                if (id == buttonId) {
                System.out.println("We use dynamic button_"+id);
                }
            }
                
            }
        
        
        );
        System.out.println("Add new button3.");
        
        st.addToSystemTimer(  new Callback() {
            private int buttonId = 4;
            
            @Override
            public void startButtonById(int id) {
                if  (id == buttonId) {
                System.out.println("We use dynamic button_"+id);
                }
            }
                
            }
        
        
        );
        System.out.println("Add new button4.");
        
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        st.clickOnButton(0);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        st.clickOnButton(1);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        st.clickOnButton(2);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        st.clickOnButton(3);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        st.clickOnButton(4);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        System.out.println("System stoped.");

    }
    
}
