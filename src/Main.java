import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N < 49) {

            N = N + 2;
            System.out.println(N);

            if (N >= 49) {
                System.out.print("O valor digitado é/foi excedido");
                break;
            }
        }
    }
}
