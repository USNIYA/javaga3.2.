//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        service.calculate(98,1.87);
        int kg = 98;
        double meter = 1.87;
       int bmiIndex = service.calculate(kg, meter);
        System.out.println(bmiIndex);
    }
}