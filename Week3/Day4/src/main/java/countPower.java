import java.util.HashMap;
import java.util.Map;

public class countPower {
    public static void main(String[] args) {
        String str = "aaacccc";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                int temp = map.get(str.charAt(i));
                temp++;
                map.put(str.charAt(i), temp);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        double val = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            int ascii = Math.abs(96 - e.getKey());
            System.out.println("Ascci :" +ascii);
            val += Math.pow(ascii, e.getValue());
            System.out.println("Val : " +val);
        }
        System.out.println("Final : " +val);
    }
}


/*
SELECT COUNT(e.emp_id)
FROM employeees e
WHERE e.hire_date >= 19900101 && e.hire_date <= 20001231;
 */
