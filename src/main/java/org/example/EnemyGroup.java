package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnemyGroup {
    List<Enemy> enemies;

    public EnemyGroup(int groupSize){
        enemies = new ArrayList<>();
        for (int i = 0; i < groupSize; i++) {
            enemies.add(createEnemy("Orc"));
        }
    }

    private Enemy createEnemy(String name){
        Enemy enemy = new Enemy(name);
        return enemy;
    }

}
