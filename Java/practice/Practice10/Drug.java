public class Drug{
  String name = "絆創膏";
  int hp = 20;
  public void heal(Student s){
    s.hp += 20;
    System.out.println(s.name + "は、絆創膏を見つけ20HP回復した。");
  }
}