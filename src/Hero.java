public class Hero extends Character{
    private CharacterPersonInfo characterPersonInfo;
    public Hero(String name, int health, int damage, CharacterPersonInfo characterPersonInfo) {
        super(name, health, damage);
        this.characterPersonInfo = characterPersonInfo;
    }

    public CharacterPersonInfo getCharacterPersonInfo() {
        return characterPersonInfo;
    }
    public String CharacterInfo(){
        return super.CharacterInfo() +
                "\nCharacter age: " + characterPersonInfo.getAge() +
                "\nCharacter city: " + characterPersonInfo.getCity() +
                "\nCharacter fraction: " + characterPersonInfo.getFraction();
    }
    public final void CharacterQuote(String quote){
        System.out.println("Жизнь отдам за " + quote);
    }
}
