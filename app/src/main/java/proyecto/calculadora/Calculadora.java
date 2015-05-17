package proyecto.calculadora;

public class Calculadora {
    public static double operar(String operacion) throws Exception {
        return sumar(operacion);
    }

    private static double sumar(String operacion) throws Exception {
        String[] sumas = operacion.split("\\+");
        double resultado = 0;
        for (String suma : sumas) {
            resultado += restar(suma);
        }
        return resultado;
    }

    private static double restar(String operacion) throws Exception {
        String[] restas = operacion.split("\\-");
        double resultado = 0;
        for (String resta : restas) {
            if (resultado == 0)
                resultado = multiplicar(resta);
            else
                resultado -= multiplicar(resta);
        }
        return resultado;
    }

    private static double multiplicar(String operacion) throws Exception {
        String[] multiplicaciones = operacion.split("\\*");
        double resultado = 1;
        for (String multiplicacion : multiplicaciones) {
            resultado *= dividir(multiplicacion);
        }
        return resultado;
    }

    private static double dividir(String operacion) throws Exception {
        String[] divisiones = operacion.split("\\/");
        double resultado = 0;
        for (String division : divisiones) {
            if (resultado == 0)
                resultado = Double.parseDouble(division);
            else
                resultado /= Double.parseDouble(division);
        }
        return resultado;
    }

    private static double raiz(String operacion) throws Exception {
        String[] raices = operacion.split("\\√");
        double resultado = 0;
        for (String raiz : raices) {
            if(resultado == 0)
                resultado = Double.parseDouble(raiz);
            else
                resultado = Math.sqrt(Double.parseDouble(raiz));
        }
        return resultado;
    }
}