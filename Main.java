import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(findMin(readElements(readInteger())));

    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int NumberOfElements){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[NumberOfElements];
        for( int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        for (int i = 1; i <= array.length - 1; i++){
            if (array[i - 1] < array[i]){
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;

            }
        }
        return array[array.length - 1];
    }

}