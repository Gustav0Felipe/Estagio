import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
    
    try (Scanner scan = new Scanner(System.in)) {
        int valor = scan.nextInt();
        List<Integer> fb = new LinkedList<Integer>();
        fb.add(0);
        fb.add(1);
        while((fb.get(fb.size()-1)) <= valor ){
            int ultimoNumero = fb.get(fb.size() -1);
            int penultimoNumero = fb.get(fb.size() -2);
            fb.add(ultimoNumero + penultimoNumero);
        }
        if(fb.contains(valor)){
            System.out.println("Seu numero aparece na sequencia de fibonnaci: " + fb);
        }else{
            System.out.println("Seu numero não aparece na sequencia de fibonnaci: " + fb);
            }
        }
    }
}
