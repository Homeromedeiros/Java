package exercicio01;


import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class App{
    public static void main(String[] args){ 
        Date relogio = new Date();
        System.out.println ("A hora do sistema é:");
        System.out.println(relogio.toString());

        System.out.println("");
 
        Locale local = Locale.getDefault();
        System.out.print("O sistema está em: ");  
        System.out.println(local.getDisplayCountry());

        System.out.println("");

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolucao: " + lar + " X "+ alt);
}

}