import java.text.Format;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        int idades = 0;
        int somaIdades = 0;
        int nroPessoas = 0;
        double mediaIdades = 0.0;
        int maiorIdade = 0;
        int pessoasIdosas = 0;
        double percentualIdosas;
        do{
            System.out.println("Digite as idades: ");
            idades = Integer.parseInt(ler.nextLine());
            somaIdades = somaIdades + idades;
            if(idades > 0) {
                nroPessoas++;
                if (idades >= 18 && idades < 75) {
                    maiorIdade++;
                }
                if (idades >= 75) {
                    pessoasIdosas++;
                    maiorIdade++;
                }
            }
        }while(idades > 0);

        mediaIdades = Math.round((double) somaIdades/nroPessoas);
        percentualIdosas =  (pessoasIdosas/(double)nroPessoas) * 100;

        System.out.println(mediaIdades);
        System.out.println(maiorIdade);
        System.out.println(percentualIdosas);

    }
}
