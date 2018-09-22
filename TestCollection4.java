package collection;
import java.util.*;  
class TestCollection4{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();  
  al.add("saran");  
  al.add("sri");  
  al.add("Arun");  
    
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Siya");  
  al2.add("Hanuman");  
    
  al.addAll(al2);    
  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
