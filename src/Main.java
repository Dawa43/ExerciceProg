import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int max_int(int[][] valeurs){
        int max = valeurs[0][0];
        for ( int i = 0; i < valeurs.length; i++){
            for( int j = 0; j < valeurs[i].length; j++){
                if (max < valeurs[i][j]){
                    max = valeurs[i][j];
                }
            }
        }
        return max;
    }
    public static int[][] generateRandomSquareArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int)(Math.random() * 1000) + 1;
            }
        }
        return array;
    }

    public static void main(String[] args){

        int[][] array = generateRandomSquareArray(10);

        System.out.println(Arrays.deepToString(array));
        System.out.println(max_int(array));

    }
}