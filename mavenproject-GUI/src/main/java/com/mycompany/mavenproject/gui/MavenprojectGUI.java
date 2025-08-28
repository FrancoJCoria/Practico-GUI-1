/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject.gui;

/**
 *
 * @author feerl
 */


public class MavenprojectGUI {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Ejercicio1().setVisible(true);
            }
        });
        
         java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Ejercicio2().setVisible(true);
            }
        });
    }
}
