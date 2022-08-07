import java.util.Scanner;

public class Ex05 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Limite de velocidade: ");
        int limite = Integer.parseInt(ler.nextLine());
        System.out.println("Valor multa: ");
        double multa = Double.parseDouble(ler.nextLine());
        System.out.println("Valor adicional: ");
        double varlorAdicional = Double.parseDouble(ler.nextLine());
        System.out.println("Velocidade captada: ");
        int velocidadeCaptada = Integer.parseInt(ler.nextLine());

        double totalMulta = 0;
        int acrescimo = velocidadeCaptada - limite;
        if(velocidadeCaptada > limite){
            totalMulta = multa + (varlorAdicional * acrescimo);
        }
        System.out.printf("%.2f",totalMulta);

    }
}
