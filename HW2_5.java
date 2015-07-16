package HomeWork2;

/**
    Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
    Вывести массив на экран.
 */
public class HW2_5 {

    void massiv(){
        int[][] m = new int[8][5];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = (int)(Math.random()*90) + 10;
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
        public static void main(String[] args) {
        HW2_5 g = new HW2_5();
            g.massiv();
        }
}
