package Lessons.lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapExmpl {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Vitalii", "30.10.1986");
        myHashMap.put("Alex", "24.07.1989");
        myHashMap.put("Vika", "03.01.1990");

        System.out.println("Do we have Alex? " + myHashMap.containsKey("Alex"));
        System.out.println("Do we have Ira? " + myHashMap.containsKey("Ira"));

        System.out.println("Do we have 30.10.1986? " + myHashMap.containsValue("30.10.1986"));
        System.out.println("Do we have 30.11.1986? " + myHashMap.containsValue("30.11.1986"));

        System.out.println(myHashMap.size());


//        System.out.println("Value for key Alex - " + myHashMap.get("Alex"));
//
//
//        System.out.println("Map before deleting: ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()){
//            System.out.println(i.getKey() + " - " + i.getValue());
//        }
//
//        myHashMap.remove("Alex");
//
//        System.out.println("Map after deleting: ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()){
//            System.out.println(i.getKey() + " - " + i.getValue());
//        }
    }
}
