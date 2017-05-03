/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

/**
 *
 * @author María Teresa
 */
public class Main {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CuentaCorriente a;

        a = new CuentaCorriente("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        
        System.out.println("El saldo actual es"+ a.getSaldo());

        a.retirar(2300);
        System.out.println("Ingreso en cuenta");
        a.ingresar(600);
        
        System.out.println(CuentaCorriente.toString(a));
    }

}
