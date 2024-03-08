public class Main {
    public static void main(String[] args) {
        //создание объекта второго уровня
        CharacterPersonInfo characterPersonInfoOfVelzevul =
                new CharacterPersonInfo(300, "Helltown", "Evil");
        Hero velzevul = new Hero("Velzevul", 2000, 100, characterPersonInfoOfVelzevul);
        System.out.println(velzevul.CharacterInfo());
        velzevul.CharacterQuote("Сатану");
        System.out.println("");
        //создание первого объекта третьего уровня, тут добавляется новое поле
        CharacterPersonInfo characterPersonInfoOfArcher1 =
                new CharacterPersonInfo(30, "Shefild", "Forest Warriors");
        Archer robinHood = new Archer("Robin Hood", 500, 20,
                characterPersonInfoOfArcher1, Weapon.BOW);
        System.out.println(robinHood.CharacterInfo());
        velzevul.CharacterQuote("деньги");
        System.out.println("");
        //создание первого объекта третьего уровня, тут добавляется новое поле
        CharacterPersonInfo characterPersonInfoOfArcher2 =
                new CharacterPersonInfo(18, "West Sea", "Pirates");
        Archer usopp = new Archer("Usop", 300, 10,
                characterPersonInfoOfArcher1, Weapon.BOW);
        System.out.println(usopp.CharacterInfo());
        velzevul.CharacterQuote("Луффи");
    }
}