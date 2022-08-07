import java.util.Scanner;

public class Ex06 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Largura: ");
        double l = Double.parseDouble(ler.nextLine());
        System.out.println("Altura: ");
        double a = Double.parseDouble(ler.nextLine());
        System.out.println("Valor: ");
        double c = Double.parseDouble(ler.nextLine());
        System.out.println("Rendimento: ");
        double m = Double.parseDouble(ler.nextLine());
        double calculoArea = l * a;
        double latasNecessarias = Math.ceil(calculoArea/ m);
        double valorTotal = Math.ceil(latasNecessarias * c);
        System.out.println(latasNecessarias);
        System.out.printf("%.2f", valorTotal);

    }
}
