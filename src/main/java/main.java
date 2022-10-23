import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main (String[] args){



        if(args[0].matches("[0-9]+")) {

            System.out.println("Zadanie 1");
            System.out.print("Dla argumentu: " + args[0] + " uzyskujemy: ");
            //int n = Integer.parseInt(args[0]);
            BigInteger n = new BigInteger(args[0]);
           Calculator calculator = new Calculator(n);
            calculator.liczba();
            System.out.println(calculator.wynik + "\n\n");


            System.out.println("Zadanie 2");
            BigInteger next= BigInteger.valueOf(0);
            BigInteger now = calculator.n;
            int licznik = 0;
            do {
                licznik++;
                next = calculator.kolejna(now);
                System.out.print(now);
                if(now.remainder(BigInteger.TWO).compareTo(BigInteger.valueOf(0))==0)
                    System.out.print(", parzysta ,");
                else
                    System.out.print(", nieparzysta ,");
                System.out.println(next);
                now=next;


            }while(licznik<1000 && !now.equals(1) && now.compareTo(BigInteger.valueOf(0))==-1);
            if(now.compareTo(BigInteger.valueOf(0))<0) System.out.println("Liczba przekroczyla zakres ");
        }
        else
            System.out.println("Dane wejsciowe nie sa liczba.");

    }
}
