/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
      /* A a = new A();
       a.f(5);
       
       A b = new B();
       b.f(10);
       //se ejecuta el segundo metodo ya que no recibe ningun parametro
       b.f();
       
       /*Esta operacion es valida porque
       A conoce que existe una version f
       que baja por toda la jerarquia
       
       A c = new C();
       c.f(10);
       
        
       Respeta la jerarquia, es decir que va
        a imprimir 
                 constr a
                 constf de c
                 constructor de d
                 En D 0
      */
              
       A d = new D();
       d.f(0);
       
    }
    
}
