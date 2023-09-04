import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, alan, aci, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");

        r = inp.nextDouble();

        System.out.print("Dairenin dilimi açısını giriniz : ");

        aci = inp.nextDouble();

        alan = r*r*pi*(aci/360);

        System.out.println("Dairenin dilimi alanı = " + alan);


    }
}
