public class Army{
  String name;
  int hp;
  public void shoot(){
     System.out.println(this.name + "は、国民を殺した。");
  }
  public Army(String name){
    this.hp = 100;
    this.name = name;
  }
  public Army(){
    this("軍2");
  }
}