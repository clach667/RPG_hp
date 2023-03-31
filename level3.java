package levels;
import Game.Game;
import GameElement.Boss;
import GameElement.House;
import GameElement.Spell;
import GameElement.Wizard;
import java.util.Random;
import java.util.Scanner;


import static Game.Game.*;
import static GameElement.Spell.ExpectoPatronum;

public class level3 {
    public String Name;
    public static void Level3(){
        System.out.println("\nNiveau 3 : Le Prisonnier d'Azkaban\n\n");
        System.out.println("Cette année, à Poudlard, c'est la terreur. Nous sommes menacés par des détraqueurs " +
                " en liberté qui errent partout dans le château. Ils ont blessés plusieurs élèves et même des professeurs. " +
                "Le directeur Dumbledore nous a convoqué dans la grande salle urgemment.\n ");
        promptEnterKey();
        System.out.println("Bonjour à tous, je suis très heureux de vous voir tous ici. Je vais vous expliquer la situation. " +
                "Nous sommes menacés par des détraqueurs qui errent dans le château. Ils ont blessés plusieurs élèves et même des professeurs." +
                " Nous avons besoin de votre aide pour les arrêter. Pour cela, vous allez tous apprendre le sort Expectro Patronum. " +
                "Ce sort vous permettra de vous défendre contre les détraqueurs et les éliminer.\n");

        System.out.println("Nous comptons sur vous pour votre vigilance et votre persévérance afin d'éradiquer cette menace.\n");
        promptEnterKey();
        System.out.println("Vous allez en salle de cours pour apprendre le sort. Vous vous installez à votre place et le professeur Lupin arrive. Il vous explique " +
                "que pour apprendre ce sort, vous devez vous concentrer sur un souvenirs heureux et fort et le projeter dans votre esprit puis dire en même temps 'Expectro Patronum'\n");
        promptEnterKey();
        System.out.println("Vous vous concentrez sur un souvenir heureux et fort et vous dites 'Expectro Patronum'.\n");
        System.out.println("Vous avez appris le sort Expectro Patronum. Vous pouvez maintenant vous défendre contre les détraqueurs.\n");
        printSeperator(1);
        promptEnterKey();
        System.out.println("Vous sortez de la salle de cours et vous vous rendez dans le couloir interdit. Vous entendez des bruits de pas et vous vous cachez derrière un pilier. " +
                "Vous voyez un détraqueur qui arrive vers vous. Vous sortez votre baguette et vous vous préparez à l'attaquer.\n");
        wizard.addSpell(ExpectoPatronum());

        Boss Detractor1 = Boss.Detractor() ;
        Spell.Fight(Detractor1, (Wizard) Game.wizard);
        System.out.println("Vous avez vaincu le détraqueur. Ce n'est pas fini, il y en a encore un autre qui vous attend dans le couloir interdit.\n");
        Boss Detractor2 = Boss.Detractor() ;
        Spell.Fight(Detractor2, (Wizard) Game.wizard);
        System.out.println("Vous avez battu le deuxième détraqueur bravo.");

    }
}
