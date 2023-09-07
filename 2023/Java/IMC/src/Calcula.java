import java.text.DecimalFormat;

public class Calcula {
    public static String calcularIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        DecimalFormat df = new DecimalFormat("#0.0");

        String resultado = "Resultado: " + df.format(imc);

        if (imc < 18.5) {
            resultado += " Baixo Peso";
        } else if (imc < 24.9) {
            resultado += " Peso Normal";
        } else if (imc < 29.9) {
            resultado += " Excesso De Peso";
        } else if (imc == 30.0) {
            resultado += " Obesidade";
        } else if (imc < 34.9) {
            resultado += " Obesidade Classe 1 (Moderada)";
        } else if (imc < 39.9) {
            resultado += " Obesidade Classe 2 (Severa)";
        }else {
            resultado += " Obesidade Classe 3 (Mórbida)";
        }

        return resultado;
    }
}