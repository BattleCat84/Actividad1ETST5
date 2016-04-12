/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * Esta clase principal compuesta por un constructor
 * @author Migueli Ramos
 */

public class Main {
/**
 * @param args 
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        operativa_cuenta (cuenta1, 9500, 250);
        
    }
    
    // Este es sl segundo commit 
    
    /**
     * 
     * @param cuenta1
     * @param cantidadIngreso
     * @param cantidadRetira 
     */
    
    private static void operativa_cuenta(CCuenta cuenta1, float cantidadIngreso, float cantidadRetira){
        
        try {
            cuenta1.retirar(cantidadIngreso);
            
        } catch (Exception e) {
            
            System.out.print("Fallo al retirar");
        }
        try {
            
            System.out.println("Ingreso en cuenta");
            
            cuenta1.ingresar(cantidadRetira);
            
        } catch (Exception e) {
            
            System.out.print("Fallo al ingresar");
        }
    }
    
}
