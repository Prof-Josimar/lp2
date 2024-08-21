

import java.util.Locale;
import java.util.Scanner;

public class JurosCompostos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Ler os valores
        double c = 0; // capital
        double i = 0; // taxa em percentual (por exemplo, 5% deve ser inserido como 5.0)
        int t = 0; // tempo inteiro

        // Solicitar os dados ao usuário
        System.out.println("Digite o capital: ");
        c = sc.nextDouble();

        System.out.println("Taxa (%): ");
        i = sc.nextDouble();

        System.out.println("Tempo (em períodos):");
        t = sc.nextInt();

        // Calcular o montante usando a fórmula de juros compostos
        double m = c * Math.pow((1 + i / 100), t);

        // Calcular os juros, que é a diferença entre o montante e o capital inicial
        double j = m - c;

        // Exibir os resultados
        System.out.printf("Juros: %.2f%n", j);
        System.out.printf("Montante: %.2f%n", m);

        sc.close();
    }
}
