import java.util.HashMap;

public class FirstUniqueInString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
