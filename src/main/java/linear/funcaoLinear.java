
package linear;
import java.util.Scanner;
public class funcaoLinear {
     //calculo dos primos Recursivos
    public static boolean pRecursivo(int N, int div){
        if (N < 2) return false;
        if (div > Math.sqrt(N)) return true;
        if (N % div == 0) return false;
        return pRecursivo(N, div + 1);
        
    }
    
    public static void mostrarPrimos(int N, int atual, boolean primeiro){
        if(atual > N) return;
        
        if(pRecursivo(atual, 2)){
            if (!primeiro) {
                System.out.print(", ");
            }
            
            System.out.print(atual);
            primeiro = false;
        }
        
        mostrarPrimos(N, atual +1, primeiro);
    }
        // calculo dos primos Lineares
    public static boolean pLinear(int num){
     for(int i = 2; i <= Math.sqrt(num); i++){
         if(num % i == 0) return false;
        }
     return true;
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //entrada do N
        System.out.print("Escreva um número maior que 1: ");
        int N = sc.nextInt();
        
        if (N <= 1) {
            System.out.println("Só é permitido números acima de 1.");
            System.out.print("Tente novamente: ");
            N = sc.nextInt();
            return;
        }
        System.out.print("Linear: ");
        System.out.print("p(" + N + ") = [");
        
        boolean primeiro = true;
        
        // repetição para a verificação se é primo linear
        for (int i = 2; i<= N; i++){
            if(pLinear(i)) {
                if(!primeiro){
                System.out.print(", ");
                }
                System.out.print(i);
                primeiro = false;
            }
            
        }
        //finalização dos primos lineares
        System.out.println("]");
        
        
        //saida primos recursivos
        System.out.print("Recursiva: ");
        System.out.print("p(" + N + ") = [");
        mostrarPrimos(N, 2, true);
        System.out.print("]");
            
            
    }
}
