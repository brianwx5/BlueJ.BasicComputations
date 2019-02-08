 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger n = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            if(value == 0) {
                n = n;
            }
          n = n.multiply(BigInteger.valueOf(i));
        
} return n;
}
}