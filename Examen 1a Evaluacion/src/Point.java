public class Point {
    private int x;
    private int y;
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void imprimirPunto() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setOffset(int offsetX, int offsetY) {
        x += offsetX;
        y += offsetY;
    }

    public static double distance(Point p1, Point p2) {
        int distx=p1.getX()-p2.getX();
        int disty=p1.getY()-p2.getY();
        double s= Math.sqrt(Math.pow(distx,2)+Math.pow(disty,2));

        return s;
    }
}
