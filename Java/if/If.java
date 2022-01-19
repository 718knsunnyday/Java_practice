public class If{
  public static void main(String[] args){
    boolean submit = true;
    if (submit == true){
      System.out.println("提出済");
    } else {
      System.out.println("未提出");
    }
    String open = "８時";
    if (open.equals("９時")){
      System.out.println("営業中");
    } else {
      System.out.println("準備中");
    }
    int fortune = 1;
    switch (fortune){
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("吉");
        break;
    }
    int f = new java.util.Random().nextInt(4);
    switch (f){
      case 1:
        System.out.println("凶");
        break;
      case 2:
      case 3:
        System.out.println("吉");
        break;
      case 4:
        System.out.println("大吉");
        break;
    }
  }
}