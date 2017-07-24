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
public class DiamondProblem4 implements Car,Jeep
{ 
   @Override
   public void drive()
   {
      System.out.println("Vehicle is driving");
   }
   public static void main(String args[])
   {    
       DiamondProblem4 ref=new DiamondProblem4();
       ref.drive(); 
   }
}