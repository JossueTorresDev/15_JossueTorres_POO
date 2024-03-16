/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S03_17;

/**
 *
 * @author Jossue
 */
public class S03_17_if_ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = false;
        int b = 8;
        // if simple
        if (a) {
            System.out.println("Hola");
        }
        // if else
        if (a) {
            System.out.println("Ejecucin true");
        } else {
            System.out.println("Ejecucion false");
        }

        if (b == 10) {
            System.out.println("b vale 10");
        } else if (b == 20) {
            System.out.println("b vale 20");
        } else if (b == 30) {
            System.out.println("b vale 30");
        } else {
            System.out.println("No cumple");
        }
    }

}
