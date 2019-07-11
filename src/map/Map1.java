package map;

import java.util.Map;

public class Map1 {

    public Map<String, String> mapBully(Map<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null && !aValue.equals("")) {
            map.put("b", aValue);
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        String aValue = map.get("a");
        if (aValue != null && !aValue.equals("")) {
            map.put("b", aValue);
        }

        map.remove("c");

        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String abValue = map.get("a") + map.get("b");
            map.put("ab", abValue);
        }

        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            String iceCreamValue = map.get("ice cream");
            map.put("yogurt", iceCreamValue);
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            String potatoValue = map.get("potato");
            map.put("fries", potatoValue);
        }

        if (map.containsKey("salad")) {
            String saladValue = map.get("salad");
            map.put("spinach", saladValue);
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aValue = map.get("a");
            String bValue = map.get("b");
            if (aValue.equals(bValue)) {
                map.remove("a");
                map.remove("b");
            }
        }

        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            String aValue = map.get("a");
            map.put("b", aValue);
        } else if (!map.containsKey("a") && map.containsKey("b")) {
            String bValue = map.get("b");
            map.put("a", bValue);
        }

        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int aLength = map.get("a").length();
            int bLength = map.get("b").length();

            if (aLength > bLength) {
                map.put("c", map.get("a"));
            } else if (aLength == bLength) {
                map.put("a", "");
                map.put("b", "");
            } else {
                map.put("c", map.get("b"));
            }
        }

        return map;
    }


}
