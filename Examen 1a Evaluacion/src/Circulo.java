public class Circulo {
    private double radio;

    public Circulo(){
        radio = 1;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(Segment segment){
        radio = segment.module();
    }

    public double calcularArea(){
        double area = radio * Math.pow(Math.PI, 2);
        return area;
    }

    public double calcularLongitud(){
        double longitud = 2 * Math.PI * radio;
        return longitud;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public static double calcularArea(double radio) {
        double area = radio * Math.pow(Math.PI, 2);
        return area;
    }

    public static double calcularLongitud(double radio){
        double longitud = 2 * Math.PI * radio;
        return longitud;
    }
}