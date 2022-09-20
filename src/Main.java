import java.util.Scanner;

public class Main {
    public static class Baku{

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b= scanner.nextDouble();
//        UnaryOperator unaryOperator=a -> System.out.println(Math.sqrt(a));
//        unaryOperator.sqrt(b);

        UnaryOperator unaryOperator= a -> {
            System.out.println(a);
        };

    }
}
@FunctionalInterface
interface UnaryOperator{
     void sqrt(double a);
}