package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Llamar a la función en el main y darle valores.
        int resultado = suma(10,20,30);
        System.out.println("La suma de 10 + 20 + 30 = "+resultado);

        // Objeto Coche
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println("El coche tiene "+miCoche.puerta+" puertas.");
    }
    // Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
// Clase coche
class Coche {
    public  int puerta = 1;
    public void AgregarPuertas() {
        this.puerta++;
    }
}
