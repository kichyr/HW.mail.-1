/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

public class Sort_Two_Dimensional {
    public static int SortByMyRool(int[][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(i%2 == 0)
                count += mySimpleSort.sortItbyAscending(a[i]);
            else
                count += mySimpleSort.sortItbyDowngrate(a[i]);
        }
        return count;
    }
}
