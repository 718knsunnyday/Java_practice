public class Main{
  public static void main(String[] args){
    Osaka o = new Osaka();
    o.misoRamen();
    o.friedRice();
    o.beer();

    Shop s = new Osaka();
    s.misoRamen();

    // s.fried();　エラー
  }
}