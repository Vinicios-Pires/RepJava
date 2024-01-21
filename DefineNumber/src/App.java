import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numberInput = number.nextInt();

        if (numberInput > 0 && numberInput % 2 == 0) {
            System.out.println(numberInput + " " + "é par e positivo");
        } else if (numberInput > 0 && numberInput % 2 != 0) {
            System.out.println(numberInput + " " + "é ímpar e positivo");
        } else if (numberInput < 0 && numberInput % 2 == 0) {
            System.out.println(numberInput + " " + "é par e negativo");
        } else {
            System.out.println(numberInput + " " + "é ímpar e negativo");
        }
    }
}
