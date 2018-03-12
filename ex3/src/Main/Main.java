package Main;

import java.util.Random;
/**
 *@task Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)
 * @author kichyr
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(1000);
        SumNumbers summerNumbers = new SumNumbers();
        //вывод N
        System.out.println(N);
        //вывод суммы цифр
        System.out.println(summerNumbers.countSumofNumbers(N));
    }
    
    
}
