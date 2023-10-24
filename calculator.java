import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumberOgnianyk = scanner.nextLine();
        String secondNumberOgnianyk = scanner.nextLine();

        int firstNumberOgnianykInt = Integer.parseInt(firstNumberOgnianyk);
        int secondNumberOgnianykInt = Integer.parseInt(secondNumberOgnianyk);

        System.out.println("---------------------------------------------------");
        System.out.println("First number is: "+firstNumberOgnianykInt);
        System.out.println("Second number is: "+secondNumberOgnianykInt);
        System.out.println("---------------------------------------------------");

        System.out.println("Summation: "+(firstNumberOgnianykInt+secondNumberOgnianykInt));
        System.out.println("Subtraction: "+(firstNumberOgnianykInt-secondNumberOgnianykInt));
        System.out.println("Multiplication: "+(firstNumberOgnianykInt*secondNumberOgnianykInt));
        System.out.println("Division: "+(firstNumberOgnianykInt/secondNumberOgnianykInt));
        System.out.println("---------------------------------------------------");

    }
}
