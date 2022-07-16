import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar,kg, arm=2.14, elm=3.67, dom=1.11, muz=0.95, pat=5;
        System.out.print("Kac kila armut:");
        double armkg = input.nextDouble();
        System.out.print("Kac kila elma:");
        double elmkg = input.nextDouble();
        System.out.print("Kac kila domates:");
        double domkg = input.nextDouble();
        System.out.print("Kac kila muz:");
        double muzkg = input.nextDouble();
        System.out.print("Kac kila patlican:");
        double patkg = input.nextDouble();
        tutar = armkg * arm + elmkg * elm+ domkg * dom + muzkg * muz + patkg * pat;
        System.out.println("Total hesap " + tutar);


    }
}