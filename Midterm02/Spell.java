package Midterm02;

public abstract class Spell {
    private final String name;
    private int damage;
    
    public Spell(String name) {
        this.name = name;
        this.damage = 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
}
