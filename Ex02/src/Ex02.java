import java.util.Scanner;

public class Ex02 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com lados do triângulo: ");
        String todosLados = ler.nextLine();
        String lado[] = todosLados.split(" ");

        int ladoA = Integer.parseInt(lado[0]);
        int ladoB = Integer.parseInt(lado[1]);
        int ladoC = Integer.parseInt(lado[2]);

        if(ladoA < 0 || ladoB < 0 || ladoC < 0){
            System.out.println("Erro");
        } else {

            boolean somaLados1 = Integer.parseInt(lado[0]) + Integer.parseInt(lado[1]) > Integer.parseInt(lado[2]);
            boolean somaLados2 = Integer.parseInt(lado[2]) + Integer.parseInt(lado[0]) > Integer.parseInt(lado[1]);
            boolean somaLados3 = Integer.parseInt(lado[1]) + Integer.parseInt(lado[2]) > Integer.parseInt(lado[0]);

            if(somaLados1 == false || somaLados2 == false || somaLados3 == false){
                System.out.println("Nao forma triangulo");
            }
            else if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Equilatero");
            }
            else if(ladoA == ladoB || ladoA == ladoC){
                System.out.println("Isosceles");
            }
            else if (ladoA < 0 || ladoB < 0 || ladoC < 0) {
                System.out.println("Erro");
            }
        }

    }
}
