import java.util.ArrayList;
import java.util.Scanner;

public class LordsOfSteel {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
    Arma[] armes = {new Arma(TipusArma.DAGA),           // arma 0
                    new Arma(TipusArma.ESPASA),         // arma 1
                    new Arma(TipusArma.MARTELLCOMBAT)}; // arma 2

        Maia p1 = new Maia("Pakal", 10, 11, 12, 13, 14, armes[0]);
        Nan p2 = new Nan("Gimli", 10, 11, 12, 13, 14, armes[1]);
        Huma p3 = new Huma("Charli", 10, 11, 12, 13, 14, armes[1]);

        /*Personatge[] personatges = new Personatge[10];
        personatges[0] = p1;
        personatges[1] = p2;
        personatges[2] = p3;
        personatges[3] =  new Mitja("Pakal", 10, 11, 12, 13, 14, armes[2]);
        */

        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(p1);
        personatges.add(p2);
        personatges.add(p3);
        personatges.add(new Mitja("sirlin", 10, 11, 12, 13, 14, armes[2]));

        System.out.println("total personatges: " + personatges.size());

        for (Personatge p : personatges){
            System.out.println(p);
        }

        System.out.println("[1] Crear personatge.");
        System.out.println("[2] Esborrar personatge.");
        System.out.println("[3] Editar un personatge.");
        System.out.println("[4] Iniciar un combat.");
        System.out.println("[5] Sortir");

        int input = sc.nextInt();
        while (input != 5) {
            switch (input) {
                case 1:
                    
                    break;
            
                case 2:
                    break;

                case 3:
                
                    break;
                    
                case 4:
                    
                    break;
            }
        }
        //esborrem
        personatges.remove(1);
        System.out.println("total personatges: " + personatges.size());
    }
}
