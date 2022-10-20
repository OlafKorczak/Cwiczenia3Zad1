package Zad2Korczak;
import java.util.Scanner;
public class Zad2Korczak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swój wzrost: ");
        float heightKorczak = scan.nextFloat();
        System.out.println("Podaj swoją wagę: ");
        float weightKorczak = scan.nextFloat();
        float wskaznikBMIKorczak = weightKorczak/(float)(Math.pow((heightKorczak/100), 2));
        if (wskaznikBMIKorczak <16.00)
        {
            System.out.println("Wygłodzenie, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 15.99 && wskaznikBMIKorczak < 16.99)
        {
            System.out.println("Wychudzenie, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 17.00 && wskaznikBMIKorczak < 18.49)
        {
            System.out.println("Niedowaga, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 18.50 && wskaznikBMIKorczak < 22.99)
        {
            System.out.println("Norma niski przedział, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 23.00 && wskaznikBMIKorczak < 24.99)
        {
            System.out.println("Norma wysoki przedział, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 25.00 && wskaznikBMIKorczak < 27.49)
        {
            System.out.println("Nadwaga niski przedział, twój wskażnik BMI to: "+wskaznikBMIKorczak);

        }
        else if(wskaznikBMIKorczak >27.50 && wskaznikBMIKorczak <29.99)
        {
            System.out.println("Nadwaga wysoki przedział, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 30 && wskaznikBMIKorczak <34.9)
        {
            System.out.println("Otyłość I stopnia, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 35 && wskaznikBMIKorczak < 39.9)
        {
            System.out.println("Otyłość II stopnia, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }
        else if(wskaznikBMIKorczak > 40)
        {
            System.out.println("Otyłość III stopnia, twój wskażnik BMI to: "+wskaznikBMIKorczak);
        }

    }
}
