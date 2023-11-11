package skeleton;

import java.util.HashMap;

public class Map {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("java", 0);

        hm.get("java");

        hm.containsKey("java");

        hm.containsValue("java");

        hm.getOrDefault("java", 3); // 값이있으면 get 없으면 설정정

       for(String key :hm.keySet()){ // set 반환
           System.out.println(key);
        }








}

