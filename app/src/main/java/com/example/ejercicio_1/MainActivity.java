package com.example.ejercicio_1;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

        public static void main(String[] args) {
            // Primero preguntamos al usuario e imprimimos
            long anio;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingresa un año: ");
            anio = scanner.nextLong();
            // A partir de ese año, vamos a comprobar si es bisiesto
            boolean resultado = esBisiesto(anio);
            // No es necesario hacer el resultado == true porque ya es un booleano
            if (resultado) {
                System.out.println("Sí es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
            // Y ahora otra cosa, imprimimos los bisiestos de un período
            // Nota: "anio" ya está declarado anteriormente, por eso no lo volvemos a declarar, simplemente modificamos el
            // valor
            for (anio = 1900; anio < 3000; anio++) {
                // La función también se puede usar así:
                if (esBisiesto(anio)) {
                    System.out.printf("%d,", anio);
                }
            }
        }

        public static boolean esBisiesto(long anio) {
            // Divisible entre 4, y (NO divisible entre 100 o divisible entre 400)
            return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
        }
    }