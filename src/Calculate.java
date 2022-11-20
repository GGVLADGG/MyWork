
public class Calculate {
	public double Summa(double a, double b) {
        return a + b;
    }

    public double Minus(double a, double b) {
        return a - b;
    }

    public double Dobytok(double a, double b) {
        double result = a * b;
        double scale = Math.pow(10.0, 2);
        return Math.round(result * scale) / scale;
    }

    public double Div(double a, double b) {
        double result = a / b;
        if (b == 0) {
            return result;
        } else {
            double scale = Math.pow(10.0, 2);
            return Math.round(result * scale) / scale;
        }
    }
}
