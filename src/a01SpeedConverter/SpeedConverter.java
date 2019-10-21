package a01SpeedConverter;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
