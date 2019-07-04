package warmup;

public class WarmUp2 {

    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i<n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<n; i++) {
            if (str.length()>3) {
                result.append(str, 0, 3);
            } else {
                result.append(str);
            }

        }
        return result.toString();
    }

    int countXX(String str) {
        int count = 0;
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x' ) {
                count ++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        boolean exist = str.contains("x");
        if (!exist) {
            return false;
        }
        int first = str.indexOf("x");
        return first < str.length() - 1 && str.charAt(first) == str.charAt(first + 1);
    }

    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i+=2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {

            result.append(str.substring(0, i + 1));
        }
        return result.toString();
    }

    public int last2(String str) {
        int count = 0;
        for (int i = 0; i<str.length()-2; i++) {
            if (str.substring(str.length() - 2).equals(str.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

    public boolean array123(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums.length>2 && nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }

        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int cst = Math.min(lengthA, lengthB);

        int count = 0;
        for (int i=0; i<(cst-1); i++) {
            if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        StringBuilder middle = new StringBuilder();
        if (str.length()<2) return str;
        for (int i = 1; i<str.length()-1; i++) {
            if (!str.substring(i, i+1).equals("x")) {
                middle.append(str, i, i + 1);
            }
        }
        return str.substring(0, 1) + middle + str.substring(str.length()-1);
    }

    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        String tail = "";
        if (str.length()<3) return str;
        for (int i = 0; i<str.length(); i=i+4) {
            if (i==str.length()-1) {
                tail = str.substring(str.length()-1);}
            else {
                result.append(str, i, i + 2);}
        }
        return result+tail;
    }

    public String stringYak(String str) {
        return str.replace("yak", "");
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        boolean time = true;
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
                time = false;
            }
        }
        return time;
    }

    public boolean has271(int[] nums) {
        // not done yet
        return false;
    }

}
