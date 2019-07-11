package string;

public class String2 {

    public String doubleChar(String str) {
        StringBuilder dChar = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            dChar.append(str.charAt(i)).append(str.charAt(i));
        }
        return dChar.toString();
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();

        return aLow.endsWith(bLow) || bLow.endsWith(aLow);
    }

    public boolean xyzThere(String str) {
        // not done yet
        return false;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.startsWith("b") && sub.endsWith("b")) {
                return true;
            }
        }

        return false;
    }

    public boolean xyBalance(String str) {
        // not done yet
        return false;
    }

    public String mixString(String a, String b) {
        int length = Math.max(a.length(), b.length());
        String mixString = "";
        for (int i = 0; i < length; i++) {
            if (i < a.length()) {
                mixString = mixString.concat(String.valueOf(a.charAt(i)));
            }

            if (i < b.length()) {
                mixString = mixString.concat(String.valueOf(b.charAt(i)));
            }
        }


        return mixString;
    }

    public String repeatEnd(String str, int n) {
        String repeat = "";
        for (int i = 0; i < n; i++) {
            repeat = repeat.concat(str.substring(str.length() - n, str.length()));
        }

        return repeat;
    }

    public String repeatFront(String str, int n) {
        StringBuilder repeat = new StringBuilder();
        for (int i = n; i > 0; i--) {
            repeat.append(str, 0, i);
        }

        return repeat.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }

        StringBuilder separated = new StringBuilder(word);

        for (int i = count; i > 1; i--) {
            separated.append(sep).append(word);
        }

        return separated.toString();
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }

    public boolean xyzMiddle(String str) {
        // not done yet
        return false;
    }

    public String getSandwich(String str) {
        int start = str.indexOf("bread");
        int end = str.lastIndexOf("bread");

        if (start != -1 && end != -1 && start != end) {
            return str.substring(start + 5, end);
        }

        return "";
    }

    public boolean sameStarChar(String str) {
        // not done yet
        return false;
    }

    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }

        return str.substring(1, 3) + str.charAt(0) + oneTwo(str.substring(3));
    }

    public String zipZap(String str) {
        StringBuilder zp = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    zp.append("zp");
                    i += 3;
                } else {
                    zp.append(str.charAt(i));
                    i++;
                }
            } else {
                zp.append(str.substring(i));
                i += 2;
            }

        }
        return zp.toString();
    }

    public String starOut(String str) {
        // not done yet
        return "";
    }

    public String plusOut(String str, String word) {
        StringBuilder plus = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            if (str.substring(i).startsWith(word)) {
                plus.append(word);
                i += word.length();
            } else {
                plus.append("+");
                i++;
            }
        }

        return plus.toString();
    }

    public String wordEnds(String str, String word) {
        // not done yet
        return "";
    }


}
