public class BmiService {
    public int calculate(int kg, double meter) {

        double bmiIndex = kg / (meter * meter);
        int index = (int) bmiIndex ;

        return index;

    }
}
