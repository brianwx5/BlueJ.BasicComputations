 
import java.lang.Math;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int n = 0;
        
        for(int i = 0; i < integers.length; i++) {
            if (integers[i] >n)
            n = integers[i];
    } return n;
}
    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int n = 0;
        for(int i = 0; i < integers.length; i++) {
        if (integers[i] > n)
         n =integers [i];
    } return n;
}
}