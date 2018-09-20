public class CtoFTester {
	public static double CelsiusToFahrenheit (double Celsius) {
		return Celsius * (9/5) + 32;
	}
	public static double FahrenheitToCelsius (double Fahrenheit) {
		return (Fahrenheit - 32) / (9/5);
	}
	public static void main(String[] args){
		System.out.println(CelsiusToFahrenheit(50));
		System.out.println(FahrenheitToCelsius(50));
	}
}

