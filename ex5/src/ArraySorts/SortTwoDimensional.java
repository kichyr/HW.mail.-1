/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySorts;

public class SortTwoDimensional {
    public static int SortByMyRool(int[][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(i%2 == 0)
                count += SortOneDimensional.sortArray(a[i],-1);
            else
                count += SortOneDimensional.sortArray(a[i], 1);
        }
        return count;
    }
}
