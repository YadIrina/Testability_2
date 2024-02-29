//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double meter = 1.64;
        int kilogram = 55;
        int bmi_index = service.calculate(meter,kilogram);
        System.out.println("Индекс массы тела (body mass index) :" + bmi_index);
    }
}