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
public class S03_17_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;

        switch (a) {
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            default:
                System.out.println("No se ha encontrado la opcion");
                break;

        }

        String b = "pantalón";

        switch (b) {
            case "polo":
                System.out.println("Estas comprando un polo");
                break;
            case "short":
                System.out.println("Estas comprando un short");
                break;
            case "Chompa":
                System.out.println("Estas comprando una chompa");
                break;
            default:
                System.out.println("No encontre la prenda");
                break;
        }
    }

}
