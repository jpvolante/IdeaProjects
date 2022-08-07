import java.util.Scanner;

public class Ex04 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Dinheiro: ");
        double n = Double.parseDouble(ler.nextLine());
        System.out.println("Chocolate: ");
        int c = Integer.parseInt(ler.nextLine());
        System.out.println("Embalagens: ");
        int m = Integer.parseInt(ler.nextLine());

        int i = 0;
        int trocaChocolate = 0;
        int quantidadeChocolates;

        if(n < 0 || c < 0 || m < 0){
            System.out.println("Erro");
        }
        else{
            quantidadeChocolates = ((int) (n / c));

            if(m >= quantidadeChocolates){
                while (i < m/quantidadeChocolates){
                    if(m % quantidadeChocolates == 0){
                        trocaChocolate++;
                    }
                    i++;
                }
                quantidadeChocolates = quantidadeChocolates + trocaChocolate;
            }
            System.out.println(quantidadeChocolates);
        }
    }
}
