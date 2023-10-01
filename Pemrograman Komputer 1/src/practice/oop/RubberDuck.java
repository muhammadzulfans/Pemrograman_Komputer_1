package practice.oop;


import practice.oop.Duck;
import practice.oop.FlyNoWay;
import practice.oop.FlyBehavior;
import practice.oop.QuackBehavior;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        //quackBehavior = new QuackBehavior;
        quackBehavior = () -> System.out.println("Squeak");
    }
    
    
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    @Override
    public void display(){
        System.out.println("I am a rubber duckie");
    }
    
}
