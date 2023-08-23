import graphics.*;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
Circle obj1 = new Circle();
Rectangle obj2 = new Rectangle();
Square obj3 = new Square();
Triangle obj4 = new Triangle();
System.out.println("Choose any 1)Circle 2)Rectangle 3)Square 4)Triangle:");
choice = sc.nextInt();
switch (choice) {
case 1:
obj1.area();
break;
case 2:
obj2.area();
break;
case 3:
obj3.area();
break;
case 4:
obj4.area();
default:
break;}} }
