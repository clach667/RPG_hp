package GameElement;


import java.util.Random;
import java.util.Scanner;

;

public class Spell {
    public String name;
    public int damage;
    public int accuracy;
    public int resistance;
    public String type;


    public Spell(String Name, int Damage, int Accuracy, int Resistance, String at) {
        this.name = Name;
        this.damage = Damage;
        this.accuracy = Accuracy;
        this.resistance = Resistance;
        this.type = at;
    }




    public static void Fight(Boss boss, Wizard wizard) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quel sort voulez-vous utiliser ?");
        for(int i = 0; i < wizard.knownSpells.size(); i++) {
            System.out.println((i + 1) + " = " + wizard.knownSpells.get(i).name);
        }
        int sort = scanner.nextInt();
        Spell spell = wizard.knownSpells.get(sort - 1);
        while (wizard.lifePoint > 0 && Boss.lifePoint > 0) {
            System.out.println("Choisissez entre :\n" +
                    "1 = Lancer ce sort\n2 = Prendre une potion de soin");
            int choice = scanner.nextInt();
            if (choice == 1) {
                int succes;
                if (SortingHat.house == "Ravenclaw") {
                    succes = 85;
                } else {
                    succes = 80;
                }

                if (succes > random.nextInt(100)) {
                    if (SortingHat.house == "Slytherin") {
                        System.out.println("Vous avez réussi à lancer le sort et êtes Serpentard ! 10 degats supplémentaires");
                        boss.lifePoint = boss.lifePoint - spell.getDamage() - 10;
                        System.out.println("Point de vie de votre ennemi : " + boss.lifePoint);

                    } else {
                        System.out.println("Vous avez réussi à lancer le sort !\n");
                        boss.lifePoint = boss.lifePoint - spell.getDamage();
                        if (boss.lifePoint < 0) {
                            boss.lifePoint = 0;
                        }
                        System.out.println("Point de vie de votre ennemi : " + boss.lifePoint+ "\n\n");
                    }
                } else {
                    if (SortingHat.house == "Gryffondor") {
                        wizard.lifePoint = wizard.lifePoint - 10;
                    } else {
                        System.out.println("Vous avez échoué à lancer le sort, vous perdez des points de vie");
                        wizard.lifePoint = wizard.lifePoint - boss.getDamage();
                        System.out.println("Point de vie restants : " + wizard.lifePoint);
                    }
                }
            } else if (choice == 2) {
                System.out.println("Quel potion voulez-vous prendre ?");
                for(int i = 0; i < wizard.potions.size(); i++) {
                    System.out.println((i + 1) + " = " + wizard.potions.get(i).name);
                }
                int pot = scanner.nextInt();
                Potion potion = wizard.potions.get(sort - 1);
                wizard.lifePoint = wizard.lifePoint + potion.getHealPoint();
                if (wizard.lifePoint > 200) {
                    wizard.lifePoint = 200;
                }
                System.out.println("Vous avez récupéré "+potion.getHealPoint()+" points de vie : " + wizard.lifePoint);
            } else {
                System.out.println("Le choix n'est pas valide, veuillez réessayer");

            }
        }
        if (Boss.lifePoint <= 0) {
            System.out.println("Félicitations ! Vous avez détruit le boss !");
        }

    }

    public static Spell WingardiumLeviosa () {
        Spell spell = new Spell("Wingardium Leviosa", 30, 80, 0, "attaque");
        return spell;
    }

    public static Spell Expelliarmus() {
        Spell spell = new Spell("Expelliarmus", 40, 60, 0, "attaque");
        return spell;
    }

    public static void AvadaKedavra() {
        Spell spell = new Spell("Avada Kedavra", 100, 10, 0, "attaque");
    }

    public static void Protego() {
        Spell spell = new Spell("Protego", 50, 0, 50, "defense");
    }

    public static void Stupefix() {
        Spell spell = new Spell("Stupefix", 40, 50, 0, "attaque");
    }

    public static Spell ExpectoPatronum() {
        Spell spell = new Spell("Expecto Patronum", 85, 0, 0, "attaque");
        return spell;
    }


    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getResistance() {
        return resistance;
    }

    public String getType() {
        return type;
    }


}
