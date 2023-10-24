public class task5_TheBiggestAndSmallestNumberInSet {
    public static void main(String[] args) {
        int randomNumber,numberBiggest=0,numberSmallest=100;

        int counter=0;
        while (counter<10){
            randomNumber = (int)(Math.floor(Math.random() *(100 - 1 + 1) + 1));
            if (randomNumber > numberBiggest) numberBiggest = randomNumber;
            if (randomNumber < numberSmallest) numberSmallest = randomNumber;
            System.out.println(randomNumber);
            counter++;
        }
        System.out.println("The biggest number from loop is: "+numberBiggest);
        System.out.println("The smallest number from loop is: "+numberSmallest);
    }
}
