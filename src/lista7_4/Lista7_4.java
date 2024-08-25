package lista7_4;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_4 {
    public static void main(String[] args) {
        final int LIMITEMAX = 300;
        final int LINHA = 5;
//        final int COLUNA = 5;
        int vet[][] = new int [LINHA][LINHA];
        int div = 0;
        String numDiv = "";
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                do{
                    vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
                }while(vet[x][y] < 100);
            }
        }
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                if(vet[x][y] % 3 == 0){
                    if(div == 0){
                        numDiv += Integer.toString(vet[x][y]);
                    } else{
                        numDiv += " - " + Integer.toString(vet[x][y]);
                    }
                    div++;
                }
            }
        }
        String vetorOriginal = "";
        for (int x = 0; x < LINHA; x++) {
            vetorOriginal += Arrays.toString(vet[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz original: \n" +vetorOriginal+ "\nTotal de números divisíveis por 3: " + div +
                "\nNúmeros: " +numDiv);
    }    
}
