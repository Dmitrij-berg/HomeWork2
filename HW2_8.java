package HomeWork2;

import java.util.Scanner;

/**
 	�������� ���, ������� ������� ��� ������� �����(������, ��� ����� ������� �����)
    �� ��������� �� 2��n (��������� � ����������). ��������� ������ ����: 2,3,5,7 ...
 */
public class HW2_8 {
    int  pros(int x){
        int s = 0, m = 2, i = 2;
        if(x == 1) return 1;
            for(; i < x; i++)  {
                if((x % i) != 0){
                m ++;
                }
            }
        if(m == i){
            System.out.println("������� ����� " + x);
        }
        s = pros(x - 1)   ;
        return s;
    }
    public static void main(String[] args) {
        int n = 0;
        HW2_8 p = new HW2_8();
        Scanner d = new Scanner(System.in);
        n = d.nextInt();
        p.pros(n);
    }
}
