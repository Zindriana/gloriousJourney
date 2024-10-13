package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BattleTest {

    Battle battle = new Battle();

    @Test
    public void testBattle() {

    }

    @Test
    public void createEnemyGroupTest(){
        String enemyName = battle.getEnemyGroup().enemies.getFirst().getName();

        assertEquals("Orc", enemyName);
        assertTrue(battle.getEnemyGroup().enemies.size()<4 && !battle.getEnemyGroup().enemies.isEmpty());
    }

}