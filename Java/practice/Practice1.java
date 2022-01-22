public class Practice1{
  public static void main(String[] args){
    int isHungry = 1;
    String food = "たこ焼き";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹いっぱいです");
    } else {
      System.out.println("お腹が空きました");
    }
    if (isHungry == 1){
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}