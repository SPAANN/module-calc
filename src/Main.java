import java.util.Scanner;

public class Main {
class chx{
    static boolean x = true;
}
        public static void main(String[] args) {
                while (chx.x) {
            resh();
        }
    }

    public static void resh(){

        Scanner s = new Scanner(System.in);
        System.out.println("Введите 1 число");
        double n1 = s.nextInt();
        System.out.println("Введите 2 число");
        double n2 = s.nextInt();

        System.out.println("Что будем делать?\n + - складывать \n - - вычитать \n * - умножать \n / - делить \n ** - решать квадратное уравнение\n");
        String a = s.next();

            if (a.equals("**") | a.equals("5")) {

                System.out.println("Решаем квадратное уравнение! Введите коэффицент C");
                double n3 = s.nextInt();
                System.out.println(kur(n1, n2, n3));

            } else if (a.equals("+") | a.equals("1")) {
                System.out.println(n1 + "+" + n2 + "=" + sl(n1, n2));
            } else if (a.equals("-") | a.equals("2")) {
                System.out.println(n1 + "-" + n2 + "=" + vc(n1, n2));
            } else if (a.equals("/") | a.equals("4")) {
                System.out.println(n1 + "/" + n2 + "=" + del(n1, n2));
            } else if (a.equals("*") | a.equals("3")) {
                System.out.println(n1 + "*" + n2 + "=" + umn(n1, n2));
            }

            System.out.println("Продолжаем? 1 - Да, 2 - Нет");
            String pr = s.next();
        chx.x = pr.equals("Да") | pr.equals("да") | pr.equals("1");
        }


    public static double sl(double a, double b)
    {
        return a + b;
    }

    public static double vc(double a, double b)
    {
        return a - b;
    }

    public static double del(double a, double b)
    {
        return a / b;
    }

    public static double umn(double a, double b)
    {
        return a * b;
    }

    public static String kur(double a, double b, double c)
    {
        double d = b*b - (4*a*c);
        String otv;
        if (d > 0)
        {
            double x1 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            System.out.println(d);
            otv = ("x1 = " + x1 + "\nx2 = " + x2);
        } else if (d == 0){
            double x = (-1)*b/(2*a);
            otv = ('x' + "=" + x);
        } else {
            otv = ("Нет корней.");
        }

        return otv;
    }

    }
