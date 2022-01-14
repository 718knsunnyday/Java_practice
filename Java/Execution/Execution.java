// 命令実行の練習。
public class Execution{
  public static void main(String[] args){
    String a = "こんにちは";
    String b = "今日は寒いですね。";
    System.out.print(a);
    System.out.println(b);
    int c = 25;
    int d = 28;
    int e = Math.max(c, d);
    System.out.println(c + "と" + d + "はどちらの方が数字が大きい？" + "答えは" + e + "です。");
    String age = "25";
    int f = Integer.parseInt(age);
    System.out.println("数え年で" + (f + 1) + "歳になります。");
    int g = new java.util.Random().nextInt(30);
    System.out.println(g);
    int h = new java.util.Random().nextInt(30);
    System.out.println(h);
    int i = new java.util.Random().nextInt(1000);
    System.out.println(i);
    System.out.println("あなたの出身地はどこですか？");
    String prefecture = new java.util.Scanner(System.in).nextLine();
    System.out.println("何歳ですか？");
    int j = new java.util.Scanner(System.in).nextInt();
    System.out.println(prefecture + "出身の" + j + "歳です。");
  } 
}