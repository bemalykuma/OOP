package Midterm02;

public class Hufflepuff extends Houses implements Magicable{
    public Hufflepuff() {
        super("Hufflepuff","Yellow");
    }
    
    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        if ( spell instanceof Incendio ) {
            target.setHp(target.getHp() - (spell.getDamage() + player.getAttackDamage()));
            player.setMana(player.getMana()-3);
        }
        else if ( spell instanceof Expelliarmus) {
            target.setHp(target.getHp() - (spell.getDamage() + player.getAttackDamage()));
            player.setMana(player.getMana()-4);
        }
        System.out.println("[" + player.getName() + "]: use spell (" + spell.getName()+ ")!" );
    }
    
    @Override
    public void defense(Player player, Player damager) {
        player.setHp(player.getHp() + 4);
        player.setMana(player.getMana() + 3);
        System.out.println("[" + player.getName()+ "]: Protego !");
    }
}
