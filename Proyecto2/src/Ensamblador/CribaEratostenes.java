public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 1000; // Número máximo para comprobar primos
        boolean[] isPrime = new boolean[n + 1]; // Array para marcar números primos
        
        // Inicializar todos los elementos del array como verdaderos
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Aplicar el algoritmo de la criba de Eratóstenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Marcar todos los múltiplos como no primos
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
