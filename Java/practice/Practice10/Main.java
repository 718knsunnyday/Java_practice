public class Main{
  public static void main(String[] args){
    Zombie z = new Zombie();
    z.name = "studentZombie";
    z.walk();
    z.bite();
    Student s = new Student();
    s.run();
    Zombie z1 = new Zombie();
    z1.name = "teacherZombie";
    z.walk();
    z1.bite();
    z1.go();
    Sword sw = new Sword();
    s.sword = sw;
    System.out.println("学生は" + s.sword.name + "を見つけた。");
  }
}