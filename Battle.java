package Anya_programist.aaa.monsters;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    int max = 5;
    int a = 0;
    //List<Monster> mons = new ArrayList<Monster>();
    Monster mons[] = new Monster[max];

    void add(Monster monster) {
        if (a < max) {
                mons[a++] = monster;
        } else {
            System.out.println("No more monsters");
        }
    }

    void run() {
        for (int i = 0; i < mons.length; i++) {
            if(mons[i] != null){
                mons[i].attack();
            }
        }
    }

    void start() {
        run();
    }
}
