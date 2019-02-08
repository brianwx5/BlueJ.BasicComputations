

import java.util.Scanner;
    public class ShortCalculator {
    
        
    public short returnSum (short input1, short input2) {
        
            short sum = (short) (input1 + input2);
            return sum;
    }
        
    public short returnDifference (short input1, short input2) {
        
            short difference = (short) (input1 - input2);
            return difference;
    }
    
    public short returnProduct (short input1, short input2) {
        
            short product = (short) (input1 * input2);
            return product;
    }
    
    public short returnQuotient (short input1, short input2) {
        
            short quotient = (short) (input1 / input2);
            return quotient;
    }
    
    public short returnRemainder (short input1, short input2) {
        
            short remainder = (short) (input1 % input2);
            return remainder;
    }

        
    public static void main (String[] args) {
        ShortCalculator calculator = new ShortCalculator();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("You can enter two numbers to fine the sum, difference, product, qotient, and remainder of the two arguments");
        short number1 = (short) scan.nextInt();
        short number2 = (short) scan.nextInt();
        
        
        System.out.println("Your sum is " + calculator.returnSum(number1, number2));
        System.out.println("Your difference is " + calculator.returnDifference(number1, number2));
        System.out.println("Your product is " + calculator.returnProduct(number1, number2));
        System.out.println("Your difference is " + calculator.returnQuotient(number1, number2));
        System.out.println("Your remainder is " + calculator.returnRemainder(number1, number2));
    }
    }

