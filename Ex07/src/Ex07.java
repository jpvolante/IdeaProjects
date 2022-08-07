import java.util.Scanner;

public class Ex07 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Quilometragem: ");
        double x = Double.parseDouble(ler.nextLine());
        System.out.println("Padrao 1: ");
        double v1 = Double.parseDouble(ler.nextLine());
        System.out.println("Padrao 2: ");
        double v2 = Double.parseDouble(ler.nextLine());
        System.out.println("Quilometragem utilizada: ");
        double a = Double.parseDouble(ler.nextLine());

        double totalPago;

        if(a <= x){
            totalPago = v1 * a;
        } else {
            totalPago = v2 * a;
        }

        System.out.printf("%.2f", totalPago);
    }
}
