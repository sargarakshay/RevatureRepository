import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findLongestWord {
    public static void main(String[] args) {
        String str = "This_visit_going_to_be_my_last_delhi_visit_this_year";
        String[] strArray = str.split("_");
        int maxLength = 0;

        for (String s : strArray) {
            maxLength = Math.max(maxLength, s.length());
        }

        List<String> stringList = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strArray) {
            if (s.length() == maxLength) {
                if (!stringList.contains(s)) {
                    stringList.add(s);
                }
            }
        }

        Collections.sort(stringList);

        for (String s : stringList) {
            stringBuilder.append(s).append("_");
        }

        System.out.println(stringBuilder.substring(0, stringBuilder.length()-1));

    }
}
