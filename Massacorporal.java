package massacorporal;

import java.util.Scanner;

public class Massacorporal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;
        System.out.print("Digite o peso..: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Digite a altura..: ");
        alt = Double.parseDouble(sc.nextLine());
        imc = peso / (alt * alt);
        System.out.println("IMC..: " + imc);

        //analisando o resultado do imc
        if (imc < 18.5) {
            System.out.println("~~~ Abaixo do preso ~~~");
        } else if (imc < 25) {
            System.out.println("~~~ Peso normal ~~~");
        } else if (imc < 30) {
            System.out.println("~~~ Sobre peso ~~~");
        } else if (imc < 35) {
            System.out.println("~~~ Obesidade Grau I ~~~");
        } else if (imc < 40) {
            System.out.println("~~~ Obesidade Grau II ~~~");
        } else {
            System.out.println("~~~ Obesidade Grau III ~~~");
        }
    }

}
