public class Practice3 {
  public static void main(String[] args){
    System.out.println("[数あてゲーム]");
    int ans = new java.util.Random().nextInt(9);
    for (ans = 0; ans < 5 ; ans++){
      System.out.println("0-9の数字を入れて下さい");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("当たり");
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}