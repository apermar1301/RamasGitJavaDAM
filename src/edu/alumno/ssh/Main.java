package edu.alumno.ssh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();

        System.out.println("Números de la Lotería Primitiva:");
        // Genera 5 números principales

        for (int i = 0; i < 5; i++) {
			int numero = random.nextInt(49) + 1; // Números del 1 al 49
			System.out.println("Número principal " + (i + 1) + ": " + numero);
		}
        // Número complementario
        
        int numeroComplementario = random.nextInt(49) + 1;
        System.out.println("Número complementario: " + numeroComplementario);

    }
}