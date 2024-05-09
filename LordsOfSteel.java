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
                    crearPersonatge();
                    break;
            }
        }
        //esborrem
        personatges.remove(1);
        System.out.println("total personatges: " + personatges.size());
    }

    public static void crearPersonatge() {
        String[] tipos = {"Huma","Maia", "Mitja","Nan"};

        System.out.println("[1] Huma - [2] Maia - [3] Mitja - [4] Nan");
        System.out.println("Selecciona el tipus del personatge: ");
        int tipo = sc.nextInt();
        sc.nextLine();
        System.out.println("Introdueix el nom: ");
        String nom = sc.nextLine();
        System.out.println("A continuaciò, hauras de repartir 60 punts d'habilitat");
        System.out.println("entre 5 atributs [min = 3, max= 18]: ");
        int totalPunts = 0;
        String error = "Valor invalid, nomès queden per assignar els següents punts: ";
        System.out.print("Força: ");

        int forca = sc.nextInt();
        while (forca < 3 || forca > 18) {
            forca = sc.nextInt();
        }
        totalPunts+=forca;

        System.out.print("Coneixement: ");

        int con = sc.nextInt();
        while (con < 3 || con > 18) {
            con = sc.nextInt();
        }

        totalPunts+=con;

        int atributsRestants = 2; //3 atributs amb 3 punts com a minim

        System.out.print("Velocitat: ");
        int aux = totalPunts;

        int vel = sc.nextInt();
        while (vel < 3 || vel > 18 || (60-(aux+vel))<atributsRestants*3) {
            System.out.println(error + (60-totalPunts));
            aux = totalPunts;
            vel = sc.nextInt();
        }
        totalPunts+=vel;
        atributsRestants--;

        System.out.print("Inteligencia: ");
        aux = totalPunts;

        int inte = sc.nextInt();
        while (inte < 3 || inte > 18 || (60-(aux+inte))<atributsRestants*3) {
            System.out.println(error + (60-totalPunts));
            aux = totalPunts;
            inte = sc.nextInt();
        }
        totalPunts+=inte;
        atributsRestants--;

        System.out.print("Sort: ");
        aux = totalPunts;

        int sor = sc.nextInt();
        while (sor < 3 || sor > 18 || (60-(aux+sor))<atributsRestants*3) {
            System.out.println(error + (60-totalPunts));
            aux = totalPunts;
            sor = sc.nextInt();
        }
        totalPunts+=sor;
        atributsRestants--;

        System.out.println(totalPunts);

        System.out.println("Tipus arma: [1] Daga - [2] Espasa - [3] MartellCombat");
        int arma = sc.nextInt();
    }
}
