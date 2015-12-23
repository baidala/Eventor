/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.itstepandroid11.baidala;

/**
 *
 * @author student
 */
public class SecondButton implements Callback {
    private int buttonId;
    
    SecondButton (int id) {
        buttonId = id;
    }
    
    @Override
    public void startButtonById(int id) {
        if (buttonId == id) {
        System.out.println("We are in SecondButton with id "+ buttonId);
        }
    }
    
    
}
