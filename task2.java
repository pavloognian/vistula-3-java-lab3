import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height: ");
        float heightOgnianyk = Float.parseFloat(scanner.nextLine())/100;
        System.out.println("Enter your weight: ");
        float weightOgnianyk = Float.parseFloat(scanner.nextLine());

        float BMI = (float) (weightOgnianyk/Math.pow(heightOgnianyk,2));
        System.out.printf("Your BMI is: %.2f%n",BMI);


        if (BMI == 16.00){
            System.out.println("starvation");
        } else if (BMI>16.00 & BMI<=16.99) {
            System.out.println("emaciation");
        }
        else if (BMI>=17.00 & BMI<=18.49) {
            System.out.println("underweight");
        }
        else if (BMI>18.50 & BMI<=22.99) {
            System.out.println("normal, low range");
        }
        else if (BMI>23.00 & BMI<=24.99) {
            System.out.println("normal, high range");
        }
        else if (BMI>25.00 & BMI<=27.49) {
            System.out.println("overweight, low range");
        }
        else if (BMI>27.50 & BMI<=29.99) {
            System.out.println("overweight, high range");
        }
        else if (BMI>30 & BMI<=34.9) {
            System.out.println("1st degree obesity");
        }
        else if (BMI>27.50 & BMI<=39.9) {
            System.out.println("2st degree obesity");
        }
        else if (BMI==40) {
            System.out.println("3st degree obesity");
        }
        else{
            System.out.println("....");
        }
    }
}
