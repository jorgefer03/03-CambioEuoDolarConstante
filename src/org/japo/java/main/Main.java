/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Jorge Fernández Majid - jorge.fernandez.alum@iescamp.es
 */
public class Main {
    public static void main(String[] args) {
        final double CAMBIO_EURO_DOLAR = 1.17;
        double euros = 5;
        System.out.printf(Locale.ENGLISH, 
                "El cambio de hoy es %.2f€ por %.2f$.%n",
                euros, euros * CAMBIO_EURO_DOLAR);
        
    }
}
