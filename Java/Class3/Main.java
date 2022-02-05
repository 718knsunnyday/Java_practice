public class Main{
  public static void main(String[] orgs){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    h.name = "湊";
    h.hp = 100;
    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);
    Wizard w = new Wizard();
    w.name = "魔女";
    w.hp = 50;
    w.heal(h);
    SuperHero sh = new SuperHero();
    sh.attack();
    sh.fly();
  }
}