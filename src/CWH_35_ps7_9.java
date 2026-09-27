public class CWH_35_ps7_9 {
    static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        float celsius = 25;
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
    }
}