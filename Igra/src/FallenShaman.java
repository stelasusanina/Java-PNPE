public class FallenShaman extends Monster{
    public FallenShaman(String name, String race) {
        super(name, 100, 10, race);
    }

    @Override
    public void attack(Character target) {
        int currentHealth = target.getHealth();
        currentHealth -= getPower();
        target.setHealth(currentHealth);
    }
}
