import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выбор фигуры: 1-круг, 2-точка: ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        System.out.println();
        switch(choose){
            case 1:
                System.out.print("Введите радиус = ");
                double radius = sc.nextDouble();
                System.out.println();
                System.out.print("Введите цвет = ");
                String color = sc.next();
                System.out.println();
                System.out.print("Фигура закрашена? - (1 - да, 0 - нет): ");
                boolean filled = sc.nextBoolean();
                System.out.print("Введите координату X = ");
                int x = sc.nextInt();
                System.out.println();
                System.out.print("Введите координату Y = ");
                int y = sc.nextInt();
                System.out.println();
                MovableCircle circle1 = new MovableCircle(x,y,radius,color,filled);
                System.out.println();
                System.out.print(circle1);
                System.out.println();
                while (true) {
                    System.out.print("Требуется сдвинуть круг? (1 - да, 2 - нет): ");
                    int choose3 = sc.nextInt();
                    System.out.println();
                    if (choose3==1){
                        System.out.print("Сдвинуть куда? (up,down,left,right): ");
                        String arrow3 = sc.next();
                        System.out.println();
                        switch (arrow3) {
                            case "up":
                                circle1.moveUp();
                                break;
                            case "down":
                                circle1.moveDown();
                                break;
                            case "left":
                                circle1.moveLeft();
                                break;
                            case "right":
                                circle1.moveRight();
                                break;
                        }
                        System.out.print(circle1);
                        System.out.println();
                    }
                    else {
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Введите координату X = ");
                int x1 = sc.nextInt();
                System.out.println();
                System.out.print("Введите координату Y = ");
                int y1 = sc.nextInt();
                System.out.println();
                System.out.print("Введите скорость X = ");
                int color2 = sc.nextInt();
                System.out.println();
                System.out.print("Введите скорость Y = ");
                int filled2 = sc.nextInt();
                System.out.println();
                MovablePoint point1 = new MovablePoint(x1,y1,color2,filled2);
                System.out.print(point1);
                System.out.println();
                while (true) {
                    System.out.print("Требуется сдвинуть точку? (1 - да, 2 - нет): ");
                    int choose2 = sc.nextInt();
                    System.out.println();
                    if (choose2==1){
                        System.out.print("Сдвинуть куда? (up,down,left,right): ");
                        String arrow = sc.next();
                        System.out.println();
                        switch (arrow) {
                            case "up":
                                point1.moveUp();
                                break;
                            case "down":
                                point1.moveDown();
                                break;
                            case "left":
                                point1.moveLeft();
                                break;
                            case "right":
                                point1.moveRight();
                                break;
                        }
                        System.out.print(point1);
                        System.out.println();
                    }
                    else {
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("Введите координату X1 = ");
                int x_r1 = sc.nextInt();
                System.out.println();
                System.out.print("Введите координату Y1 = ");
                int y_r1 = sc.nextInt();
                System.out.println();
                System.out.print("Введите координату X2 = ");
                int x_r2 = sc.nextInt();
                System.out.println();
                System.out.print("Введите координату Y2 = ");
                int y_r2 = sc.nextInt();
                System.out.println();
                System.out.print("Введите скорость X = ");
                int xSpeed = sc.nextInt();
                System.out.println();
                System.out.print("Введите скорость Y = ");
                int ySpeed = sc.nextInt();
                System.out.println();
                MovableRectangle rectangle = new MovableRectangle(x_r1,y_r1,x_r2,y_r2,xSpeed,ySpeed);
                System.out.print(rectangle);
                System.out.println();
                while (true) {
                    System.out.print("Требуется сдвинуть прямоугольник? (1 - да, 2 - нет): ");
                    int choose2 = sc.nextInt();
                    System.out.println();
                    if (choose2==1){
                        System.out.print("Сдвинуть куда? (up,down,left,right): ");
                        String arrow = sc.next();
                        System.out.println();
                        switch (arrow) {
                            case "up":
                                rectangle.moveUp();
                                break;
                            case "down":
                                rectangle.moveDown();
                                break;
                            case "left":
                                rectangle.moveLeft();
                                break;
                            case "right":
                                rectangle.moveRight();
                                break;
                        }
                        System.out.print(rectangle);
                        System.out.println();
                    }
                    else {
                        break;
                    }
                }
        }
    }
}