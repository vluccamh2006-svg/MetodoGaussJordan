package Ecuaciones_lineales;

public class Lanzador_GaussJordan {
    public static void main(String[] args) {
        // 1. Obtenemos la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplicamos el método de Gauss-Jordan (reutiliza Gauss y calcula la identidad)
        GaussJordan.resolverGaussJordan(matriz);

        // 3. Imprimimos los resultados directamente desde la última columna de la matriz identidad
        System.out.println("Soluciones del sistema (Método de Gauss-Jordan):");
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
        }
    }
}