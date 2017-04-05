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
public class A {

    
    public A() {
        System.out.println("constr a");
    }

    public void f(int a) {
        System.out.println("En A " + a);
    }

    /* Sobrecargar las funciones sirve cuando
   uno tiene un metodo basado en los parametro por defecto
   y otro que no tenga parametros*/
    public void f() {
        System.out.println("En A sin parametros");
    }
}
