
abstract class MVPMonster{
    
    String name ="";
    public void printName(){
        System.out.println(name);
    }
}

class MoonlightFlower extends MVPMonster{
    public MoonlightFlower(){
        name = "MoonlightFlower";
    }
}

class Osiris extends MVPMonster{
    public Osiris(){
        name = "Osiris";
    }
}

class Baphomet extends  MVPMonster{
    public Baphomet(){
        name = "Baphomet";
    }
}

class Kafra_naive{
    public void save(){
        System.out.println("save");
    }
    public void openStorage(){
        System.out.println("open storage");
    }

    public MVPMonster summonMVP(String town){
        if(town =="Payon"){
            return new MoonlightFlower();
        }else
        if(town =="Morroc"){
            return new Osiris();
        }

        return new Baphomet();
    }
}

abstract class Kafra_factoryMethod{
    public void save(){
        System.out.println("save");
    }
    public void openStorage(){
        System.out.println("open storage");
    }
    abstract public MVPMonster summonMVP();

}

class KafraPayon extends Kafra_factoryMethod{
    public MVPMonster summonMVP(){
        return new MoonlightFlower();
    }
}

class KafraMorroc extends Kafra_factoryMethod{
    public MVPMonster summonMVP(){
        return new Osiris();
    }
}




class Main{
    public static void main(String args[]){
        Kafra_naive kafra_naive = new Kafra_naive();
        MVPMonster mvp_1 = kafra_naive.summonMVP("Payon");
        mvp_1.printName();

        KafraPayon kafraPayon = new KafraPayon();
        MVPMonster mvp_2 = kafraPayon.summonMVP();
        mvp_2.printName();


    }
}