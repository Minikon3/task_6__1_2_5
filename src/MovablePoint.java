public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(int x, int y,int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "Характеристики точки: X = "+getX()+"; Y = "+getY()+"; Скорость X = "+getxSpeed()+"; Скорость Y = "+getySpeed();
    }

    public void getCoordinates() {
        System.out.print("X="+getX()+"; Y="+getY());
    }

}
