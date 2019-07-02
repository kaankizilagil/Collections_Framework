
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Main {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
    
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        System.out.println("*****************************************");
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        
        System.out.println("*****************************************");
        
        for(int i = 0 ; i < list.size() ; i++) {
            
            System.out.println(list.get(i));
        }
        
        System.out.println("*****************************************");
        
        for(String s : list) {
            
            System.out.println(s);
        }
        
        System.out.println("*****************************************");
        
        list.remove("Java");
        
        for(String s : list) {
            
            System.out.println(s);
        }
    }   
}
