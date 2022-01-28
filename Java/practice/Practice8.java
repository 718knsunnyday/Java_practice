public class Practice8{
  public static void main(String[] args){
    double a = calcTriangleArea(10, 10);
    double b = calcCircleArea(10);
    System.out.println("三角形の面積:" + a + ", 円の面積:" + b );
  }
  public static double calcTriangleArea(double bottom, double height){
  double a = bottom*height/2;
  return a;
  }
  public static double calcCircleArea(double radius){
    double b = radius*radius*3.14;
    return b;
  }
}