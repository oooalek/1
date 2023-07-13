import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("привет");
        int[] array = new int[]{1, 3, 4, 5, 67, 87, 8, 765, 6, 5, 89, 890, 43};
        int max = array[3];
        int min = array[1];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];


            }
            if (array[j] < min) {
                min = array[j];
            }




        }
        System.out.print("MIN ");
        System.out.println(min);

        System.out.print("Max ");
        System.out.println(max);
    }
}