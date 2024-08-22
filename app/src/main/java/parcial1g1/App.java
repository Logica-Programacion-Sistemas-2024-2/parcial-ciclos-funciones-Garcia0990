package parcial;
import java.util.Scanner;


public class App {
   

    public static void main(String[] args) {
        try {   
            // Implementar la logica de solucion
            int numVehiculos = 0;
            float distanciaMetros = 0;
            float consumoTotal = 0; //almacenar el consumo total
            float consumoVehiculo = 0;
            float kmRecorrido = 0;
                

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantos vehiculos participaron"); // Preguntar al usuario cuántos vehículos participaron
            numVehiculos = sc.nextInt();
             
            for (int i = 1; i <= numVehiculos; i++){ // Iterar los vehículos
                System.out.print("Ingrese la distancia recorrida por el vehículo " + i + " en metros: ");
                distanciaMetros = sc.nextFloat();

                while (distanciaMetros <= 0) { // Validar que la Distancia sea positiva
                    System.out.print("La distancia debe ser un número positivo. Ingrese nuevamente: ");
                    distanciaMetros = sc.nextFloat();    
                }            
                //convertir la distancia de metros a kilómetros 
                kmRecorrido = distanciaMetros/1000;
                System.out.println("vehiculo: " + i + " " + (kmRecorrido) + " km");
                

                // Calcular el consumo de combustible para cada vehículo
                consumoVehiculo = calcularConsumoGasolina(kmRecorrido);
                System.out.println(consumoVehiculo + "Litros de gasolina consumidos: ");
                

                consumoTotal += consumoVehiculo;
            }

            System.out.println("Consumo total de combustible por los 3 vehículos: " + consumoTotal + " litros");
        }
            
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try {
            
            return ((kmRecorrido * 55) / 750); 
                            
        } catch (Exception e) {
            return -1;
        }        
    }
    //------------------------------------------------------------------
}
    



