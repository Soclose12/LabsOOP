import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
    private double calcA(double x, double y, double z) {
        return (2*Math.cos(x-3.14/6))/(1/2+Math.pow(Math.sin(y),2));
    }
    private double calcB(double x, double y, double z) {
        return 1+(Math.pow(z,2)/(3+Math.pow(z,2)/5));
    }
    private void run() {
        System.out.println("Введіть число x=");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        System.out.println("Введіть число y=");
        double y = s.nextDouble();
        System.out.println("Введіть число z=");
        double z = s.nextDouble();
        double a = calcA(x, y, z);
        double b = calcB(x, y, z);
        print(x, y, z, a, b);
    }
    private void print(double x, double y, double z, double a, double b) {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("============");
    }
}
