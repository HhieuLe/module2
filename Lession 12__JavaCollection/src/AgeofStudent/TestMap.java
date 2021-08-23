package AgeofStudent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Cao Thanh Binh", 50);
        hashmap.put("Binh Cao Thanh", 35);
        hashmap.put("Thanh Cao Binh", 25);
        hashmap.put("Cao Binh", 26);
        System.out.println("display hashmap");
        System.out.println(hashmap + "\n\n    ");

        Map<String, Integer> treemap=new TreeMap<>(hashmap);
        System.out.println("In nè: ");
        System.out.println(treemap);

        Map<String, Integer> linkedHasmp = new LinkedHashMap<>(16,0.75f,true);
        linkedHasmp.put("Cao Thanh Binh",55);
        linkedHasmp.put("Binh Thanh Cao",64);
        linkedHasmp.put("Binh Cao Thanh",68);
        linkedHasmp.put("Cao Binh",55);
        System.out.println("In nè: ");
        System.out.println("The age for " + "Cao Thanh Binh is " + linkedHasmp.get("Cao Thanh Binh"));
        System.out.println("The age for " + "Binh Thanh Cao is " + linkedHasmp.get("Binh Thanh Cao"));
        System.out.println("The age for " + "Binh Cao Thanh is " + linkedHasmp.get("Binh Cao Thanh"));
        System.out.println("The age for " + "Cao Binh is " + linkedHasmp.get("Cao Binh"));
    }
}
