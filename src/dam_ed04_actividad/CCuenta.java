/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * 
 * @author Migueli Ramos
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * 
 */
    public CCuenta()
    {
    }
/**
 * 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * 
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * 
     * @return 
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * 
     * @return 
     */

    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return 
     */

    public double getTipoInterés() {
        return tipoInterés;
    }
    
    /**
     * 
     * @param tipoInterés 
     */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
        
    
 }

