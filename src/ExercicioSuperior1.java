import java.util.Scanner;

public class ExercicioSuperior1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a temperatura: ");
        double temperatura = sc.nextDouble();
        System.out.printf("Insira medida (F ou C): ");
        String grandeza = sc.next();

        System.out.printf("A temperatura informada foi %.1fº %s.\n", temperatura, grandeza);
        if(checarMedida(grandeza) == false) {
            System.out.println("A letra " + grandeza + " não corresponde a uma unidade de medida de temperatura.");
        }
        else {
            if(grandeza.equals("F")) {
                System.out.printf("Ela equivale a %.0fº Celsius.", fahrenheitParaCelsius(temperatura));
            } else if(grandeza.equals("C")) {
                System.out.printf("Ela equivale a %.0fº Fahrenheit.", celsiusParaFahrenheit(temperatura));
            }
        }
    }


    public static double fahrenheitParaCelsius(double numero) {
        return ((numero - 32) * 5 ) / 9;
    }
    public static double celsiusParaFahrenheit(double numero) {
        return  (numero * 1.8) + 32;
    }
    public static boolean checarMedida(String letra) {
        return letra.equals("C") || letra.equals("F");
    }
}