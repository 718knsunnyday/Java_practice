public class Cleric{
  String name;
  int hp = 50;
  int mp = 10;
  final int maxHp = 50;
  final int maxMp = 10;

  public void selfAid(){
    System.out.println("セルフエイドを使いHPを回復すると決めた。");
    this.mp -= 5;
    this.hp = maxHp;
    System.out.println("HPを回復");
  }

  public void pray(int sec){
    System.out.println(this.name + "は" + sec + "秒間祈った");
    int recover = new java.util.Random().nextInt(3) + sec;
    int calc = Math.min(this.maxMp - this.mp, recover);
    this.mp += calc;
    System.out.println("MPが" + calc + "MP回復した");
  }
}