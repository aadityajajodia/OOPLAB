import java.util.Scanner;
class Bike
{
  int speedlimit=200;
  void run()
  {
    System.out.println("Speed limit "+speedlimit);
  }
}
class Splendar extends Bike
{
  int speedlimit=100;
  void run()
  {
    System.out.println("Speed Limit"+speedlimit);
  }
}
class AQ2
{
  public static void main(String[] args) {
    Bike obj=new Splendar();
    obj.run();
    System.out.println(obj.speedlimit);
  }
}
