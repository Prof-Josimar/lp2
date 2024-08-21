



import java.util.Locale;
import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // ler
        double c = 0; // capital
        double i = 0; // taxa / 100
        int t = 0; // tempo  inteiro

        // calcular
        double j = 0; // juros
        double m = 0; // montante

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o capital : ");
        c = sc.nextDouble();

        System.out.println("Taxa ? ");
        i = sc.nextDouble();


        System.out.println("Tempo :");
        t = sc.nextInt();

        j = (c * i * t) / 100;
        m = c + j;
        System.out.printf("Juros : %.2f%n", j);
        System.out.printf("Montante : %.2f%n", m);
        sc.close();

    }


}
