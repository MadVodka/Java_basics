package string;

public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }


    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    public String firstTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2);
        }
        return str;
    }

    public String firstHalf(String str) {
        int middle = (str.length()) / 2;
        return str.substring(0, middle);
    }

    public String withoutEnd(String str) {

        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() < 3) return str;
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        if (str.length() < 3) return str;
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle) + str.substring(middle, middle + 1);
    }

    public boolean endsLy(String str) {
        int end = str.length() - 2;
        return str.length() > 1 && str.substring(end).equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        if (str.length() < 4) return str;
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    public boolean hasBad(String str) {

        if (str.length() < 4 && !str.equals("bad"))
            return false;
        else
            return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");

    }

    public String atFirst(String str) {
        if (str.length() == 1) {
            return str + "@";
        }
        if (str.length() == 0) {
            return "@@";
        }
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if ((a.length() > 0 && b.length() > 0) && a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }
        return str;
    }

    public String seeColor(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() > 3 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        }
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        } else return a.substring(a.length() - b.length()) + b;
    }

    public String extraFront(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        return str + str + str;
    }

    public String without2(String str) {
        if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        String result = "";
        if (str.charAt(0) == 'a') {
            result = result + "a";
        }
        if (str.charAt(1) == 'b') {
            result = result + "b";
        }
        result = result + str.substring(2);
        return result;
    }

    public String startWord(String str, String word) {
        if (str.length() >= word.length() && word.length() > 0 && word.substring(1).equals(str.substring(1, word.length()))) {
            return str.charAt(0) + word.substring(1);
        }
        return "";
    }

    public String withoutX(String str) {
        String result = str;
        if (str.length() < 1) return str;
        if (str.length() > 1 && str.charAt(0) == 'x') {
            result = result.substring(1);
        }
        if (result.charAt(result.length() - 1) == 'x') {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }

    public String withoutX2(String str) {
        String res1 = "";
        if (str.length() < 1) return str;
        if (str.charAt(0) == 'x') {
            res1 = "";
        } else {
            res1 = str.substring(0, 1);
        }

        if (str.length() > 1 && str.charAt(1) == 'x') {
            res1 = res1 + str.substring(2);
        } else {
            res1 = res1 + str.substring(1);
        }
        return res1;
    }

}
