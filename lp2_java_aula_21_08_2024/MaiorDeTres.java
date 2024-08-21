

import java.util.Scanner;

public class MaiorDeTres {

    
        public static void main(String[] args) {
			
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero : ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero : ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero : ");
        int n3 = sc.nextInt();
        
        if (n1 > n2 && n1 > n2) {
            System.out.println("n1 é maior " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 é maior " + n2);
        } else {
            System.out.println("n3 é maior " + n3);
        }

        sc.close();

    }


    
}
