package HomeWork2;

import java.util.Scanner;

/**
 	�������� �����, ������� ��� ������� ����� n (��������� � ����������) ��������� ����� ����� �� 1 �� n;
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
        System.out.println("����� ����� �� 1 �� " + n + " ����� " + v.suma(n));
    }
}
