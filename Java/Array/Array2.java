public class Array2{
  public static void main(String[] args){
    int[] scores = {10, 20, 30, 40};
    int sum = 0;
    for ( int i = 0; i < scores.length; i++){
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println(sum);
    System.out.println(avg);
  }
}