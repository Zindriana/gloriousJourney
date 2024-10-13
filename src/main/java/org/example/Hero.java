package org.example;

public class Hero {

    private String name;
    private int hp; //health points
    private int ap; //ability points
    private int att; //attack, the ability to hit the enemy
    private int def; //defence, reduce the enemy's chance to hit
    private int heal; //healing efficiency
    private int spd; //speed, how often a hero can make an action in combat
    private int dam; //damage


    public Hero(String name){
        this.name = name;
        this.hp = 10;
        this.ap = 10;
        this.att = 10;
        this.def = 10;
        this.heal = 10;
        this.spd = 10;
        this.dam = 10;

    }

    public int getDam() {
        return dam;
    }

    public void setDam(int dam) {
        this.dam = dam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }
}
