package Midterm02;

public class Player {

    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = 20;
        this.mana = 50;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if ( hp < 0 ) {
            this.hp = 0;
        }
        else if ( hp > 20 ) {
            this.hp = 20;
        }
        else {
            this.hp = hp;
        }
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if ( mana < 0 ) {
            this.mana = 0;
        }
        else if ( mana > 50 ) {
            this.mana = 50;
        }
        else {
            this.mana = mana;
        }
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }

    public boolean equals(Player player) {
        if ( player.getName() == houses.getName()) {
            return true;
        }
        return false;
    }

    public void attack(Player target, Spell spell) {
        if ( houses.getName().equals("Gryffindor")) {
            Gryffindor g = new Gryffindor();
            g.attackSpell(this, target, spell);
        }
        else if ( houses.getName().equals("Hufflepuff")) {
            Hufflepuff h = new Hufflepuff();
            h.attackSpell(this, target, spell);
        }
        if (target.getHp() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + name);
        }
        
    }

    public void protectFromPlayer(Player target) {
        if ( houses.getName().equals("Gryffindor")) {
            Gryffindor g = new Gryffindor();
            g.defense(this, target);
        }
        else if ( houses.getName().equals("Hufflepuff")) {
            Hufflepuff h = new Hufflepuff();
            h.defense(this, target);
        }
    }
}
