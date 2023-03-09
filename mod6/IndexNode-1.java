

package index;
import java.util.ArrayList;
import java.util.List;
public class IndexNode  {
String word;
int occurences;
List<Integer> list; 
IndexNode left;
IndexNode right;
public IndexNode(String word, int lineNumber) {
this.word = word;
occurences = 1;
list = new ArrayList<>();
list.add(lineNumber);
}
public void addOccurence(int lineNumber) {
occurences++;
list.add(lineNumber);
}
public String toString(){
return word + " " + occurences + " " + list;
}
}
