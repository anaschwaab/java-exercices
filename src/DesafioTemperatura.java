public class DesafioTemperatura {

    public static void main(String[] args) {
        // fórmula de celsius para fahrenheit: "(temperatura * 1.8) + 32"
        double tempCelsius = 28.70;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempFahrenheit);
        int tempFahrenheitInteger = (int) tempFahrenheit;
        System.out.println(tempFahrenheitInteger);
    }
}
