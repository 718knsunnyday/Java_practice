public class Main{
  public static void main(String[] args){
    Student s = new Student();
    s.name = "キラ";
    s.hp = 200;
    System.out.println(s.name + "登場");
    Zombie z = new Zombie();
    z.name = "Zombie1";
    z.hp = 100;
    System.out.println(z.name + "が登場");
    z.run(10);
    z.bite();
    s.bitten();
    s.sleep(10);
    z.kill();
    s.now();
    z.now();
  }
}