package org.example;

import java.util.ArrayList;
import java.util.List;

public class HeroParty {

    List<Hero> heroes;

    public HeroParty() {
        heroes = new ArrayList<Hero>();
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

}
