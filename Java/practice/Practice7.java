public class Practice7{
  public static void main(String[] args){
    String title = "ご挨拶";
    String address = "12345@test.com";
    String text = "こんにちは";
    email(title, address, text);
    email(address, text);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下の内容を送りました。");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }
  public static void email(String address, String text){
    System.out.println(address + "に、以下の内容を送りました。");
    System.out.println("件名:無題");
    System.out.println("本文:" + text);
  }
}