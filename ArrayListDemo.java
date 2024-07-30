import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // add your five friend name
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Ram");
        namelist.add("shyam");
        namelist.add("hanuman");
        namelist.add("mahadev");
        namelist.add("Rohit");
        for(String name : namelist){
            System.out.println(name);
        }

        //to get the specific value using index
        System.out.println(namelist.get(namelist.size()-1));
        // sort the arraylist
        Collections.sort(namelist);
        System.out.println(namelist);
        //reverse the arrayList Element

        for(int i = namelist.size()-1; i >= 0; i --){
            System.out.println(namelist.get(i));
        }
        //find the duplicate array in arraylist
        int dublicate = 0;
        for (int i = 0; i < namelist.size(); i++) {
            for (int j   =  i+1; j   < namelist.size(); j  ++) {
                if (namelist.get(i).equals(namelist.get(j))){
                    dublicate++;
                }
            }
        }
        System.out.println("Dublicate data is "+dublicate);

    }
}
