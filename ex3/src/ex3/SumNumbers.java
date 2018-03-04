/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

public abstract class SumNumbers {
    //Переменная суммы (при повторном вызове необходимо обнулять)
    public static int sum = 0;
    //Рекурсивный метод поиска суммы
    public static int countSum(int N) {
        if(N == 0) return 0;
        else {
            sum +=N%10;
            N /= 10;
            countSum(N);
            return sum;
        }
    }
}
