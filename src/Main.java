import a01SpeedConverter.SpeedConverter;
import a02MegaBytesConverter.MegaBytesConverter;
import a03DecimalComparator.DecimalComparator;
import s05e01NumberPalindrome.NumberPalindrome;
import s06e01Cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
//        SpeedConverter.printConversion(100);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(10000);
//
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.17567, 3.1752213));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.17567));

//        System.out.println(NumberPalindrome.isPalindrome(-44548));

        Cylinder cylinder = new Cylinder(0.5, 2);
        System.out.println(cylinder.getArea());

    }
}
