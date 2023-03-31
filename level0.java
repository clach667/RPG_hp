package levels;
import Game.Game;
import GameElement.*;

import java.util.Random;
import java.util.Scanner;

import static Game.Game.*;

public class level0 {
    public String name;
    public static void Level0() {

        int money = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        System.out.println("\n                                                                      HARRY POTTER AT HOME");
        System.out.println("                                                                     Jeu crée par Clara Choukroun");
        System.out.println(" ");

        System.out.println("L'histoire commence en 1991, un soir d'hiver. Vous êtes tranquillement installé dans votre lit, lorsque vous entendez un bruit sourd et violent." +
                "\nVous vous réveillez en sursaut, et vous apercevez une silhouette noire qui s'approche de vous.\n");

        System.out.println("Bonjour ! Je suis Hagrid, je suis le gardien de Poudlard, l'école des sorciers. Félicitations, vous avez été désigné pour rejoindre notre école !\n" +
                "Nous avons détécté un potentiel chez vous et nous avons décidé de vous accueillir pour vous aider à développer vos pouvoirs magiques.\n");
        promptEnterKey();
        System.out.println("Quel est votre nom ?");
        String name = scanner.nextLine();
        wizard.setName(name);
        System.out.println("Enchanté " + name + " ! Avant d'aller à Poudlard, nous devons aller chercher quelques affaires. \n");
        System.out.println("Vous voilà à Diagon Alley, la rue commerçante de Londres où se trouvent les magasins de sorciers. Vous pouvez y trouver tout ce dont vous avez besoin" +
                "\npour votre scolarité. Allons d'abord chercher une baguette chez Ollivander !\n");
        promptEnterKey();
        System.out.println("Il y a plusieurs types de baguettes : Fil de coeur de dragon, Plume de phénix, Poil de queue de licorne, Poils de Veela, Poils de queue du Thestral " +
                "\net Moustache de troll. Chaque baguette a ses propres caractéristiques. Voyons celle qui vous convient le mieux !\n");
        promptEnterKey();
        wand = new Wand(wand);
        wizard.setWand(wand);
        wand.setCore();
        wand.setSize();

        System.out.println("Pour vous, ce sera une baguette en " + wand.getCore().type + " de " + wand.getSize() + " cm !\n");
        promptEnterKey();
        System.out.println("Maintenant, allons chercher un animal de compagnie. Chaque sorcier a son propre animal de compagnie, qui lui est propre et qui lui est lié pour " +
                "\ntoujours. Vous pouvez prendre un chat, un rat, un crapeau ou une chouette. Choisissez-en un !\n");
        promptEnterKey();
        Pet pet = Pet.values()[Pet(scanner) - 1];
        wizard.setPet(pet);
        System.out.println("Très bon choix ! Donnez un nom à votre animal de compagnie :");
        String petName = scanner.nextLine();
        System.out.println("Enchanté "+ petName+", toi et ton maître allez vous entendre à merveille !");
        System.out.println("Il ne vous reste plus qu'à acheter des fournitures scolaires. Vous avez besoin d'un uniforme, d'un balai et de potions. Vous disposez de\n"
        +"100 galleons pour acheter tout ce dont vous avez besoin.\n");
        promptEnterKey();
        System.out.println("Au magasin de potions, vous achetez deux potions de soin :Ginger Root et Mandrake Root. Elles vous permettront de vous soigner en cas de blessure.");
        Potion GingerRoot = Potion.GingerRoot();
        wizard.addPotion(GingerRoot);
        Potion MandrakeRoot = Potion.MandrakeRoot();
        wizard.addPotion(MandrakeRoot);
        System.out.println("Quelques minutes passent et vous finissez vos achats. Vous avez tout ce qu'il vous faut, il est temps de partir pour Poudlard !");
        System.out.println("Le trajet commence à la gare de King's Cross où vous embarquez pour Poudlard par le train 9 3/4." +
                "\nVous vous installez dans votre compartiment et vous faites connaissance avec d'autres aprentis sorciers, Hermione et Ron. Enfin, vous arrivez à Poudlard !\n");
        promptEnterKey();
        System.out.println("On demande à tous les arrivants de se regrouper dans le grand hall pour la répartition dans les maisons. Chaque sorcier est réparti dans une maison \n" +
                "selon ses caractéristiques. Il y a 4 maisons : Gryffondor, Serdaigle, Poufsouffle et Serpentard.");
        System.out.println("Vous apercevez une sorte de chapeau qui parle, c'est le Choipeau Magique. Il va vous répartir dans une maison. Vous entendez votre nom\n" +
                "et vous vous dirigez vers lui.");

        promptEnterKey();
        sortingHat = new SortingHat();
        sortingHat.sortingHat();
        wizard.setHouse(house);


        promptEnterKey();
        System.out.println("Introduction terminée ! Voici les donées de votre personnage : ");
        System.out.println("Nom : "+wizard.getName());
        System.out.println("Baguette : " +
                "Type : "+wand.getCore().type+", Taille : "+wand.getSize()+" cm");
        System.out.println("Maison : "+wizard.getHouse());
        System.out.println("Animal : " + wizard.getPet());
        System.out.println("Nom d'animal : "+petName);
        System.out.println("Sorts connus : "+wizard.getknownSpell());
        System.out.println("Potions : "+wizard.getPotion());
        System.out.println("Points de vie : "+wizard.getLifePoint()+"/200");
        System.out.println("Pouvoir : "+wizard.getPower());
        System.out.println("Résistance : "+wizard.getResistance());
        System.out.println("Précision : "+wizard.getAccuracy());
        System.out.println("Argent : 20 galleons\n");
        promptEnterKey();
        System.out.println("C'est l'heure du diner ! Vous vous diriger vers votre table avec tous les membres de votre maison et faites la connaissance de nombreux \n"+
                "camarades. Il est maintenant temps d'aller dormir car demain, vous avez votre premier cours de magie.");
        printSeperator(1);
        System.out.println("Fin du niveau 0");
        printSeperator(1);

    }
}
