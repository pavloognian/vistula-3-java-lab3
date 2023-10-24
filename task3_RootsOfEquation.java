import java.util.Scanner;

public class task3_RootsOfEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float aNumber,bNumber,cNumber,discriminant ,x1,x2;
        int numberOfRoots = 0;

        System.out.println("Enter 'a' number: ");
        aNumber = Float.parseFloat(scanner.nextLine());
        if (aNumber==0){
            System.out.println("a is zero, impossible0");
        }
        else{
            System.out.println("Enter 'b' number: ");
            bNumber = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter 'c' number: ");
            cNumber = Float.parseFloat(scanner.nextLine());


            System.out.printf("[ %.0fx²+%.0fx+%.0f=0 ]%n",aNumber,bNumber,cNumber);
            discriminant = (float) (Math.pow(bNumber,2)-4*aNumber*cNumber);
            System.out.printf("Discriminant is: %.2f %n",discriminant);
            if (discriminant < 0) numberOfRoots=0;
            if (discriminant == 0) numberOfRoots=1;
            if (discriminant > 0) numberOfRoots=2;


            switch(numberOfRoots) {
                case 0:
                    System.out.println("There is no root");
                    break;
                case 1:
                    x1 = x2 = -bNumber/2*aNumber;
                    System.out.println("value of x1=x2 is: "+x1);
                    break;
                case 2:
                    x1 = (float) (-bNumber+Math.pow(discriminant,0.5))/(2*aNumber);
                    x2 = (float) (-bNumber-Math.pow(discriminant,0.5))/(2*aNumber);
                    System.out.printf("value of x1 is: %.2f %n",x1);
                    System.out.printf("value of x2 is: %.2f %n",x2);
                    break;
                default:
                    System.out.println("Something is wrong");

            }//3,4,5 homework
        }
    }
}
