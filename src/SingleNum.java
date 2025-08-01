import java.util.HashSet;
import java.util.Iterator;

public class SingleNum {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer el: nums) {
            if (set.contains(el)) {
                set.remove(el);
            }
            else {
                set.add(el);
            }
        }

        Iterator<Integer> it = set.iterator();
        return it.next();
    }

    public int singleNumberxor(int[] nums) {
        int result = 0;
        for (int el: nums) {
            result ^= el;
        }
        return result;
    }
}
