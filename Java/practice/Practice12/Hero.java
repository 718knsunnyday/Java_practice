public class Hero{
  String name;
  int hp;

  public void fly(){
    System.out.println(this.name + "は、空を30m飛んだ。");
  }

  public void attack(){
    System.out.println(this.name + "は、敵に突撃した。");
  }

  public void sleep(){
    this.hp += 10;
    System.out.println(this.name + "は、眠って10HP回復した");
  }

  public Hero(String name){
    this.name = name;
    this.hp = 30;
  }
}