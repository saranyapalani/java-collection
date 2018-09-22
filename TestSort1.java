package sort;
import java.util.*;  
class TestSort1{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("dhoni");  
al.add("Saurav ganguly");  
al.add("Mukesh");  
al.add("jadeja");  
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  
