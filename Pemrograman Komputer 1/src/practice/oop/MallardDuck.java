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
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }
    
    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
