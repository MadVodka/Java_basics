package map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, 0);
            }
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, str.length());
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String str : strings) {
            map.put(str.substring(0, 1), str.substring(str.length() - 1, str.length()));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                Integer count = map.get(str) + 1;
                map.put(str, count);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str.substring(0, 1))) {
                map.put(str.substring(0, 1), str);
            } else {
                map.put(str.substring(0, 1), map.get(str.substring(0, 1)) + str);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                Integer count = map.get(str) + 1;
                map.put(str, count);
                if (map.get(str) % 2 == 0) {
                    result += str;
                }
            }
        }
        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, false);
            } else {
                map.put(str, true);
            }
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String first = strings[i];
            if (!map.containsKey(i)) {
                for (int j = 0; j < strings.length; j++) {
                    String second = strings[j];
                    if (!map.containsKey(j) && first.charAt(0) == second.charAt(0)
                            && !first.equals(second)) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                        map.put(i, "");
                        map.put(j, "");
                        break;
                    }
                }
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String first = strings[i];
            if (!map.containsKey(first.substring(0, 1))) {
                for (int j = 0; j < strings.length; j++) {
                    String second = strings[j];
                    if (!map.containsKey(j) && first.charAt(0) == second.charAt(0)
                            && !first.equals(second)) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                        map.put(first.substring(0, 1), "");
                        break;
                    }
                }
            }
        }
        return strings;
    }

}
