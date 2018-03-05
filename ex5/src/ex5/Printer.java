/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author kichyr
 */
public class Printer {
    public static void print2Dimensional(int[][] a){
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
