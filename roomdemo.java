public class ja
{
  double length,width,height,windows;
  void setattr(double l,double w,double h,double wa)
     {
         length = l;
         width = w;
         height = h;
         windows = wa;
         
            
         
     }
     
   double area()
   {
       double areaa = length * width; 
       return areaa;
   }
    
   void display()
     {
     System.out.print(length);
     System.out.print(area());
     }
     
     	
	}
class at
{
    public static void main(String[] args)
    {
        
        ja ar = new ja();
        ar.display();
    }
    
    
    
    
    
    
    
    
}
