import java.util.Scanner;

public class Ex03 {
    public static void main(String[] Args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com lados do triângulo: ");
        int ano = Integer.parseInt(ler.nextLine());

        if (ano == 0 || ano < 0) {
            System.out.println("Erro");
        } else {
            if (ano % 400 == 0) {
                System.out.println("Ano bissexto");
            }
            else if (ano % 4 == 0 && ano % 100 != 0) {
                System.out.println("Ano bissexto");
            }
            else{
                    System.out.println("Ano nao bissexto");
                }
            }

        }
    }
