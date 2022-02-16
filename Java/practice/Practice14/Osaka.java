public class Osaka implements Shop{
  String address;
  String phone;

  public void misoRamen(){
    System.out.println("味噌ラーメン:800円");
  }

  public void friedRice(){
    System.out.println("チャーハン:500円");
  }

  public void beer(){
    System.out.println("ビール:500円");
  }

  public void fried(){
    System.out.println("唐揚げ:400円");
  }
}