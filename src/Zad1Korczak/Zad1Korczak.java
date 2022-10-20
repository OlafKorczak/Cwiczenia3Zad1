
package Zad1Korczak;
import java.util.Scanner;
public class Zad1Korczak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        float firstNumberKorczak = scan.nextFloat();
        System.out.println("Podaj drugą liczbę: ");
        float secondNumberKorczak = scan.nextFloat();
        float sumaKorczak = firstNumberKorczak + secondNumberKorczak;
        float roznicaKorczak = firstNumberKorczak-secondNumberKorczak;
        float iloczynKorczak = firstNumberKorczak * secondNumberKorczak;
        float ilorazKorczak = firstNumberKorczak/secondNumberKorczak;
        System.out.printf("Suma tych liczb to: %.2f %n",sumaKorczak);
        System.out.printf("Różnica tych liczb to: %.2f %n",roznicaKorczak);
        System.out.printf("Iloczyn tych liczb to: %.2f %n",iloczynKorczak);
        System.out.printf("Iloraz tych liczb to: %.2f %n",ilorazKorczak);

    }
}
