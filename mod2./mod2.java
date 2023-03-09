/
 * big o
 * 
 * 1. o(n^2)
 * 2. o(n^4)
 * 3. o(n^2)
 * 4. o(n^3)
 * 5. o(1)
 * 6. o(1)
 * 7. o(n)
 * 8. o(n)
 * 9. o(n log(n))
 * 10. o(n^4)
 * 
 * Arraylist time complexity
 * 
 * 1. o(1)
 * 2. o(n)
 * 3. because we need to shift
 * 4. o(1)
 * 5. o(1), this is at the end of the list so we cant use shift element
 * 6. searching and sorting eleement would be an aprporiate situtation
 * 
 * 7.o(limit)
 * 8. o(n)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner; 
public class Arraylist {
    public static void main(String[] args) {
// calls unique function  (shows true with current list, shows false if we change 
an of them to same nubmer)
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(4);
        boolean q1=unique(list);
        System.out.println(q1);
// call all multiple function 
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(25);
        list1.add(2);
        list1.add(5);
        list1.add(30);
        list1.add(19);
        list1.add(57);
        list1.add(2);
        list1.add(25);
        
        // make an new list of multiples of 5 
        
       List<Integer> list3 = allMultiples(list1,5);
       System.out.println(list3);
       
       
// call allstring function
     List<String> list2 = new ArrayList<String>();
        list2.add("i");
        list2.add("like");
        list2.add("to");
        list2.add("eat");
        list2.add("eat");
        list2.add("eat");
        list2.add("apples");
        list2.add("and");
        list2.add("bananas");
        
        List <String> list4 = allStringsOfSize(list2,3);
        System.out.println(list4);
    
    
// call ispermutations
        List<Integer> list5 = new ArrayList<Integer>();
        list5.add(1);
        list5.add(2);
        list5.add(4);
        
        List<Integer> list6 = new ArrayList<Integer>();
        list6.add(2);
        list6.add(1);
        list6.add(4);
        System.out.println(isPermutation(list5,list6));
        
  
  
  
  
  
// call tokenization      
            token();
        
//call removeall
        List<Integer> list7 = new ArrayList<Integer>();
        list7.add(1);
        list7.add(4);
        list7.add(5);
        list7.add(6);
        list7.add(5);
        list7.add(2);
        
       List<Integer> list8 = removeall(list7);
       System.out.println(list8);
}
    //unique method 
    public static <E> boolean unique(List<E> list) {
        int length = list.size();
        E something,something1;
        for(int i=0;i<length;i++){
            
            something = list.get(i);
            
            for(int j=i+1;j<length;j++){
                
                something1 = list.get(j);
                
                if(something1.equals(something)){
                    
                    return false;
                }
            }
        }
        return true;
    }
    
    
    
// all multiples (notes- %== 0 import the list size then loop thru for multiple) 
    public static List<Integer> allMultiples(List<Integer> list,int divs) {
        
        int size = list.size();
        List<Integer> j = new ArrayList<Integer>();
        Integer something;
        
        for(int i=0;i<size;i++){
            
            something = list.get(i);
            
            if(something% divs==0) {
            
                j.add(something);
            }
        }
        return j;
    }
//allStringsOfSize (similar to multi list )
    public static List<String> allStringsOfSize(List<String> list,int length) {
        
        int size = list.size();
        List<String> j = new ArrayList<String>();
        String something;
        
        for(int i=0;i<size;i++){
            
            something = list.get(i);
            
            if(something.length()==length) {
                
                j.add(something);
            }
        }
        return j;
    }
    
    
    
    
// permutation
public static boolean isPermutation(List<Integer> list5, List<Integer> list6)
{
    
if(list5.size()!=list6.size()) {
return false;
}
// helps sort
Collections.sort(list5);
Collections.sort(list6);
return list5.equals(list6);
    
}
    
    
//removeall
    public static List<Integer> removeall(List<Integer> list) {
        int size = list.size();
        List<Integer> j = new ArrayList<Integer>();
        Integer something;
        
            for(int i=0;i<size;i++){
            
            something = list.get(i);
            
            if(something !=5) {
            
                j.add(something);
            }
        }
        return j;
    }
            
            
            
    public static void token(){
        
        String s = "\" Hello, world!\" \n" ;
        Scanner scanner = new Scanner(s);  
        System.out.println(" [ " + scanner.nextLine() + "] " );  
        
        
    }
        
        
    
    
}
