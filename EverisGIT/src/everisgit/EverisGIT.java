/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everisgit;

/**
 *
 * @author fabri
 */
public class EverisGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=2;
        Suma obj1= new Suma();
        Resta obj2= new Resta();
        Multiplicacion obj3= new Multiplicacion();
        Division obj4 = new Division();
        
        System.out.println(obj1.sumar(a, b));
        System.out.println(obj2.restar(a, b));
        System.out.println(obj3.multiplicar(a, b));
        System.out.println(obj4.dividir(a, b));
    }
    
}
