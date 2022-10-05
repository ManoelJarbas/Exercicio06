import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
              
                
        System.out.println("Qual o raio do círculo? ");
        double raio = sc.nextDouble();

               
        float area;
        area = (float) (Math.PI * raio * raio);
        System.out.println("A área do círculo do raio " + raio + " é: "+ area);


    
    }
}
