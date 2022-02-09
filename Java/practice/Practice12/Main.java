public class Main{
  public static void main(String[] args){
    Hero h = new Hero("SpiderMan");
    SuperHero sh = new SuperHero("SuperSpiderMan");
    h.fly();
    h.attack();
    h.sleep();
    sh.fly();
  }
}