/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory_ejercicio1;

/**
 *
 * @author Arzate
 */
public class MacFactory implements AbstractFactory {

    @Override
    public IButton CreateButton() {
    return new MacButton();}

    @Override
    public ITextBox CreateTextBox() {
    return new MacTextBox();
    }
}
