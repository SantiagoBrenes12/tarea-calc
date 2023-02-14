/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacalcusantiago;

import javax.swing.JOptionPane;

/**
 *
 * @author Puta'
 */
public class Calculadora {
    public int numero1;
    public int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public String suma(int n1,int n2){
        String suma = Integer.toString(n1+n2);
        return suma;
    }
    
    public String resta(int n1,int n2){
        String suma = Integer.toString(n1-n2);
        return suma;
    }
    
    public String multiplicacion(int n1,int n2){
        String suma = Integer.toString(n1*n2);
        return suma;
    }
    
    public String division(int n1,int n2){
        String suma = Integer.toString(n1/n2);
        return suma;
    }
    
    public void calculate(int operacion){
        switch (operacion) {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma(this.numero1,this.numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resta(this.numero1,this.numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+multiplicacion(this.numero1,this.numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division(this.numero1,this.numero2));
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
