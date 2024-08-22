    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double c = 1000.0;
        double i = 10.0;
        double t = 3.0;
        double j = 0;
        /*
        Define 
        c como o capital inicial (R$ 1000.00), 
        i como a taxa de juros (10% ao ano), 
        t como o tempo em anos (3 anos), e 
        j para armazenar o valor dos juros simples.
         */

        j = c * (i / 100) * t;

        double m = c * (Math.pow((1 + i / 100), t));

        System.out.printf("Juros %.2f%n", j);
        System.out.printf("Monstante %.2f%n", m);

        entrada.close();
    }
