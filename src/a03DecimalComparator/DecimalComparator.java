package a03DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int aInt = (int) (a * 1000);
        int bInt = (int) (b * 1000);

        return aInt == bInt;
    }

    public static int areEqualByThreeDecimalPlaces(double a){
        int aInt = (int) (a * 1000);

        return aInt;
    }
}
