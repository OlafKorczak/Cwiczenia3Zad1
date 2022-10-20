package Zad3Korczak;
import java.util.Scanner;
public class Zad3Korczak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a: ");
        float aKorczak = scan.nextFloat();
        if(aKorczak==0)
            do {
                System.out.println("Za a wybrano 0, błąd");
                System.out.println("Podaj a: ");
                aKorczak = scan.nextFloat();
            }while(aKorczak==0);
        System.out.println("Podaj b: ");
        float bKorczak = scan.nextFloat();
        System.out.println("Podaj c: ");
        float cKorczak = scan.nextFloat();
        float deltaKorczak = (float)(Math.pow(bKorczak,2) - (4*aKorczak*cKorczak));


        int warunekKorczak = 0;
        if(deltaKorczak>0)
        {
            warunekKorczak = 1;
        }
        else if(deltaKorczak==0)
        {
            warunekKorczak = 0;
        }
        else if(deltaKorczak < 0)
        {
            warunekKorczak = 2;
        }

        switch(warunekKorczak)
        {
            case 0:
            {
                float x1Korczak = (float)(Math.sqrt(deltaKorczak))/(2*aKorczak);
                System.out.printf("Pierwiastkiem tego równania jest: %.2f %n",x1Korczak);
                break;
            }
            case 1:
            {
                float x1Korczak = (float)(Math.sqrt(deltaKorczak))/(2*aKorczak);
                float x2Korczak = (float)-(Math.sqrt(deltaKorczak))/(2*aKorczak);
                System.out.printf("x1 = %.2f,%n",x1Korczak);
                System.out.printf("x2 = %.2f %n",x2Korczak);
                break;
            }
            case 2:
            {
                System.out.println("To równanie nie ma żadnego pierwiastka, ponieważ delta < 0");
                break;
            }

            default:
            {
                break;
            }
        }
    }
}
