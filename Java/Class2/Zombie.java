public class Zombie{
  String name;
  int hp;

  public void bite(){
    this.hp = 50;
    System.out.println(this.name + "は学生を噛み、お腹を満たし、" + this.hp + "HP回復した" );
  }

  public void run(int sec){
    this.hp -= sec;
    System.out.println(this.name + "は" + sec + "秒走った");
    System.out.println("Zombie1は" + sec + "HP減った");
  }

  public void kill(){
    this.hp = 50;
    System.out.println(this.name + "は撃たれたので" + this.hp + "HP減った");
  }

  public void now(){
    System.out.println("現在の" + this.name + "のHPは" + this.hp);
  }
}