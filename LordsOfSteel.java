import java.util.ArrayList;
import java.util.Scanner;

public class LordsOfSteel {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean sortir = false;
        Arma[] armes = {new Arma(TipusArma.DAGA),           // arma 0
                        new Arma(TipusArma.ESPASA),         // arma 1
                        new Arma(TipusArma.MARTELLCOMBAT)}; // arma 2

        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add( new Maia("Pakal", 10, 11, 12, 13, 14, armes[0]));
        personatges.add(new Nan("Gimli", 10, 11, 12, 13, 14, armes[1]));
        personatges.add(new Huma("Charli", 10, 11, 12, 13, 14, armes[1]));
        personatges.add(new Mitja("sirlin", 10, 11, 12, 13, 14, armes[2]));

        System.out.println("total personatges: " + personatges.size());
        mostrarPersonatges(personatges);

        while (!sortir) {
            System.out.println();
            System.out.println("[1] Crear personatge.");
            System.out.println("[2] Esborrar personatge.");
            System.out.println("[3] Editar un personatge.");
            System.out.println("[4] Iniciar un combat.");
            System.out.println("[5] Sortir");
            int input = sc.nextInt();
            
            switch (input) {
                case 1:
                    crearPersonatge(armes, personatges);
                    break;
                case 2:
                    esborrarPersonatge(personatges);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    sortir = true;
                    break;
            }
        }
    }

    public static void crearPersonatge(Arma[] armes, ArrayList<Personatge> personatges) {
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
        String[] armess = {"Daga", "Espasa", "MartellCombat"};
        int arma = sc.nextInt();
        while (arma <1 || arma > 3) {
            arma = sc.nextInt();
        }

        switch (tipos[tipo-1]) {
            case "Huma":
                personatges.add(new Huma(nom, forca, con, vel, inte, sor, armes[arma-1]));
                break;
            case "Maia":
                personatges.add(new Maia(nom, forca, con, vel, inte, sor, armes[arma-1]));
                break;
            case "Mitja":
                personatges.add(new Mitja(nom, forca, con, vel, inte, sor, armes[arma-1]));
            break;
            case "Nan":
                personatges.add(new Nan(nom, forca, con, vel, inte, sor, armes[arma-1]));
                break;
        }
        /*System.out.println("Personatge creat, valors: ");
        System.out.println("tipus: " + tipos[tipo-1]);
        System.out.println("nom: " + nom);
        System.out.println("Força: " + forca);
        System.out.println("Coneixement: " + con);
        System.out.println("Velocitat: " + vel);
        System.out.println("Inteligencia: " + inte);
        System.out.println("Sort: " + sor);
        System.out.println("Arma: " + armes[arma-1]);*/
    }

    public static void mostrarPersonatges(ArrayList<Personatge> personatges) {
        int contador = 1;
        for (Personatge p : personatges){
            System.out.println(contador + "- " + p);
            contador++;
        }
    }

    public static void esborrarPersonatge(ArrayList<Personatge> personatges) {
        mostrarPersonatges(personatges);
        System.out.println();
        System.out.print("Selecciona el personatge a esborrar: ");
        int input = sc.nextInt();
        personatges.remove(input-1);
    }

    
}
