public class task4_SummaryOfEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i=2;i<=100;i+=2){
            sum+=i;
        }
        System.out.println("Summation of even numbers from 1 to 100 is: "+ sum);
    }
}
