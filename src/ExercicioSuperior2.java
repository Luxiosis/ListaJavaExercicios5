import java.util.Scanner;

public class ExercicioSuperior2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sue salário: ");
        double salario = sc.nextDouble();
        double tarifa_lvl4 = 828.38;

        if (salario > 7087.22) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", tarifa_lvl4);
        } else if (salario > 3641.04 && salario <= 7087.22) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", tarifa_lvl3(salario));

        } else if (salario > 2427.36 && salario <= 3641.03) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", tarifa_lvl2(salario));
        } else if (salario > 1212.01 && salario <= 2427.35) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", tarifa_lvl1(salario));
        } else {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", tarifa_lvl0(salario));
        }
    }

    public static double tarifa_lvl0(double numero) {
        return  (numero / 100) * 7.5;
    }
    public static double tarifa_lvl1(double numero) {
        return  (((numero - 1212.00) / 100) * 9) + 90.90;
    }
    public static double tarifa_lvl2(double numero) {
        return  (((numero - 2427.36) / 100) * 12) + 200.28;
    }
    public static double tarifa_lvl3(double numero) {
        return  (((numero - 3641.04) / 100) * 14) + 345.92;
    }
}
