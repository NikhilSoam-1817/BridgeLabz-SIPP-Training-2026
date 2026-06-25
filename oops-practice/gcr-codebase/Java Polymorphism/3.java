class GameCharacter{
    String name;

    GameCharacter(String n){
        name=n;
    }

    void performAttack(){}
}

class Warrior extends GameCharacter{
    Warrior(String n){
        super(n);
    }
    @Override
    void performAttack(){
        System.out.println(name+" attacks with sword");
    }
}

class Mage extends GameCharacter{
    Mage(String n){
        super(n);
    }
    @Override
    void performAttack(){
        System.out.println(name+" casts spell");
    }
}

class Main{
    static void startBattle(GameCharacter[] arr){
        for(GameCharacter g:arr)
            g.performAttack();
    }

    public static void main(String[] args){
        GameCharacter[] arr={
            new Warrior("Arjun"),
            new Mage("Harry")
        };

        startBattle(arr);
    }
}