public class Character {
    private String name;
    private int health;
    private int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
    public String CharacterInfo(){
        return "Character name: " + this.name +
                "\nCharacter health: " + this.health +
                "\nCharacter damage: " + this.damage;
    }
    public void CharacterQuote(){
        System.out.println("Жизнь отдам за мир во всем мире");
    }
}
