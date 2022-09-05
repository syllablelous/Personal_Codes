public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Gear sword = new Gear();

        sword.name = "Longsword";
        sword.type = "Sword";
        sword.rarity = "Common";
        sword.weight = 5.0f;
        sword.description = "This is a longsword, can be used for battle.";

        sword.sayGearDescription();

        Gear helmet = new Gear();

        helmet.name = "Holy Helmet";
        helmet.type = "Helmet";
        helmet.rarity = "Rare";
        helmet.weight = 2.9f;
        helmet.description = "The holiest of all helmets.";

        helmet.sayGearDescription();

        Pet dog = new Pet();

        dog.name = "Browny";
        dog.trust_level = 100;
        dog.isAdopted = false;
        dog.birthday = "04/03/1990";

        Person me = new Person();

        me.firstname = "Russel Jerome";
        me.middlename = 'G';
        me.surname = "Rapi";
        me.age = 17;

        Fruit Mango = new Fruit();

        Mango.color = "yellow";
        Mango.taste = "supersweet";
        Mango.weight = 0.25f;
        Mango.isMyFavorite = true;
        Mango.firstLetterofFruitObject = 'M';
    }
}
