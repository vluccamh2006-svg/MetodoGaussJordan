package Ecuaciones_lineales;

public class GaussJordan {

    /**
     * Método que resuelve el sistema aplicando Gauss-Jordan,
     * reutilizando la eliminación gaussiana y aplicando normalización y barrido superior.
     * @param matriz Matriz aumentada [A | b]
     */
    public static void resolverGaussJordan(double[][] matriz) {
        int n = matriz.length;

        // 1. Reutilizamos la fase de triangulación superior de la práctica anterior
        Gauss.eliminacionGaussiana(matriz);

        // 2. Normalización y barrido superior para convertir en matriz identidad
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normalizar el renglón actual para que el pivote sea 1
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Eliminar los coeficientes superiores (por arriba de la diagonal principal)
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}