import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la primera evaluación: ");
        double evaluacion1 = sc.nextDouble();
        
        System.out.print("Ingrese la segunda evaluación: ");
        double evaluacion2 = sc.nextDouble();
        
        System.out.print("Ingrese la tercera evaluación: ");
        double evaluacion3 = sc.nextDouble();
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
        System.out.println(promedio);
        
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
