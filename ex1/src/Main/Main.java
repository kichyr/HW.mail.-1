package Main;

import java.util.Scanner;

/**
 * @author kichyr
 * @task Дан одномерный n массив. 
 * Необходимо вывести все четные числа (разделитель пробел), которые делятся на 3 без остатка. Например, дан массив 2, 6, 7, 12 вывод будет 6 12
 */
public class Main{

    public static void main(String[] args) {    
        int a[] = {1,3,6};
        for(int i =0 ; i < a.length; i++) {
            if(a[i]%3 == 0 && a[i]%2 == 0)
                System.out.println(a[i]);
        }
    }
    
}
