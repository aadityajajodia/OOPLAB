import java.util.Scanner;
class Game
{
  void type()
  {
    System.out.println("Indoor and Outdoor games");
  }
}
class Cricket extends Game
{
  void type()
  {
    System.out.println("Cricket is outdoor game");
  }
}
class Chess extends Game
{
  void type()
  {
    System.out.println("Chess is outdoor game");
  }
}
class AQ1
{
  public static void main(String[] args) {
    Scanner adi=new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1.Criket\n2.Chess");
    int opt=adi.nextInt();
    Game obj=new Game();
    if(opt==1)
    {
      obj=new Cricket();
    }
    else
    if(opt==2)
    {
      obj=new Chess();
    }
    else
    {
      System.out.println("Enter correct option");
    }
    obj.type();
  }
}
