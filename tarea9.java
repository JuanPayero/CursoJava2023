
import java.util.Scanner;

public class tarea9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jugador 1: Ingrese su elección (0 para piedra, 1 para papel, 2 para tijera): ");
        int jugador1 = sc.nextInt();
        
        System.out.print("Jugador 2: Ingrese su elección (0 para piedra, 1 para papel, 2 para tijera): ");
        int jugador2 = sc.nextInt();
        
        if (jugador1 == jugador2) {
            System.out.println("Empate");
        } else if (jugador1 == 0 && jugador2 == 2 || jugador1 == 1 && jugador2 == 0 || jugador1 == 2 && jugador2 == 1) {
            System.out.println("Jugador 1 gana");
        } else if (jugador2 == 0 && jugador1 == 2 || jugador2 == 1 && jugador1 == 0 || jugador2 == 2 && jugador1 == 1) {
            System.out.println("Jugador 2 gana");
        } else 
        	System.out.println("los valores no son validos");
    }
}
