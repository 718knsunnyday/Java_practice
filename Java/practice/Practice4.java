public class Practice4{
  public static void main(String[] args){
    int[] moneyList = {121902, 8302, 55100};
    for ( int i = 0; i < moneyList.length; i++){
      System.out.println(moneyList[i]);
    }
    for ( int num : moneyList){
      System.out.println(num);
    }
  }
}