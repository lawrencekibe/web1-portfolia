import java.util.Scanner;
// area of a rectangle

class AreaOfRectangle {
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   }
}

// perimeter of a rectangle
public class Main  
 {  
   public static void main (String args[])  
    {      float a ,b, c, d, perimeter;  
                    a=c= 5;  
                    b=d=4;  
                    perimeter  = 2*(a+b);  
            System.out.println("Perimeter of Rectangle is: "+perimeter);  
    }}  

    // volume of a sphere
    double sphereDiam;
    double sphereRadius;
    double sphereVolume;
    
    System.out.println("Enter the diamater of a sphere:");
    sphereDiam = keyboard.nextInt();
    sphereRadius = (sphereDiam / 2.0);
    sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphereRadius, 3 );
    System.out.println("The volume is: " + sphereVolume);

    // circumference of a circle
    public class CircumfrenceOfCircle {
        public static void main(String args[]){
           int radius;
           double circumference;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the radius of the circle ::");
           radius = sc.nextInt();
           circumference = Math.PI*2*radius;
           System.out.println("Circumference of the circle is ::"+circumference);
        }
     }

     // area of a circle

interface AreaCal
{
	void circle();
}
class AreaOfCircle implements AreaCal
{
	 double area;
	public void circle(double r)
	{
	area= (22*r*r)/7;
	}
   public static void main(String args[]) 
    {
      AreaOfCircle x;   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();
      x=new AreaOfCircle();
      x.circle(rad);      
      System.out.println("Area of Circle is: " + x.area);      
   }
 }

 // volume of a box

 class VolumeOfBox 
{
      
   public static void main(String args[]) 
    {   
       
        	Scanner s= new Scanner(System.in);
         	System.out.println("Enter the length of box:");
         	double l=s.nextDouble();
		System.out.println("Enter the breadth of box:");
         	double b=s.nextDouble();
		System.out.println("Enter height of box:");
         	double h=s.nextDouble();
                
                 double  volume= l*b*h;
 
             System.out.println("Volume Of boxis:" +volume);
             
          
   }
}

// surface area of a box

class VolumeOfBox 
{
      
   public static void main(String args[]) 
    {   
       
        	Scanner s= new Scanner(System.in);
         	System.out.println("Enter the length of box:");
         	double l=s.nextDouble();
		System.out.println("Enter the breadth of box:");
         	double b=s.nextDouble();
		System.out.println("Enter height of box:");
         	double h=s.nextDouble();
                
                 double  volume= l*b*h;
 
             System.out.println("Volume Of boxis:" +volume);
             
          
   }
}