
interface InterfaceA
{
  public void disp();
}
interface InterfaceB
{
  public  void disp(); 
}

public class DiamondProblem implements InterfaceA,InterfaceB
{
    public void disp()
   {
     System.out.println("disp() method implementation");
   }
   public static void main(String args[])
   {    
       DiamondProblem ref=new DiamondProblem();
       ref.disp();
   }
}