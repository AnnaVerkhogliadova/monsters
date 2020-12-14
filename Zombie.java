package Anya_programist.aaa.monsters;

public class Zombie extends Monster {
    String name;
    int damage = 5;
    public static String scream = "Raaaauuughhhh";

    Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean a) {
        if (a = true) {
            System.out.print(scream.toUpperCase());
            super.growl();
        } else {
            growl();
        }
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }

    public static void main(String[] args) {
/*

You have to overload class Zombie

*/

        Zombie zombie1 = new Zombie("Alice");
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);


/*
This fragment of code has to output

Monster Alice the Zombie was created
Raaaauuughhhh Alice the Zombie growled
RAAAAUUUGHHHH Alice the Zombie growled
Raaaauuughhhh Alice the Zombie growled

*/
    }
}

