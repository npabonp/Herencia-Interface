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
public class D extends C {

    public D() {
        System.out.println("constructor de d");
    }
    

    @Override
    public void f(int d) {
        System.out.println("En D " + d);
        //Para llamar la misma funcion de mi papa
        super.f(d);
    }
}
