public class Student{
  String name;
  int hp;

  public void sleep(int sec){
    this.hp += sec;
    System.out.println(this.name + sec + "秒寝たので" + sec + "HP回復した");
  }

  public void bitten(){
    this.hp = 50;
    System.out.println(this.name + "はゾンビに噛まれたので" + this.hp + "HP減った");
  }

  public void now(){
    System.out.println("現在の" + this.name + "のHPは" + this.hp);
  }
}