package practice.oop;


import practice.oop.Duck;
import practice.oop.Quack;
import practice.oop.FlyWithWings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class RedHeadDuck extends Duck {
     
    public RedHeadDuck() {
        
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        
    }
    
    @Override
    public void display() {
        System.out.println("I am a real red Headed duck");
    }
    
}
