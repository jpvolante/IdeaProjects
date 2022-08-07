import java.util.Scanner;

public class Ex10 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Posicao canguru 1: ");
        int x1 = Integer.parseInt(ler.nextLine());
        System.out.println("Distancia do pulo, canguru 1: ");
        int v1 = Integer.parseInt(ler.nextLine());

        System.out.println("Posicao canguru 2: ");
        int x2 = Integer.parseInt(ler.nextLine());
        System.out.println("Distancia do pulo, canguru 2: ");
        int v2 = Integer.parseInt(ler.nextLine());

        int reta1 = x1 + v1;
        int reta2 = x2 + v2;

        if(x1 == 0){
            reta1 = reta1 + x1 + v1;
        }
        if(x2 == 0){
            reta2 = reta2 + x2 + v2;
        }
        if (reta1 == reta2){
            System.out.println("SIM");
        }else {
            System.out.println("NAO");
        }
    }
}
