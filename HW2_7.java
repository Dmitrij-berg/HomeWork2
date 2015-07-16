package HomeWork2;

import java.util.Scanner;

/**
 	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class HW2_7 {
    int suma(int x){
        int s;
        if(x == 1) return 1;
        s = suma(x - 1) + x;
        return s;
    }
    public static void main(String[] args) {
        int n = 0;
        HW2_7 v = new HW2_7();
        Scanner d = new Scanner(System.in);
        n = d.nextInt();
        System.out.println("Сумма чисел от 1 до " + n + " равна " + v.suma(n));
    }
}
