public class Main{
  public static void main(String[] args){
    Zombie z = new Zombie();
    z.name = "studentZombie";
    z.walk();
    z.bite();
    Student s = new Student();
    s.name = "一生";
    s.run();
    Zombie z1 = new Zombie();
    z1.name = "teacherZombie";
    z.walk();
    z1.bite();
    z1.go();
    Student s1 = new Student();
    s1.name = "サツキ";
    s1.run();
    Sword sw = new Sword();
    s.sword = sw;
    System.out.println(s.name + "は、" + s.sword.name + "を見つけた。");
    Drug d = new Drug();
    d.heal(s);
    d.heal(s1);
  }
}