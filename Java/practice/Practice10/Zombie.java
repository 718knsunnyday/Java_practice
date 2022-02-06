public class Zombie{
  String name;
  int hp = 30;
  public void bite(){
    this.hp += 10;
    System.out.println(this.name + "は、学生を噛み10HP回復し、" + this.hp + "HPになった。");
  }
  public void walk(){
    System.out.println(this.name + "は、獲物を探している。");
  }
  public void go(){
    this.hp -= 10;
    System.out.println(this.name + "は、音がうるさくて-10HP減り、" + this.hp + "HPになった。");
  }
}