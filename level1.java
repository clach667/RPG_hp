package levels;

import Game.Game;
import GameElement.Boss;
import GameElement.Spell;
import GameElement.Wizard;

import java.util.Random;
import java.util.Scanner;

import static Game.Game.*;

public class level1 {


    public String name;



        public static void Level1(){
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("\n\nNiveau 1 : Le cours de magie\n\n");
            System.out.println(" Vous vous réveillez et vous dirigez vers la salle commune de votre maison pour votre petit déjeuner. Vous vous installez à votre table " +
                    "et vous commencez à manger. Vous retournez ensuite dans votre chambre pour vous préparer pour le cours de sortilèges. Vous vous dirigez ensuite vers la salle " +
                    "de cours. Vous entrez et vous vous installez à votre place. Le professeur de magie arrive et se présente, c'est Sirius Black. Il vous explique" +
                    " que vous allez apprendre un nouveau sort aujourd'hui : Wingardium Leviosa, ce sort permet de faire voler des objets.\n");
            promptEnterKey();
            System.out.println("Vous vous mettez à l'écoute et vous commencez à apprendre le sort. Vous avez bien compris le sort et vous êtes prêt à l'essayer !\n" +
                    "Vous avez un bout de bois sur votre table. Vous pouvez donc mettre en application la leçon !\n");
            System.out.println("Pour essayer le sort, taper Wingardium Leviosa : ");
            String sort1;

            sort1 = scanner.nextLine();
            do {
                System.out.println("Ce n'est pas encore ça, essayez encore !");
                sort1 = scanner.nextLine();
            } while (!sort1.equals("Wingardium Leviosa"));
            System.out.println("Vous avez réussi ! Bravo, votre professeur vous félicite !");
            Spell WingardiumLeviosa = Spell.WingardiumLeviosa();
            wizard.addSpell(WingardiumLeviosa);
            promptEnterKey();
            System.out.println("Quelques heures après le premier cours, vous vous baladez dans les couloirs de Poudlard. Vous vous approchez du couloir interdit " +
                    "et pris de curiosité, vous vous engagez dedans. Pas de chance, vous apercevez un troll qui se dirige vers vous. " +
                    "Vous devez le combattre !\n");
            promptEnterKey();
            Boss Troll = new Boss(150, 150, "Troll", 50, 20, 10);
            Spell.Fight(Troll, (Wizard) Game.wizard);
            System.out.println("Ouf, vous avez réussi à vaincre le troll. Vous courez vers votre chambre, cela vous aura servi de lecon," +
                    "vous ne vous approcherez plus du couloir interdit de ci tôt ! Une fois arrivé dans votre chambre, vous racontez votre aventure à vos amis qui n'en " +
                    "croient pas leurs oreilles.\n");
            printSeperator(1);
            System.out.println("Vous avez terminé le niveau 1 !");
            promptEnterKey();
            printSeperator(1);
            }

        }



