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
public class DiamondProblem3 implements Car,Jeep
{
   public static void main(String args[])
   {    
       DiamondProblem3 ref=new DiamondProblem3();
       ref.drive(); 
   }
}