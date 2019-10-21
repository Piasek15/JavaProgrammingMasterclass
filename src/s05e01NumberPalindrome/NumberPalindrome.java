package s05e01NumberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int numberToCompare = number;

        while (number != 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return reverse == numberToCompare;
    }

}
