package HomeWork2;

/**
 �������� �� ����� ������ 11 ������ ������������������ ���������.
 ����������, ��� ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.
 */
public class Fibo {
    int n1 = 1, n2 = 1, sum = 0, i = 3;
    int fibonachi(int x){
        if(x == 1) return x ;
        if (i <= x){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum ;
            System.out.println(sum + " ");
        }
        fibonachi(x - 1);
        return sum ;
    }
    public static void main (String[] args){
        System.out.println(1);
        System.out.println(1);
        Fibo f = new Fibo();
        f.fibonachi(11);
    }
}
