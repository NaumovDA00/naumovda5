package N51;

import java.util.Scanner;
public class Areas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        if (shape.equals("triangle")) {
            RightTriangle right = new RightTriangle();
            double RArea = right.Compute(10, 20);
            System.out.println("The area of the Triangle is " + RArea);
        } else if (shape.equals("circle")) {
            Circle c = new Circle();
            double TArea = c.Compute(10, 20);
            System.out.println("The area of the Circle is " + TArea);
        } else if (shape.equals("square")) {
            Square s = new Square();
            double SArea = s.Compute(10, 20);
            System.out.println("The area of the Square is " + SArea);
        }
    }
}
