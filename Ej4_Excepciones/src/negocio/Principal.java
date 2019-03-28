/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionControlVector  {
        // TODO code application logic here
        int tam=0, pos;
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Ingrese el tamaño del vector");
        tam = in.nextInt();
        }catch(java.util.InputMismatchException e) {

           System.out.println("Debe inbresar un valor Entero");
           System.out.println(e.getMessage());
//            throw new ExcepcionControlVector(3);
        }
            
        
        try {
            if (tam <= 0) {
                throw new ExcepcionControlVector(1);
            } else {
                int vec[];
                vec = new int[tam];

                vec = new int[tam];
                for (int i = 0; i < vec.length; i++) {
                    vec[i] = (int) (Math.random() * 10 + 1);
                }

                for (int i = 0; i < vec.length; i++) {
                    System.out.println("valor posicion " + i + "-" + vec[i]);

                }

                System.out.println("Ingrese Posicion que desea saber: ");
                pos = in.nextInt();
                if (pos < 0 || pos >= tam) {
                    throw new ExcepcionControlVector(2);
                } else {
                    System.out.println("Valor en la posición [" + pos + "] = " + vec[pos]);
                }
            }

        } catch (ExcepcionControlVector e) {
            System.out.println(e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Debe inbresar un valor Entero");
            System.out.println(e.getMessage());
//                throw new ExcepcionControlVector(3);
                
        } finally {
            System.out.println("FIN DEL PROGRAMA");
        }

    }

}
