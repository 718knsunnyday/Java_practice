public class Student{
  String name;
  int hp = 100;
  int mp = 50;
  Sword sword;
  public void run(){
    System.out.println(this.name + "はソンビから逃げる。");
  }
  public void eat(){
    this.hp += 10;
    System.out.println(this.name + "は食べ物を見つけて食べたおかげで、体力が回復した。");
  }
}