package HomeWork2;

/**
 * 2. ���������� ����� � ���������� ������� ���������.
 �) 111000111;
 �) 100011011;
 3. ��������� �������� �����.
 �) 1110101010+10111001;
 �) 10111010+10010100;
 4. ��������� ��������� �����.
 �) 1000000100-101010001;
 �) 1010111101-111000010;
 */
public class HW2_2_3_4 {
    int obrab(String s) {
        int b = 0, n2 = 0, g = 0, ii = 0;
        for(int i = s.length(); i > 0; i--)
         {
            char  c = s.charAt(i-1);
            if(c == '1') g = 1;
            else g =0;
            n2 = (g * (int)Math.pow(2, ii));
            b = n2 + b;
            ii++;
        }
        return b;
    }
    public static void main(String[] args) {
        HW2_2_3_4 gov = new HW2_2_3_4();
        System.out.println("����� 111000111 � ���������� ������� = " + gov.obrab("111000111") + " ;");
        System.out.println("����� 100011011 � ���������� ������� = " + gov.obrab("100011011") + " ;");

        System.out.println("����� ����� 1110101010 + 10111001 = " + (gov.obrab("1110101010") + gov.obrab("10111001")) + " ;" );
        System.out.println("����� ����� 10111010 + 10010100 = " + (gov.obrab("10111010") + gov.obrab("10010100")) + " ;" );

        System.out.println("������� ����� 1000000100 - 101010001 = " + (gov.obrab("1000000100") - gov.obrab("101010001")) + " ;" );
        System.out.println("������� ����� 1010111101 - 111000010 = " + (gov.obrab("1010111101") - gov.obrab("111000010")) + " ;" );
    }
}
