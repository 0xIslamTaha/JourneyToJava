package JourneyToJava003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collections {

    static void array(){
        // decleration way #1
        int[] arr_1 = new int[5];
        arr_1[0] = 1;
        arr_1[1] = 2;
        arr_1[2] = 3;
        arr_1[3] = 4;
        arr_1[4] = 5;

        // decleration way #2
        int arr_2[] = new int[]{1, 2, 3, 4, 5};

        // decleration way #3
        int[] arr_3 = new int[]{1, 2, 3, 4, 5};

        for (int i =0; i < arr_1.length; i++){
            System.out.println(arr_1[i]);
            System.out.println(arr_2[i]);
            System.out.println(arr_3[i]);
        }

        int magic[] = new int[]{1, 2, 3, 4, 5};

        for (int x : magic){
            System.out.println(x);
        }
    }

    static void arrayList(){
        ArrayList<String> arrList_obj = new ArrayList<String>();

        //add method
        arrList_obj.add("0xIslamTaha");
        arrList_obj.add(1, "Add me at index 1");

        //get method
        String index_1 = arrList_obj.get(1); //returns the value at index 1
        System.out.println(index_1);

        //Check if the list has this element or not
        boolean chk = arrList_obj.contains("0xIslamTaha"); // return true
        System.out.println(chk);

        //get list size
        System.out.println(arrList_obj.size());

        //chck if list is empty
        System.out.println(arrList_obj.isEmpty());
    }

    static void hashSet(){
        HashSet<String> hashSet_var = new HashSet<String>();
        // add new element
        hashSet_var.add("0xIslamTaha");

        // try to add a duplicate element
        hashSet_var.add("0xIslamTaha");
        System.out.println(hashSet_var);

        // print length of it
        System.out.println(hashSet_var.size());

        // remove an element
        System.out.println(hashSet_var.remove("0xIslamTaha"));

        for (String item : hashSet_var){
            System.out.println(item);
        }
    }

    static void hashMap(){
        // define it
        HashMap<String, Integer> students = new HashMap<String, Integer>();

        // put elements
        students.put("0xIslamTaha", 100);
        students.put("0xMRDream", 50);
        System.out.println(students);

        // Remove an element
        students.remove("0xMRDream");
        System.out.println(students);

        // Iterate over map
        for (String key : students.keySet()){
            System.out.println(key);
            // get value of the key
            System.out.println(students.get(key));
        }
    }

    public static void main(String[] args) {
       // array();
       // arrayList();
        //hashSet();
        hashMap();

    }
}

