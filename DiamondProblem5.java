interface Car
{
  public default void drive()
  {
      System.out.println("Car is driving" );
   }
}
interface Jeep
{
   public default void drive()
   { 
     System.out.println("Jeep is driving");
   }
}
public class DiamondProblem5 implements Car,Jeep
{ 
   @Override
   public void drive()
   {
       Car.super.drive();    
      //System.out.println("Vehicle is driving");
   }
   public static void main(String args[])
   {    
       DiamondProblem5 ref=new DiamondProblem5();
       ref.drive(); 
   }
}