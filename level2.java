package levels;
import Game.Game;
import GameElement.Boss;
import GameElement.House;
import GameElement.Spell;
import GameElement.Wizard;
import java.util.Random;
import java.util.Scanner;


import static Game.Game.*;
import static GameElement.Spell.Expelliarmus;


public class level2 {
    public String Name;

    public static void Level2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\nNiveau 2 : La Chambre des Secrets\n\n");
        Boss Basilic = new Boss(200, 100, "Basilic", 100, 30, 10);
        System.out.println("Ce matin, vous commencez par un cours de sorts. Vous apprenez le sort Expelliarmus que vous arrivez à maitriser rapidement." +
                " Vous connaissez maintenant 2 sorts : Wingardium Leviosa et Expelliarmus.\n");
        promptEnterKey();
        printSeperator(1);
        wizard.addSpell(Expelliarmus());
        System.out.println("Après manger, vous assister à votre premier match de Quidditch ! Vous et vos amis allez " +
                "s'installer dans les tribunes pour encourager votre équipe." )  ;
        int rnd = new Random().nextInt(House.HOUSES.length);
        String adverse = House.HOUSES[rnd];
        System.out.println("Bonjour et bienvenue au premier match de Quidditch de l'année qui oppose "+wizard.getHouse()+" à "+adverse+" !\n" +
           "Le match va commencer dans quelques secondes, les équipes sont prêtes ? Alors c'est parti !");
        promptEnterKey();
        System.out.println("Le match commence, vous êtes très excité et vous encouragez votre équipe. "
                + wizard.getHouse() + " est en tête du match, vous êtes très heureux de voir votre maison gagner. " +"Cependant," +
                        " l'équipe adverse n'abandonne pas et l'écart se resserre.\n ");
        promptEnterKey();
        System.out.println("Il reste 5 minute de jeu, "+adverse+" est en tête du match. Vous êtes très inquiet mais soudain, l'attaquant de votre " +
                "équipe marque un but !! Vous êtes à nouveau en tête. L'excitation est à son comble sur le terrain et dans les gradins. " +
                "Enfin, la cloche sonne la fin du match.\n");
        System.out.println("VAINQUEUR DU MATCH : "+wizard.getHouse()+"\n\n");
        System.out.println("Vous avez gagné le match ! Vous êtes très heureux et vous vous réjouissez de la victoire de votre équipe." +
                "Vous rentrez à Poudlard et vous vous préparez pour le dîner de célébration.\n ");
        promptEnterKey();
        printSeperator(1);
        System.out.println("Après cette soirée, vous rentrez dans votre chambre vous coucher" +
                " mais vous avez du mal à trouver le sommeil. Au milieu de la nuit, vous vous décidez à explorer les couloirs de l'école. " +
                "Vous arrivez au troisième étage et vous arrivez devant la Chambre des Secrets. Vous entrez et vous vous retrouvez face à un serpent. ");
        promptEnterKey();
        System.out.println("Vous voulez fuir malheureusement, le serpent vous bloque la sortie. Vous devez trouver une solution pour vous en sortir.\n" +
                "Sur le côté, vous apercevez une épée de Gryffondor. Vous décidez de l'utiliser pour vous défendre.\n");
        if (wizard.getHouse().equals("Gryffondor")) {
            System.out.println("Coup de chance, vous êtes bien à Gryffondor et pouvez donc utiliser l'épée.\n");
            EpeeGryffondor(Basilic, wizard);
        } else {
            System.out.println("Vous n'appartenez pas à la maison Gryffondor, vous ne pouvez donc pas utiliser l'épée. Il faudra utiliser " +
                    "vos sorts et vos potions pour vous en sortir.\n");
            Spell.Fight(Basilic, wizard);
        }
        System.out.println("En panique, vous rejoignez rapidement votre chambre et vous vous coucher pour oublier cette nuit agitée.\n");
        promptEnterKey();
        printSeperator(1);
        System.out.println("Fin du niveau 2\n");
        printSeperator(1);

    }

    public static void EpeeGryffondor(Boss boss, Wizard wizard) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (wizard.lifePoint > 0 && Boss.lifePoint > 0) {
            System.out.println("Choisissez entre :\n" +
                    "1 = Utiliser l'épee pour attaquer\n 2 = Prendre une potion de défense");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int success = 50;
                if (success > random.nextInt(100)) {
                    System.out.println("Vous avez réussi à toucher le serpent, vous lui infligez 100 de dégats.");
                    boss.lifePoint = boss.lifePoint - 100;
                    System.out.println("Point de vie de votre ennemi : " + boss.lifePoint);
                } else {
                    System.out.println("Vous avez échoué à lancer le sort, vous perdez des points de vie");
                    wizard.lifePoint = wizard.lifePoint - boss.getDamage();
                    System.out.println("Point de vie restants : " + wizard.lifePoint);
                }
            }
            if (choice == 2) {
                System.out.println("Vous avez pris une potion de défense, vous gagnez 20 points de vie");
                wizard.lifePoint = wizard.lifePoint + 20;
                System.out.println("Point de vie restants : " + wizard.lifePoint);
            }
        }
        if (Boss.lifePoint<=0){
            System.out.println("Vous avez vaincu le serpent !\n");
        }
    }



}