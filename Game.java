package Game;

import GameElement.*;

import java.util.*;

public class Game {
    static Wand wand;
    static SortingHat sortingHat;
    static Wizard wizard;

    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();

    }
    public static void promptEnterKey(){
        System.out.println("Appuyez sur Entrée pour continuer...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static String[] appendToArray(String[] arr, String str) {
        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = str;
        return newArr;
    }
        public static void main (String[]args){
            level0();
        }

    public static void level0() {

        int money = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("     ___      ___         _          ________      ________    __       __             ________     ________     ____________    ____________    __________     ________              ");
        System.out.println("     | |      | |        / \\        / /    \\ \\    / /    \\ \\   \\ \\     / /            / /    \\ \\   / /_____\\ \\  |____________|  |____________|  |  ________|   / /    \\ \\          ");
        System.out.println("     | |      | |       / _ \\       | |     | |   | |     | |   \\ \\   / /             | |     | |  | |     | |        | |             | |       | |            | |     | |                   ");
        System.out.println("     | |______| |      / / \\ \\      | |____/ /    | |____/ /     \\_\\ /_/              | |____/ /   | |     | |        | |             | |       | |________    | |____/ /         ");
        System.out.println("     | |______| |     / /___\\ \\     | |___/ /     | |___/ /        | |                | |___/_/    | |     | |        | |             | |       |  ________|   | |___/ /");
        System.out.println("     | |      | |    / /_____\\ \\    | |   \\ \\     | |   \\ \\        | |                | |          | |     | |        | |             | |       | |            | |   \\ \\      ");
        System.out.println("     | |      | |   / /       \\ \\   | |    \\ \\    | |    \\ \\       | |                | |          | |_____| |        | |             | |       | |________    | |    \\ \\             ");
        System.out.println("     |_|      |_|  /_/         \\_\\  |_|     \\_\\   |_|     \\_\\      |_|                |_|          \\_\\_____/_/        |_|             |_|       |__________|   |_|     \\_\\                             ");
        System.out.println("                                                                                                                       ");
                                 

        System.out.println("\n                                                                      HARRY POTTER AT HOME");
        System.out.println("                                                                     Jeu crée par Clara Choukroun");
        System.out.println(" ");

        System.out.println("L'histoire commence en 1991, un soir d'hiver. Vous êtes tranquillement installé dans votre lit, lorsque vous entendez un bruit sourd et violent." +
                "\nVous vous réveillez en sursaut, et vous apercevez une silhouette noire qui s'approche de vous.\n");

        System.out.println("Bonjour ! Je suis Hagrid, je suis le gardien de Poudlard, l'école des sorciers. Félicitations, vous avez été désigné pour rejoindre notre école ! Nous avons \n" +
                "détécté un potentiel chez vous et nous avons décidé de vous accueillir pour vous aider à développer vos pouvoirs magiques.\n");
        promptEnterKey();
        System.out.println("Quel est votre nom ?");
        String name = scanner.nextLine();
        System.out.println("Enchanté " + name + " ! Avant d'aller à Poudlard, nous devons aller chercher quelques affaires. Vous avez 100 galleons, dépensez-les bien !\n");
        System.out.println("Vous voilà à Diagon Alley, la rue commerçante de Londres où se trouvent les magasins de sorciers. Vous pouvez y trouver tout ce dont vous avez besoin" +
                "\n pour votre scolarité. Allons chercher une baguette chez Ollivander !\n");
        promptEnterKey();
        System.out.println("Il y a plusieurs types de baguettes : Fil de coeur de dragon, Plume de phénix, Poil de queue de licorne, Poils de Veela, Poils de queue du Thestral " +
                "\net Moustache de troll. Chaque baguette a ses propres caractéristiques. Voyons celle qui vous convient le mieux !\n");
        promptEnterKey();
        wand = new Wand();
        promptEnterKey();
        System.out.println("Maintenant, allons chercher un animal de compagnie. Chaque sorcier a son propre animal de compagnie, qui lui est propre et qui lui est lié pour " +
                "\ntoujours. Vous pouvez prendre un chat, un rat, un crapeau ou une chouette. Choisissez-en un !\n");
        promptEnterKey();
        Pet pet = Pet.values()[Pet(scanner) - 1];
        System.out.println("Très bon choix ! Donnez un nom à votre animal de compagnie.");
        String petName = scanner.nextLine();
        System.out.println("Enchanté "+ petName+" , toi et ton maître allez vous entendre à merveille !");
        System.out.println("Il ne vous reste plus qu'à acheter des fournitures scolaires. Vous avez besoin d'un uniforme, d'un balai, d'un parchemin et d'un stylo.\n");
        promptEnterKey();
        System.out.println("Quelques minutes passent et vous finissez vos achats. Vous avez tout ce qu'il vous faut, il est temps de partir pour Poudlard !");
        System.out.println("Le trajet commence à la gare de King's Cross où vous embarquez pour Poudlard par le train 9 3/4." +
                "\nVous vous installez dans votre compartiment et vous faites connaissance avec d'autres aprentis sorciers, Hermione et Ron. Enfin, vous arrivez à Poudlard !\n");
        promptEnterKey();
        System.out.println("On demande à tous les arrivants de se regrouper dans le grand hall pour la répartition dans les maisons. Chaque sorcier est réparti dans une maison \n" +
                "selon ses caractéristiques. Il y a 4 maisons : Gryffondor, Serdaigle, Poufsouffle et Serpentard.\n\n");
        System.out.println("Vous apercevez une sorte de chapeau qui parle, c'est le Choipeau Magique. Il va vous répartir dans une maison. Vous entendez votre nom\n" +
                " et vous vous dirigez vers le Choipeau Magique.");

        promptEnterKey();


        sortingHat = new SortingHat();
        sortingHat.sortingHat();
        promptEnterKey();
        System.out.println("Vous avez appris un nouveau sort"  + " !");
        //wizard = new Wizard(knowsSpells);
        //wizard.knowsSpells = appendToArray(wizard.knowsSpells, "wingardium leviosa");



    }

    private static int Pet(Scanner scanner){
        int choice = 0;
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 ) {
            System.out.println("Choisissez un animal : ");
            System.out.println("1 : Chouette\n2 : Rat\n3 : Chat\n4 : Crapaud");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6) {
                    System.out.println("Le choix doit être 1, 2, 3, 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Le choix doit être 1, 2, 3, 4");
                scanner.nextLine();
            }
        }
        return choice;
    }


}