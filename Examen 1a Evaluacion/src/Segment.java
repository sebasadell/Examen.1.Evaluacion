public class Segment {
    private Point startPoint, endPoint;

    public Segment(Point startPoint, Point point) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }


    public double module() {
        int sideA = endPoint.getX() - startPoint.getX();
        int sideB = endPoint.getY() - startPoint.getY();
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }


    public String toString() {
        return startPoint.toString() + " - " + endPoint.toString();
        // You can do thi too:
        // return startPoint + " - " + endPoint;
    }

    public void setOffset(int offX, int offY) {
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }


    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
}