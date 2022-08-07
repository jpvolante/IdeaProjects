import java.util.Scanner;

public class Ex01 {

    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a quantidade de livros: ");
        int quantidadeLivros = Integer.parseInt(ler.nextLine());

        if(quantidadeLivros >= 100){
            System.out.println("Criterio A");

        } else if (quantidadeLivros <= 5 && quantidadeLivros > 0 || quantidadeLivros > 5 && quantidadeLivros < 20) {
            System.out.println("Criteiro B");

        } else if (quantidadeLivros >= 20) {
            System.out.println("Indiferente");

        } else if (quantidadeLivros < 0) {
            System.out.println("Erro");
        }
    }
}
