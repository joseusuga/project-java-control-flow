public class Weathermejorado {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            String resultado = "";

            if (i % 3 == 0) {
                resultado += "Fizz";
            }
            if (i % 5 == 0) {
                resultado += "Buzz";
            }
            if (i % 7 == 0) {
                resultado += "Boom";
            }

           
            if (resultado.isEmpty()) {
                resultado = Integer.toString(i);
            }

            
            System.out.println(i + ": " + resultado);
        }
    }
}
