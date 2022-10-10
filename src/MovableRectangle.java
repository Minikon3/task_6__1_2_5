public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isEquSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle: topLeft: x = " + topLeft.x + ", y = "+ topLeft.y+ ", bottomRight: x = " + bottomRight.x + ", y = " + bottomRight.y + ", xSpeed = " + topLeft.xSpeed + ", ySpeed = " + topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        if(!isEquSpeed()){
            System.out.println("Скорости точек не совпадают - движение не является возможным");
            System.exit(1);
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if(!isEquSpeed()){
            System.out.println("Скорости точек не совпадают - движение не является возможным");
            System.exit(1);
        }
        topLeft.moveDown();
        bottomRight.moveDown();

    }

    @Override
    public void moveLeft() {
        if(!isEquSpeed()){
            System.out.println("Скорости точек не совпадают - движение не является возможным");
            System.exit(1);
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();

    }

    @Override
    public void moveRight() {
        if(!isEquSpeed()){
            System.out.println("Скорости точек не совпадают - движение не является возможным");
            System.exit(1);
        }
        topLeft.moveRight();
        bottomRight.moveRight();

    }
}