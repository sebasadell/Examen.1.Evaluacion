import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        int index = 100;

        while(index < 0 || index > array.length){
            System.out.println("Enter a number: ");
            index = inputValue.nextInt();
        }

        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = index;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
