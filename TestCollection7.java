package collection;
import java.util.*;  
public class TestCollection7{  
 public static void main(String args[]){  
   
  LinkedList<String> al=new LinkedList<String>();  
  al.add("anirudh");  
  al.add("balaji");  
  al.add("shazia");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
