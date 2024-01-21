import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numberMultiplicado = new Scanner(System.in);

        System.out.println("Digite qual tabuada você deseja: ");

        int multiplicado = numberMultiplicado.nextInt();

        System.out.println("==============================================================");

        for (int i = 0; i < 11; i++) {
            System.out.println(multiplicado + " x " + i + " = " + (multiplicado * i));
        }
    }
}
