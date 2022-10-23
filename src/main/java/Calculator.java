import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Calculator {
    public BigInteger n;
    public BigInteger wynik;

    Calculator(BigInteger n){
        this.n = n;
    }

    private BigInteger silnia(BigInteger x){
       BigInteger y=BigInteger.valueOf(1);
        for(BigInteger i= BigInteger.valueOf(2); i.compareTo(x)<=0; i = i.add(ONE)){
            y = y.multiply(i);
        }
        //System.out.println("silinia: " + x + " wynosi: " + y );
        return y;
    }

    public void liczba(){

        BigInteger sum=BigInteger.valueOf(0);
        for(BigInteger j= BigInteger.valueOf(3); j.compareTo(n)<=0; j = j.add(ONE)){
            sum = sum.add(silnia(j.subtract(TWO))).subtract( j.multiply( silnia(j.subtract(TWO)) . divide(j) ) );
            //System.out.println(sum);
        }
        wynik=sum.subtract(ONE);
    }

    public BigInteger kolejna(BigInteger n){
        BigInteger next=BigInteger.valueOf(0);

        if(n.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0)
            next = n.divide(TWO);
        else
            next =n.multiply(BigInteger.valueOf(3)).add(ONE);
        return next;
    }
}
