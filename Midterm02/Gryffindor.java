package Midterm02;

public class Gryffindor extends Houses implements Magicable{
    public Gryffindor() {
        super("Gryffindor","RED");
    }
    
    @Override
    public void attackSpell(Player player, Player target, Spell spell) {
        if ( spell instanceof Incendio ) {
            target.setHp(target.getHp() - (spell.getDamage() + player.getAttackDamage()));
            player.setMana(player.getMana()-4);
            System.out.println("[" + player.getName() + "]: use spell (" + spell.getName()+ ")!" );
        }
        else if ( spell instanceof Expelliarmus) {
            target.setHp(target.getHp() - (spell.getDamage() + player.getAttackDamage()));
            player.setMana(player.getMana()-3);
            System.out.println("[" + player.getName() + "]: use spell (" + spell.getName()+ ")!" );
        }
    }
    
    @Override
    public void defense(Player player, Player damager) {
        player.setHp(player.getHp() + 3);
        player.setMana(player.getMana() + 4);
        System.out.println("[" + player.getName()+ "]: Episkey !");
    }
}
