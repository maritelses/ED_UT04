

package daw_ed04;

import java.util.Scanner;

/**
 *
 * @author María Teresa
 */

public class CuentaCorriente {

    /**
 * Esta clase va a contener información sobre una cuenta corriente
 * y métodos para operar con dicha cuenta
 * 
 */


    String nombre;//Nombre del dueño de la cuenta 
    String numCuenta; //Número de cuenta 
    String password; //contraseña del acceso web
    double saldo; //Saldo disponible en la cuenta 
    double tipoInteres; //porcentaje de Interes que dará el dinero en la cuenta

    /**
     *
     */
    public CuentaCorriente() {
    }

    /**
     *
     * @param nombre
     * @param cuenta
     * @param saldo
     * @param tipo
     */
    public CuentaCorriente(String nombre, String cuenta, double saldo, double tipo) {
        nombre = nombre;
        numCuenta = cuenta;
        saldo = saldo;
    }

    /**
     *
     * @param nom
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    /**
     *
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return Saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        try {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
     //COMENTARIO PARA COMPROBAR QUE SE REALIZA EL CAMBIO EN GIT 
    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
         try {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }

    /**
     *
     * @param tantoPorCiento
     * @return saldo*tantoPorCiento/100
     */
    public double porcentaje(double tantoPorCiento) {
        
        
        return saldo * tantoPorCiento / 100;

    }

    /**
     *
     * @param contraseñaAnterior
     */
    public void setPassword(String contraseñaAnterior) {
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            if (contraseñaAnterior.equals(password)){
            
                System.out.println("La contraseña coincice con la anterior");
            
            }else{
                sc.nextLine();
                System.out.println("Introduce la nueva contraseña");
            
            }
            
        }
    }
    
    /**
     *
     * @param a
     * @return nombre,numCuenta,saldo y tipoInteres
     */
    public static String toString(CuentaCorriente a) {
        return "Datos de la cuenta: " + a.nombre + a.numCuenta + a.saldo + a.tipoInteres;
    }
}
