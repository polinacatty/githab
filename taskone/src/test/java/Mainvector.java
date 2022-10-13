import java.util.Scanner;

public class Mainvector{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты вектора а: координата x = ");
        double x = sc.nextDouble();
        System.out.println(" координата y = ");
        double y = sc.nextDouble();
        System.out.println(" координата z = ");
        double z = sc.nextDouble();
        System.out.println("Введите координаты вектора b: координата x = ");
        double a = sc.nextDouble();
        System.out.println(" координата y = ");
        double b = sc.nextDouble();
        System.out.println(" координата z = ");
        double c = sc.nextDouble();
        Vector vectora = new Vector(x, y, z);
        Vector vectorb = new Vector(a, b, c);
        System.out.println("Длина вектора a - " + vectora.length());
        System.out.println("Длина вектора b - " + vectorb.length());
        System.out.println("Скалярное произведение векторов а и b: (a,b) = " + vectora.scalarProduct(vectorb));
        Vector crossVector = vectora.crossProduct(vectorb);
        System.out.println("Векторное произведение векторов a и b: [a,b] = (" + crossVector.x + ", " + crossVector.y + ", " + crossVector.z + ")");
        System.out.println("Угол между векторами а и b: cos(a^b) =" + vectora.cos(vectorb));
        Vector addVector = vectora.add(vectorb);
        System.out.println("Сумма векторов а и b: a + b = (" + addVector.x + ", " + addVector.y + ", " + addVector.z + ")");
        Vector subtractVector = vectora.subtract(vectorb);
        System.out.println("Разность векторов а и b: a - b = (" + subtractVector.x + ", " + subtractVector.y + ", " + subtractVector.z + ")");
        if (vectora.equals(vectorb)) {
            System.out.println("Векторы равны");
        }
        else {
            System.out.println("Векторы не равны");
        }

    }
}
