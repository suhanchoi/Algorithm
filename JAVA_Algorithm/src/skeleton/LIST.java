package skeleton;

import java.util.*;

public class LIST {

        // List<Integer> list = new ArrayList<Integer>(); 업케스팅 왜 안되는지?
        // List<Integer> linkedList = new LinkedList<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int arrayListLength = arrayList.size();

        arrayList.add();
        arrayList.set();
        arrayList.remove();
        arrayList.contains();
        arrayList.indexOf();

        Iterator it = arrayList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        while(it.hasPrevious()){
            System.out.println(it.next());
        }

        if(arrayList.indexOf(value) < 0 ){ // 값을 중복없이 넣고 싶을때
            // 값 없으면 음수 반환환
           arrayList.put(value);
        }

        for(int i = 0; i < arrayList.size(); i++){
            arrayList.get(i).intValue(); // Integer -> int
        }

        Collections.sort(arrayList); // List 정렬

        // Set -> ArrayList
        Set<String> set = new HashSet<String>();
        LIST<String> menuList = new ArrayList<>(set);


}
