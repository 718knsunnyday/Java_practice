public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "中野";
    h.hp = 100;
  }
}



public class Hero{
  String name;
  int hp;
  int level = 10;

  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！")；
  }
}