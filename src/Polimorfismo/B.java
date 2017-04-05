/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Estudiante
 */
public class B extends A {

    public B() {
        System.out.println("constructor de b");
    }
    
    
    @Override
    public void f (int a){
        System.out.println("En B"+ a);
    }
}
