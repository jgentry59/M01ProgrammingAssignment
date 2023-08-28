public class Conversion {
    /* Convert from feet to meters*/ 
 public static double footToMeter(double foot) {
        return foot * 0.305;
 }
    /* Convert from meters to feet*/ 
 public static double meterToFoot(double meter) {
        return meter * 3.27869; /*Given value of 3.279 output less precise values*/
}
 public static void main(String[]args) {
        System.out.println("Feet  Meters  | Meters  Feet");
        System.out.println("--------------|---------------");
        for (double  meters = 20.0, feet = 1.0; feet <= 10.0; feet++, meters += 5.0) {
        System.out.printf("%.1f   %.3f   | %.1f    %.3f%n", feet, footToMeter(feet), meters, meterToFoot(meters));
  }
 }
}