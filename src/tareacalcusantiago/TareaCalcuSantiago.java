/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacalcusantiago;

import javax.swing.JOptionPane;

public class TareaCalcuSantiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do {
            
            int operacion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion desea realizar (ingrese una opcion)?\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir"));
            
            if(operacion == 5){
                break;
            }
            
            int numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            int numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            
            Calculadora calculator = new Calculadora(numeroUno,numeroDos);
            calculator.calculate(operacion);
        } while (true);
        
       
        
        
    }
    
}
