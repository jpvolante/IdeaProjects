import java.util.Scanner;

public class Ex08 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        String dados = ler.nextLine();
        String dadosSeparados[] = dados.split(" ");
        int limoes = Integer.parseInt(dadosSeparados[0]);
        int primeiroCentavo = Integer.parseInt(dadosSeparados[1]);

        int total = 0;

        int i = 0;
        int j = 0;

            while (j < limoes){
                total = total + primeiroCentavo;
                if(primeiroCentavo > 1) {
                    primeiroCentavo--;
                }
                j++;
            }

        System.out.println(total);
    }
}
