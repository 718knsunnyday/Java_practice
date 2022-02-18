public class Wizard{
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    if (hp < 0 ){
      this.hp = 0;
    }
    else{
      this.hp = hp;
    }
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if ( name == null || name.length() < 3){
      throw new IllegalArgumentException
      ("魔法使いの名前が異常です。")
    }
    this.name = name;
  }

  public Wand getWand(){
    return this.wand;
  }
  public void setWand(Wand wand){
    if ( wand == null)
    throw new IllegalArgumentException
    ("魔法使いが杖を持ってないです。")
  }
  this.wand = wand;
}