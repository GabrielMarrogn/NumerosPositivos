import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for(int i = 0; i < 6; i++){
            double a = sc.nextDouble();
            if(a >0 ){
                contador++;
            }
        }

        sc.close();
        System.out.println(contador +" valores positivos");
    }
}
