/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class SumNumbers {
    private int sum;
    public int countSumofNumbers(int N){
        sum = 0;
        return countSum(N);
    }
    //Рекурсивный метод поиска суммы
    private int countSum(int N) {
        if(N == 0) return 0;
        else {
            sum +=N%10;
            N /= 10;
            countSum(N);
            return sum;
        }
    }
}
