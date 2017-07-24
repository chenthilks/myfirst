class A
{
  public void disp()
  {
      System.out.println("A disp() called");
   }
}
class B extends A
{
   public void disp()
   { 
     System.out.println("B disp() called");
   }
}
class C extends A
{
    public void disp()
    {
      System.out.println("C disp() called");
    }
}
public class DiamondProblem2 extends B,C//Not Supported By Java
{
   public static void main(String args[])
   {    
       DiamondProblem2 ref=new DiamondProblem2();
       ref.disp(); // Ambiguity which disp() to call
   }
}