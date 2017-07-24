interface Car
{
  public default void drive()
  {
      System.out.println("Car is driving" );
   }
}
public class DiamondProblem6 implements Car
{ 
   public static void main(String args[])
   {    
       DiamondProblem6 ref=new DiamondProblem6();
       ref.drive(); 
   }
}