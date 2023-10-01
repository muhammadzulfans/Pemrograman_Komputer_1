package practice.oop;


import practice.oop.FlyBehavior;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class FlyRocketPowered implements FlyBehavior {
    
    
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
