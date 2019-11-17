

import java.math.BigInteger;

class AckermannFunction {
    public static BigInteger ackermann(BigInteger x, BigInteger y)
    {
   
        if  (y.equals(BigInteger.valueOf(0))) {
            return y;
        }
       
        else if (x.equals(BigInteger.valueOf(0))) {
            return y.multiply(BigInteger.valueOf(2));
          
        }
        else if (y.equals(BigInteger.valueOf(1))) {
            return BigInteger.valueOf(2);
        }
            else {
                return(ackermann(x.subtract(BigInteger.valueOf(1)),ackermann( x, y.subtract(BigInteger.valueOf(1)))));
            }
    }
   
    public static void main(String[] args) {
        System.out.println(ackermann(BigInteger.valueOf(2),BigInteger.valueOf(4)));
    }
}