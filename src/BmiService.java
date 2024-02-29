public class BmiService {

    public int calculate (double meter, int kilogram){

        double result = kilogram / Math.pow(meter,2);
        return (int) result;
    }
}

