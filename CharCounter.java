package root;
import java.util.HashMap;
public class CharCounter {
    static public HashMap<Character, Integer> count(String text)
    {
        char[] chars = text.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < chars.length; i++)
        {
            if(!map.containsKey(chars[i]))
            {
                map.put(chars[i], 1);
            }
            else
            {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        return map;
    }
}
