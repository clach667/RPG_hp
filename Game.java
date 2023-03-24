package Game;

import GameElement.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void main(String[] args) {
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
        System.out.println("                                                                                                                          ");
        System.out.println("                                                                               /-\\                                  ");
        System.out.println("                                                                              /   \\                            ");
        System.out.println("                                                                             /     \\                         ");
        System.out.println("                                                                            /       \\                         ");
        System.out.println("                                                                           /         \\                       ");
        System.out.println("                                                                          /           \\                      ");
        System.out.println("                                                                         /             \\                      ");
        System.out.println("                                                                        /               \\                      ");
        System.out.println("                                                                       /                 \\                      ");
        System.out.println("                                                                      /                   \\                      ");
        System.out.println("                                                                     /                     \\                      ");
        System.out.println("                                                                    /                       \\                      ");
        System.out.println("                                                                 |||||||||||||||||||||||||||||||                     ");
        System.out.println("                                                                      |                   |            ");
        System.out.println("                                                                      |    __       __    |            ");
        System.out.println("                                                                     /|   |  |     |  |   |\\       ");
        System.out.println("                                                                     \\|   |__| / \\ |__|   |/          ");
        System.out.println("                                                                      |       /___\\       |         ");
        System.out.println("                                                                      |                   |         ");
        System.out.println("                                                                       \\     _______     /         ");
        System.out.println("                                                                        \\   [_______]   /         ");
        System.out.println("                                                                         \\             /         ");
        System.out.println("                                                                          \\___________/         ");

        System.out.println("\n                                                                      HARRY POTTER AT HOME");
        System.out.println("                                                                     Jeu crée par Clara Choukroun");
        System.out.println(" ");


        System.out.println("Bonjour ! Je suis Hagrid, je suis le gardien de Poudlard, l'école des sorciers." +
                " Félicitations, vous avez été désigné pour rejoindre notre école !");
        promptEnterKey();
        System.out.println("Quel est votre nom ?");
        String name = scanner.nextLine();
        System.out.println("Enchanté " + name + " ! Commencons par aller chercher une baguette magique.\n"  );
        wand = new Wand();
        printSeperator(2);
        promptEnterKey();
        System.out.println("\nMaintenant, il faut aller chercher un animal de compagnie.");
        promptEnterKey();
        Pet pet = Pet.values()[Pet(scanner) - 1];
        System.out.println("Vous avez choisi un " + pet + " !\n" +
                "Donnez lui un nom !");
        String petName = scanner.nextLine();
        System.out.println("Super !"+" Votre animal vous accompagnera tout le long de votre scolarité." +
                "Dites bonjour à "+petName);
        printSeperator(2);
        promptEnterKey();
        System.out.println("Maintenant, il faut choisir une maison.");

        sortingHat = new SortingHat();
        sortingHat.sortingHat();



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