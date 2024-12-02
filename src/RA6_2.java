import java.util.Scanner;  // Importo la clase Scanner

public class RA6_2 {
    public static void main(String[] args) {

        int mediatrim = 0, mediaalum = 0, alum;  // Preparo las variables, y las inicializo para poder hacer cálculos con ella

        Scanner sc = new Scanner(System.in);  // Creo un objeto de la clase Scanner

        int[][] grupo = new int[5][3];  // Creo la matriz de int de tamaño 5x3

        for (int i = 0; i < 3; i++) {  // Hago un for que trabaja con los trimestres (filas)

            for (int j = 0; j < 5; j++) {  // Hago un for dentro del for que trabaja con los alumnos (columnas)

                // Muestro por pantalla el alumno y el trimestre con el que se trabaja
                System.out.print("Ingrese la nota del alumno " + (j+1) + " en el trimestre " + (i+1) + ": ");
                grupo[j][i] = sc.nextInt();  // y pido que diga su nota, y la almaceno en una posición de la matriz
                mediatrim += grupo[j][i];  // y lo sumo a la media del trimestre

            }

            // Muestro la media del trimestre actual
            System.out.println("La media del trimestre "+ (i+1) + " es: " + mediatrim/5);
            mediatrim = 0;  // y reseteo el valor de la media a 0 para poder reusarla
            System.out.println("");  // Espacio en blanco

        }

        System.out.print("¿De qué alumno desea ver la media? ");
        alum = sc.nextInt();  // Pido el alumno (columna) que se quiera ver su media

        for (int i = 0; i < 3; i++) {  // Hago un for que se repite 3 veces (3 trimestres)
            mediaalum += grupo[alum-1][i];  // donde añado el valor de esa posición de la matriz (siempre es la misma fila) a mediaalum
        }

        // Muestro por pantalla el alumno que se ha pedido su media, y posteriormente su media
        System.out.print("La media del alumno " + alum + " es: " + mediaalum/3);
    }
}

