package collection;
import java.util.*;  
class TestCollection6{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ram");  
  al.add("Vijay");  
  al.add("Ajith");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ram");  
  al2.add("Hanumat");  
  
  al.retainAll(al2);  
  
  System.out.println("iterating the elements after retaining the elements of al2...");  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
