public class Chapter6{
  public static void main(String[] args){
    int val = 2 + 5;
    System.out.println(val);
    ++val;
    System.out.println(val);
    System.out.println(val*5);
    boolean bool = (val == 50);
    System.out.println(bool);
    bool = (50 > val) && (val % 10 == 0);
    System.out.println(bool);
  }
}