package Game;

import GameElement.*;
import GameElement.Character;


import java.util.*;

import static levels.level0.Level0;
import static levels.level1.Level1;
import static levels.level2.Level2;
import static levels.level3.Level3;


public class Game {
    public static Wand wand;
    public static SortingHat sortingHat;
    private static Object List;
    private static Object Spell;

    public static Wizard wizard = new Wizard("Harry Potter", Pet.RAT, new Wand(wand), new House(), new ArrayList<Spell>(), new ArrayList<Potion>());
    static Spell spell;
    static Potion potion;
    public static House house;

    static Boss boss;



    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("___________________________________________________________________________________________________________________________________________________\n" +
                    "___________________________________________________________________________________________________________________________________________________");
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

    public static void main(String[] args) {
        Level0();
        Level1();
        Level2();
        Level3();
    }

    public static int Pet(Scanner scanner){
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

