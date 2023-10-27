public class Paladin extends Character{
    public Paladin(String name, String race) {
        super(name, 100, 50, race);
    }

    @Override
    public void attack(Monster target) {
        int currentHealth = target.getHealth();
        currentHealth -= getPower();
        target.setHealth(currentHealth);
    }

    @Override
    public void defend(int attackPower) {
        int currentHealth = getHealth();
        currentHealth += attackPower;
        setHealth(currentHealth);
    }
}
