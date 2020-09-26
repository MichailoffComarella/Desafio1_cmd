/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insidersdesafio1_cmd;

/**
 *
 * @author Sony
 */
public class InsidersDesafio1_cmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Opção 1: ");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10");
        
        System.out.println(" ");
        
        System.out.println("Opção 2: ");
        StringContar contar = new StringContar();
        System.out.println(contar.getNumeros());
         
    }
    
}
