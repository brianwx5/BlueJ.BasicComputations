 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        angle %= 360;
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int b = 360;
        return Math.floorMod(integer,b);
    }

    public static void main(String[] args){

    }
}
