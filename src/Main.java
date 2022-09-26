import java.util.Scanner;
/**
 * <p><code>1.8.</code> <em style="color:red">Задокументуйте правильно програму. Виконайте Javadoc для файлу
 * та перегляньте результати за допомогою веб - браузера.
 * Перевірте отриману документацію за допомогою веб - браузера. </em></p>
 * <p><code>1.9.</code> <em style="color:green">Додайте список елементів HTML до документації.
 * Візьміть програму попередньоï вправи і додайте до неï документацію
 * з коментарями. Роз пакуйте цю документацію з коментарями у файл
 * HTML за допомогою Javadoc i перегляньте її у веб - браузері.</em></p>
 *
 * @author Dariia
 * @version 1.0 25/09/22
 */
public class  Main {
    private static String x;
    private static int y;
    private static char z;

    public static void main(String[] args) {
        /* 1.1 */
        System.out.println("---1.1---");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        /* 1.2 */
        System.out.println("---1.2---");
        System.out.println("Hello world!");

        /* 1.5 */
        System.out.println("---1.5---");
        input_output();

        /* 1.6 */
        System.out.println("---1.6---");
        sum();

        /* 1.7 */
        System.out.println("---1.7---");
        input_name();

        /* 2.2 */
        System.out.println("---2.2---");
        classes_and_harmonic_average();

        /* 2.3 */
        System.out.println("---2.3---");
        geometric_average();

        /* 2.4 */
        System.out.println("---2.4---");
        from_celsius_to_fahrenheit();
    }

    public static void input_output() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str;
        str = in.nextLine();
        System.out.println("Your string: " + str);

        System.out.println("Input integer: ");
        int num;
        num = in.nextInt();
        System.out.println("Your number: " + num);

        System.out.println("Input a string: ");
        String no_space;
        no_space = in.next();
        System.out.println("Your string before spase: " + no_space);
        in.close();
    }

    public static void sum(){
        Scanner in = new Scanner(System.in);
        float s = 0, var;
        do {
            var = in.nextFloat();
            s += var;
        }
        while (var != 0);

        System.out.println(s);
        in.close();
    }

    public static void input_name(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }

    public static void classes_and_harmonic_average(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int num1_n = (int) Math.log10(num1)+1;
        int num2_n = (int) Math.log10(num2)+1;
        float harmonic_average = (float) 2/((float) 1/num1 + (float) 1/num2);

        System.out.println("Number of classes: " + num1_n + ", " + num2_n);
        System.out.printf("Harmonic average: %.2f", harmonic_average);
    }

    public static void geometric_average(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        float num1 = Float.parseFloat(in.next());
        float num2 = Float.parseFloat(in.next());
        float geom_average = (float) Math.sqrt(num1 * num2);

        System.out.println("Harmonic average: ");
        System.out.format("%.3f\n", geom_average);
        System.out.format("%.3g", geom_average);
    }

    public static void from_celsius_to_fahrenheit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        float celsius = in.nextFloat();
        float fahrenheit = 9 * celsius/5 + 32;
        System.out.print("F = " + fahrenheit);
    }
}