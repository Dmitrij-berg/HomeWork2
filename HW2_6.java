package HomeWork2;

/**
 *�	C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ �� ��������� ����� ����� �� ������� [-5;5].
 * ������� ������ �� �����. ���������� � ������� �� ����� ������ ������ � ���������� �� ������ ������������� ���������.
 * ���� ����� ����� ���������, �� ������� ������ ������ ������������� �� ���.
 */

public class HW2_6 {

    int[][] mas(){
        int [][] m = new int[7][4];
        for(int i =0; i < m.length; i++){
            System.out.print("������ �"+i+" ");
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 11) - 5;
                System.out.print(m[i][j] + " ");
                if (j == m[i].length - 1)
                    System.out.println(" ");
            }
        }
        return  m;
    }

    void  prov(){
        int [][] m2 = mas();
        int [] m1 = new int[m2.length];
        int max = 0,max_i = 0;
        for(int i =0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                if(j == 0) m1[i] = m2[i][j];
                else m1[i] *= m2[i][j];
           }
        }
        for(int i = 0; i < m1.length; i++){
            if(Math.abs(m1[i]) > max){
                max = m1[i];
                max_i = i;
            }
        }
        System.out.println("������ � ���������� �� ������ ������������� ��������� ("+max+") ����� ������ - "+max_i);
    }



    public static void main(String[] args){
        HW2_6 k = new HW2_6();
         k.prov();
    }
}
