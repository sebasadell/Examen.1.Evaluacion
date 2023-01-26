import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args){
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = inputValue.nextDouble();

        System.out.println("Area: " + Circulo.calcularArea(radius));
        System.out.println("Length: " + Circulo.calcularLongitud(radius));

        Circulo circle = new Circulo(10);
        System.out.println("Area: " + circle.calcularArea());
        System.out.println("Length: " + circle.calcularLongitud());
    }
}
