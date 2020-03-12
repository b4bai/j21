/*assignment 2
set A
  Example 2*/
import java.io.*;
class student1
{
  static int rno;
  static float max;
  static float per;
  String name;
  student1()
  {
   DataInputStream d=new DataInputStream(System.in);
   try
  {
          
     System.out.println("enter name of students");
      name=d.readLine();
  }catch(IOException e1)
     {
      System.out.println("Error");
     }
    try
    {
     System.out.println("enter percentage  of students");
     String s1=d.readLine();
     this.per=Float.parseFloat(s1);
    }catch(IOException e)
     {
      System.out.println("Error");
     }
  rno++;
 }//constrctor
 void disp()
 { 
  System.out.println("Roll No Of Student is"+rno);
  System.out.println("Name of Student is"+name);
  System.out.println("percentage of student is"+per);
 }//end of disp
  static void sortStudent(student1 std[])
     { 
      for(int j=0;j<std.length();j++)
     {
      for(int i=j+1;i<std.length();i++)
      {
      if(a[j].per>a[i].per)
       {
        temp=std[j].per;
        std[j].per=std[i].per;
        std[i].per=temp; 
       }
      }
     }
    }//sortstd
    public static void main(String args[])
    { 
     int n;
     n=Integer.parseInt(args[0]);
     student1[] std=new student1[n];		
     for(int i=0;i<n;i++)
     { 
      std[i]=new student1(); 
      std[i].disp(); 
      
     }
     student1.sortStudent(std[]);
    
   }//end of main
}