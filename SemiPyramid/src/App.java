import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numberPyramidRange = new Scanner(System.in);
        System.out.println("Digite até que camada deseja montar a semi piramide: ");


        int range = numberPyramidRange.nextInt();


        System.out.println("==============================================================");


        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
