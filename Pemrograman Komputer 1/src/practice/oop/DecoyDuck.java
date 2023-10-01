package practice.oop;


import practice.oop.Duck;
import practice.oop.MuteQuack;
import practice.oop.FlyNoWay;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class DecoyDuck extends Duck {
    
    public void DecoyDuck() {
        
        setFlyBehavior (new FlyNoWay());
        setQuackBehavior (new MuteQuack());
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Decoy");
    }
    
}
