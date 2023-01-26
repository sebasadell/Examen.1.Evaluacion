import java.util.Scanner;

public class PasswordMain {
    public static void main(String[] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter the number of passwords you want to create: ");
        int num = inputValue.nextInt();
        Password[] passArray = new Password[num];
        boolean[] boolArray = new boolean[num];

        System.out.println("Enter the length of the passwords: ");
        int length = inputValue.nextInt();

        for(int i = 0; i < num; i++){
            passArray[i] = new Password(length);
            boolArray[i] = passArray[i].esFuerte();
            System.out.println(passArray[i].getPassword() + " " + boolArray[i]);
        }
    }
}