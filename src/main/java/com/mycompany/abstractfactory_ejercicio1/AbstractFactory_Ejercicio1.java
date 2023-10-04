/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactory_ejercicio1;

/**
 *
 * @author Arzate
 */
public class AbstractFactory_Ejercicio1 {

    public static void main(String[] args) {
      AbstractFactory AB= new WindowsFactory();
      IButton boton= AB.CreateButton();
      boton.drawButton();
    }
}
