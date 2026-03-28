// dictionary
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class packages{
    public static void main(String[] args){
        Dictionary<Integer, String>dict =new Hashtable<>();
        dict.put(101,"abc");
        dict.put(102,"def");
        dict.put(403,"ghi");
        dict.put(104,"jkl");
        dict.put(605,"mno");
        dict.put(106,"pqr");
        dict.put(707,"stu");
        // System.out.println(dict);
        // System.out.println("the size of dictionary is "+dict.size());
        // System.out.println("the value of specified key is:"+dict.get(105));
        // for (Enumeration<Integer> keys=dict.keys();keys.hasMoreElements();){
        //     System.out.println(dict.get(keys.nextElement()));
        // }
        Enumeration<Integer> keys=dict.keys();
        while(keys.hasMoreElements()){
            Integer key1=keys.nextElement();
            if(key1.toString().startsWith("1")){
                System.out.println("key" +key1+ "value" +dict.get(key1));

            }
        }


        }
    }
