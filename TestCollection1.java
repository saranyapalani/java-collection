package collection;
import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Ajith");//adding object in arraylist  
  al.add("Akash");  
  al.add("Saranya");  
  al.add("Arjun");  
  
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
