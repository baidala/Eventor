/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.itstepandroid11.baidala;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class SystemTimer {
    ArrayList<Callback> callbacks = new ArrayList<Callback>();
    
    public void addToSystemTimer(Callback cb) {
        callbacks.add(cb);
    }
    
    public void removeFromSystemTimer (Callback cb) {
        callbacks.remove(cb);
    }
    
    public void clickOnButton(int id) {
        for ( Callback callbackLocal:callbacks ) {
            callbackLocal.startButtonById(id);
        }
    }
}
