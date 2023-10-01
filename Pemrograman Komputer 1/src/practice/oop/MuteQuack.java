package practice.oop;


import practice.oop.QuackBehavior;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
    
}
