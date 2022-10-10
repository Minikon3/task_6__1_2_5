public class MovableCircle implements Movable{
    private int x;
    private int y;
    private double radius;
    String color;
    boolean filled;
    MovableCircle(int x,int y,double radius,String color,boolean filled){
        this.radius=radius;
        this.x=x;
        this.y=y;
        this.color=color;
        this.filled=filled;
    }
    @Override
    public void moveUp() {
        this.x=x+1;
    }

    @Override
    public void moveDown() {
        this.x=x-1;
    }

    @Override
    public void moveLeft() {
        this.y=y-1;
    }

    @Override
    public void moveRight() {
        this.y=y+1;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (3.14*Math.pow(radius,2));
    }
    public double getPerimeter() {
        return (3.14*2*radius);
    }

    public int getX() {
        return x;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return  "Характеристики круга: площадь - "+getArea()+"; периметр - "+getPerimeter()+"; X = "+getX()+"; Y = "+getY()+"; цвет - "+getColor()+"; закрашен - "+isFilled();
    }

    public void getCoordinates() {
        System.out.print("X="+getX()+"; Y="+getY());
    }

}
