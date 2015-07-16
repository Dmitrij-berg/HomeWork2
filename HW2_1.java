package HomeWork2;

/**
 1. Переведите числа из десятичной системы счисления в двоичную, восьмеричную и шестнадцатеричную системы счисления.
 а) 949;
 б) 763;
 */


public class HW2_1 {

    String per_h(String c, int m){
        int n = 0, pr = 0;
        String n1 = "";
        char nn = '\u0000';
        if(m == 16){
            pr = preob(c);
            while(pr != 0){
                n = pr % m;
                switch(n){
                    case 0 : nn = '0'; break;
                    case 1 : nn = '1'; break;
                    case 2 : nn = '2'; break;
                    case 3 : nn = '3'; break;
                    case 4 : nn = '4'; break;
                    case 5 : nn = '5'; break;
                    case 6 : nn = '6'; break;
                    case 7 : nn = '7'; break;
                    case 8 : nn = '8'; break;
                    case 9 : nn = '9'; break;
                    case 10 : nn = 'A'; break;
                    case 11 : nn = 'B'; break;
                    case 12 : nn = 'C'; break;
                    case 13 : nn = 'D'; break;
                    case 14 : nn = 'E'; break;
                    case 15 : nn = 'F'; break;
                }
                n1 = nn + n1;
                pr /= m;
            }
        }
        return n1;
    }

    int dou_oct(String c, int m){
        int n = 0, pr = 0, n2 = 0;
        String n1 = "";
        char nn = '\u0000';
        if(m == 2 | m == 8 ){
            pr = preob(c);
            while(pr != 0){
                n = pr % m;
                n1 = n + n1;
                pr /= m;
            }
            n2 = preob(n1);
        }
        return n2;
    }

    int preob(String a){
        int b = 0, g = 0, hh = 0,ii = 1;
        char s;
        for(int w = 0; w < a.length()-1; w++ ){
            ii *= 10;
        }
        for(int i = 0; i < a.length(); i++)
        {
            s = a.charAt(i);
            if(s == '0') g=0;
            if(s == '1') g=1;
            if(s == '2') g=2;
            if(s == '3') g=3;
            if(s == '4') g=4;
            if(s == '5') g=5;
            if(s == '6') g=6;
            if(s == '7') g=7;
            if(s == '8') g=8;
            if(s == '9') g=9;
            hh = g * (ii);
            ii = ii / 10;
            b = b  + hh ;
        }
        return b;
    }


    public static void main(String[] args) {
        HW2_1 gg = new HW2_1();

        System.out.println(gg.dou_oct("949", 2));
        System.out.println(gg.dou_oct("949", 8));
        System.out.println(gg.per_h("949", 16));

        System.out.println(gg.dou_oct("763", 2));
        System.out.println(gg.dou_oct("763", 8));
        System.out.println(gg.per_h("763", 16));
    }

}
