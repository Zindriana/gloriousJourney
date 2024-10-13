package org.example;

import java.util.List;
import java.util.Random;

public class Battle {

    private EnemyGroup enemyGroup = null;
    private Random rand = new Random();

    public Battle(){
        enemyGroup = new EnemyGroup(rand.nextInt(3)+1);
    }

    public EnemyGroup getEnemyGroup(){
        return enemyGroup;
    }


}
