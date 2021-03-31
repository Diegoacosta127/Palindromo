package palindromo;
import java.util.Scanner;
/**
 * @author diegote
 */
public class Palindromo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Ingresar un texto");
        String texto = leer.nextLine();
        int a = texto.length()-1;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != texto.charAt (a) && texto.charAt (i) == ' '  && texto.charAt (a) == ' '){
                flag = false;
            }
            a--;
        }
        if (flag){
            System.out.println(texto + " es palíndromo");
        }else{
            System.out.println(texto + " no es palíndromo");
        }
    }
    
}
