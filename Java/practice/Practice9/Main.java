public class Main{
  public static void main(String[] args){
    Cleric c = new Cleric();
    c.name = "Harry";
    c.hp = 50;
    c.mp = 10;

    System.out.println(c.name + "登場");
    c.selfAid();
    c.pray(3);
  }
}