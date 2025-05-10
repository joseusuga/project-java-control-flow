public class MultiploPositivo {
    public static void main(String[] args) {
        int numero = 5; 
        
        if (numero > 0) {
            System.out.println("Mostrando los 10 primeros múltiplos de " + numero + ":");
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        } else {
            System.out.println("El número no es válido. Debe ser mayor que cero.");
        }
    }
}
