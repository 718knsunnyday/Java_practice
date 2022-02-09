public class SuperHero extends Hero{
  public void fly(){
    super.fly();
  }
  public SuperHero(String name){
    super("SpiderMan");
    this.name = name;
    this.hp = 50;
  }
}