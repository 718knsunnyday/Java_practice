public class Array{
  public static void main(String[] args){
    int[] scores = new int[7];
    int num = scores.length;
    System.out.println(num);
    scores[1] = 10;
    System.out.println(scores[1]);
    scores[2] = 20;
    System.out.println(scores[2]);
    int[] ages = {10, 20, 25, 30};
    for ( int i = 0; i < ages.length; i++) {
      System.out.println(ages[i]);
    }
  }
}