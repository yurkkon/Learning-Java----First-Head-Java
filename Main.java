import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        reverse(array);

    }

    private static void reverse(int[] array){
        int[] notReversedArray = new int[array.length];
        System.arraycopy(array, 0, notReversedArray, 0, array.length);
        int index = 0;
        int count = array.length - 1;
        int temp;
        while (true){
            temp = array[count];
            array[count] = array[index];
            array[index] = temp;
            index++;
            count--;
            if (count - index == 1) break;
            if (count == index) break;
        }
        System.out.println("Array = " + Arrays.toString(notReversedArray));
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}