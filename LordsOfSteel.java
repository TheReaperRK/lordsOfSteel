import java.util.ArrayList;
import java.util.Scanner;

public class LordsOfSteel {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
    Arma[] armes = {new Arma(TipusArma.DAGA),           // arma 0
                    new Arma(TipusArma.ESPASA),         // arma 1
                    new Arma(TipusArma.MARTELLCOMBAT)}; // arma 2

        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(new MaiaCaos("Pakal", 5, 6, 5, 7, 10, armes[0]));
        personatges.add(new NanCaos("Gimli", 14, 8, 7, 1, 9, armes[1]));
        personatges.add(new HumaOrdre("Charli", 10, 11, 12, 13, 14, armes[1]));
        personatges.add(new MitjaOrdre("sirlin", 10, 11, 12, 13, 14, armes[2]));
        //personatges definits per la maquina

        int input;  //menu en bucle fins introduior un 5
        do {
            System.out.println("[1] Crear personatge.");
            System.out.println("[2] Esborrar personatge.");
            System.out.println("[3] Editar un personatge.");
            System.out.println("[4] Iniciar un combat.");
            System.out.println("[5] Sortir");
            input = sc.nextInt();
            
            switch (input) {
                case 1:
                    crearPersonatge(armes, personatges);
                    break;
                case 2:
                    esborrarPersonatge(armes, personatges);
                    break;
                case 3:
                    editarPersonatge(personatges);
                    break;
                case 4:
                    combatir(armes, personatges);
                    break;
            }
        } while (input != 5);
    }

    public static void crearPersonatge  (Arma[] armes,
                                        ArrayList<Personatge> personatges) {

        String[] tipos = {"Huma","Maia", "Mitja","Nan"};
        String[] dev = {"Ordre", "Caos"}; //devocio

        System.out.println("[1] Huma - [2] Maia - [3] Mitja - [4] Nan");
        System.out.println("Selecciona el tipus del personatge: ");
        int tipo = sc.nextInt();
        System.out.println("Selecciona una devoció  [1] Ordre - [2] Caos");
        int devocio = sc.nextInt();
        sc.nextLine();
        System.out.println("Introdueix el nom: ");
        String nom = sc.nextLine();
        System.out.println("A continuaciò, hauras de repartir 60 punts " +
                                                                "d'habilitat");
        System.out.println("entre 5 atributs [min = 3, max= 18]: ");
        int[] stats = new int[5];
        String[] atributs = {"Força: ","Constitució: ","Velocitat: ", "Inteligencia: ",
                            "Sort: "};

        asignarStats(stats, atributs);

        System.out.println("Tipus arma: [1] Daga - [2] Espasa - [3] MartellCombat");
        int arma = sc.nextInt();
        while (arma <1 || arma > 3) {
            arma = sc.nextInt();
        }

        switch (tipos[tipo-1]) {  //introduïm totes les posibles variables de creacio de personatge
            case "Huma":
                if (devocio == 1) {
                    personatges.add(new HumaOrdre(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                } else
                    personatges.add(new HumaCaos(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                break;

            case "Maia":
                if (devocio == 1) {
                    personatges.add(new MaiaOrdre(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                } else
                    personatges.add(new MaiaCaos(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                break;
            case "Mitja":
                if (devocio == 1) {
                    personatges.add(new MitjaOrdre(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                } else
                    personatges.add(new MitjaCaos(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                break;
            case "Nan":
                if (devocio == 1) {
                    personatges.add(new NanOrdre(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                } else
                    personatges.add(new NanCaos(nom, stats[0], stats[1], stats[2], stats[3], stats[4], armes[arma-1]));
                break;
        }
    }

    public static void asignarStats(int[] stats, String[] atributs) {
        int atributsRestants = 5;
        int totalPunts = 0;
        String error = "Valor invalid, nomès queden per assignar els següents "
                + "punts: ";

            for (int i = 0; i < 5;) {

                System.out.print(atributs[i]);
                int aux = totalPunts;
                int n = sc.nextInt();

                while (n < 3 || n > 18 || (60-(aux+n))<atributsRestants*3) {
                    System.out.println(error + (60-totalPunts));
                    aux = totalPunts;
                    n = sc.nextInt();
                }
                totalPunts+=n;
                atributsRestants--;
                stats[i] = n;
                i++;
            }
        }

    public static void esborrarPersonatge(Arma[] armes, ArrayList<Personatge> personatges) {
        mostrarPersonatges(personatges);    //metode per mostrar la llista de personatges
        int n;
        do {
            System.out.println("[0] Sortir");
            System.out.print("Indica quin personatge vols esborrar: ");
            n = sc.nextInt();
        } while(n > personatges.size() || n < 0);
        if (n != 0){
        personatges.remove(n-1);
        }
    }

    public static void mostrarPersonatges(ArrayList<Personatge> personatges) {
        for (Personatge p : personatges){
            System.out.println(p.toStringLong());
        }
    }

    public static void editarPersonatge(ArrayList<Personatge> personatges) {
        mostrarPersonatges(personatges); // metode molt semblant al de la creacio de personatges
        int n;
        do {
            System.out.println("[0] - SORTIR");
            System.out.print("\nSellecciona un personatge a editar: ");
            n = sc.nextInt();
            
        } while(n > personatges.size() || n < 0);
            
            if (n != 0) {
            
            Personatge p = personatges.get(n-1);
            System.out.println("Seleccionat: " + p.toStringLong());

            System.out.println("A continuaciò, hauras de repartir 60 punts d'habilitat");
            System.out.println("entre 5 atributs [min = 3, max= 18]: ");
            int[] stats = new int[5];
            String[] atributs = {"Força: ","Constitució: ","Velocitat: ", "Inteligencia: ",
                            "Sort: "};

            asignarStats(stats, atributs);
            //a continuacio donem els valors corrsponents
            p.setFOR(stats[0]);
            p.setCON(stats[1]);
            p.setVEL(stats[2]);
            p.setINT(stats[3]);
            p.setSOR(stats[4]);
            }
    }

    public static void combatir(Arma[] armes, ArrayList<Personatge> personatges){
        System.out.println("=== INICIA EL COMBAT ===\n");
        boolean turno = true; //variable per fer canvis de torn

        int p2 = -1, p1 = -1; //inicialitzo a un valor inusual
        do {
            mostrarPersonatges(personatges);
            System.out.print("\nSelecciona un personatge [player 1]: ");
            p1 = sc.nextInt();
        } while (p1 > personatges.size() || p1 < 0);
        Personatge player1 = personatges.get(p1-1);

        do {
            mostrarPersonatges(personatges);
            System.out.println("Selecciona un personatge [player 2]");
            p2 = sc.nextInt();
        } while (p2 == p1 || p2 > personatges.size() || p2 < 0); //comprovo que no estigui repetit
        Personatge player2 = personatges.get(p2-1);
        
        int saludP1 = player1.getPS(), saludP2 = player2.getPS(); //amb aixo m'estalvio haber de reiniciar els ps

        while (saludP1 > 0 && saludP2 > 0) {
            if (turno) {
                System.out.println("Torn del jugador 1 ("+ player1.getNom() +
                                                                        ")");
                turno = false;
                System.out.print(player1);
                int ataque = player1.atacar();
                System.out.print(player2);
                int defensa = player2.defensar();
                if (ataque == 1 && ataque > defensa) { //calculo si l'atac es true y que la defensa es false
                    System.out.println(player1 + " ataca [DMG = " +
                                                    player1.getPD()+ "]");
                    saludP2 -= player1.getPD();
                    if (player1 instanceof Ordre) { // si ataca y es interfaç ordre es cura amb devocio
                        System.out.print(player1+" Es cura amb devoció [HLTH ");
                        System.out.print(saludP1 + " -> ");
                        saludP1 += player1.restaurarSalud();
                        System.out.println(saludP1 + "]");
                    }
                    System.out.println(saludP2);    //si el jugador dos reb un atac te possibilitat de defensar-se
                    if (player2 instanceof Caos) {
                        int contraatacar = player2.contraatacar(); //torna un valor 1 o 0 sent 1 true
                        if (contraatacar == 1){
                            System.out.println(player2+ "Contraataca amb " +
                            "devoció [DMG = " + (int)(player2.getPD()) + "]");
                            saludP1 -= player2.getPD();
                        }
                    }
                } else if (ataque == defensa) {
                    System.out.println(player2 + " ha evitat l'atac");
                } else {                                                //ataca o evita l'atac
                    System.out.println(player1 + " no encerta l'atac");
                }
            } else {
                System.out.println("Torn del jugador 2 ("+ player2.getNom() +
                                                                        ")"); //es el mateix codi en sentit contarri
                turno = true;
                System.out.print(player2);
                int ataque = player2.atacar();
                System.out.print(player1);
                int defensa = player1.defensar();
                if (ataque == 1 && ataque > defensa) {

                    System.out.println(player2 + " ataca [DMG = " +
                                                    player2.getPD()+ "]");
                    saludP1 -= player2.getPD();
                    if (player2 instanceof Ordre) {
                        System.out.print(player2+" Es cura amb devoció [HLTH ");
                        System.out.print(saludP2 + " -> ");
                        saludP2 += player2.restaurarSalud();
                        System.out.println(saludP2 + "]");
                    }
                    System.out.println(saludP1);
                    if (player1 instanceof Caos) {
                        int contraatacar = player1.contraatacar();
                        System.out.println(contraatacar);
                        if (contraatacar == 1){
                            System.out.println(player1+ " Contraataca amb " +
                            "devoció [DMG = " + (int)(player1.getPD()) + "]");
                            saludP2 -= player1.getPD();
                        }
                    }
                } else if (ataque == defensa) {
                    System.out.println(player1 + " ha evitat l'atac");
                } else {
                    System.out.println(player2 + " no encerta l'atac");
                }
            }
            if (saludP1 < 0) { //si guanya el p1 fa tot el proces de pujar exp i comunicar-lo
                System.out.println(player2 + " Guanya el combat [Exp + " +
                player1.getPS() + "]");
                int EXP = player2.getPEX();
                player2.setPEX(EXP+=player1.getPS());
                System.out.println("TOTAL EXP = " + player2.getPEX());
                player2.actualizarNivell();
            } else if (saludP2 < 0) {   //el mateix pero el p2
                System.out.println(player1 + " Guanya el combat [Exp + " +
                player2.getPS() + "]");
                int EXP = player1.getPEX();
                player1.setPEX(EXP+=player2.getPS());
                System.out.println("TOTAL EXP = " + player1.getPEX());
                player1.actualizarNivell();
            }
        }
    }
}