import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numberRange = new Scanner(System.in);
        System.out.println("Digite até qual camada deseja prolongar a sequencia Fibonacci");
       
        int range = numberRange.nextInt();
       
        System.out.println("==============================================================");


        int[] arrayFibonacci = new int[range];
       
        for (int i = 0; i < range; i++) {
            arrayFibonacci[i] = i;


            if (i > 1) {
                arrayFibonacci[i] = arrayFibonacci[i-1] + arrayFibonacci[i-2];
            }


            System.out.print(arrayFibonacci[i] + " ");
        }
    }
}
