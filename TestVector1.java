package sort;
import java.util.*;      
class TestVector1{      
 public static void main(String args[]){      
  Vector<String> v=new Vector<String>();//creating vector  
  v.add("saranya");//method of Collection  
  v.addElement("saran");//method of Vector  
  v.addElement("sya");  
  //traversing elements using Enumeration  
  Enumeration e=v.elements();  
  while(e.hasMoreElements()){  
   System.out.println(e.nextElement());  
  }  
 }      
}      