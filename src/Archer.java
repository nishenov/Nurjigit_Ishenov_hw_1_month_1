public final class Archer extends Hero {
    private Weapon weapon;

    public Archer(String name, int health, int damage, CharacterPersonInfo characterPersonInfo, Weapon weapon) {
        super(name, health, damage, characterPersonInfo);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public String CharacterInfo(){
        return super.CharacterInfo() +
                "\nCharacter weapon: " + this.weapon;
    }
}
