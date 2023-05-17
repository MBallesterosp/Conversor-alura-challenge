/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversor.alura.challenge;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class ConversorAluraChallenge {
    
    public static void main(String[] args) {
        
    }
    
    public static void principalMenu(String[] args) {
        String name = JOptionPane.showInputDialog("Type your name please");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }

    public static void conversionValue(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    public static void coinOptions(String[] args) {
        String name = JOptionPane.showInputDialog("Type your name please");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }

    public static void valueEntry(String[] args) {
        String name = JOptionPane.showInputDialog("Type your name please");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }

    public static void errorHandling(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    public static void continueProgram(String[] args) {

        int input = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        // 0=yes, 1=no, 2=cancel
        System.out.println(input);
    }
    
    public static void finishProgram(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World");
    }
    
}
