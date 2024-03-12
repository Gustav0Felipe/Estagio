//import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        //Caso queira colocar o valor pelo console.
        //Scanner scan = new Scanner(System.in);
        //String texto = scan.nextLine();
        String texto = "Bom dia, me chamo gustavo.";
        String texto_invertido = ""; 

        int cont = 1;
        while(texto.length() >= cont){
            texto_invertido += texto.charAt(texto.length() - cont);
            cont ++;
        }
        System.out.println(texto_invertido);
    }
}
