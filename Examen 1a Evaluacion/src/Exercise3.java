import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter how many even numbers you want to add: ");
        int num = inputValue.nextInt();
        int add = 0;
        int even = 2;

        for(int i = 0; i < num; i++){
            add += even;
            even += 2;
        }

        System.out.println(add);
    }
}