public class Main {

    public static void Main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);


        areEqualByThreeDecimalPlaces(;double num1, double num2;){

        if(num1 < 0 && num2 >= 0){
            return false;
        }

        if(num1 >= 0 && num2 < 0){
            retrun false;
        }

        long num1Checker = Math.round(num1);
        long num2Checker = Math.round(num2);
        if(num1Check != num2Check){
            return false;
        }

        num1 -= num1Check;
        num1 *= 10;
        num2 -= num2Check;
        num2 *= 10;

        num1Check = Math.round(num1);
        num2Check = Math.round(num2);

        if(num1Check != num2Check){
            return false;
        }
    }


    }



   else return true;
    num3 -= num3Check;
    num3 *= 100;
    num4 -= num4Check;
    num4 *= 100;

    num3Check = Math.round(num3);
    num4Check = Math.round(num4);

        if(num3Check != num4Check){
        return false;


    else return true{
            num5 -= num1Check;
            num5 *= 1000;
            num6 -= num2Check;
            num6 *= 1000;

            num5Check = Math.round(num5);
            num6Check = Math.round(num6);

            if(num5Check != num6Check){
                return false;
            }

        private static void areEqualByThreeDecimalPlaces(double v, double v1) {
    }


}
