package warmup;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return 2*(a + b);
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        else {
            return 2*(n-21);
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10){
            return true;
        }
        return a + b == 10;
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10)) {
            return true;
        }
        return (Math.abs(200 - n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative && ((a<0 && b>0) || (a>0 && b<0))) {
            return true;
        }
        return negative && a < 0 && b < 0;
    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            String N = "not ";
            return N+str;
        }
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1);
        return front + back;
    }

    public String frontBack(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            int A = str.length()-1;
            char[] arr = str.toCharArray();
            char first = arr[0];
            arr[0] = arr[A];
            arr[A] = first;
            return new String(arr);
        }
    }

    public String front3(String str) {
        if (str.length() > 3 ) {
            String substr = str.substring(0, 3);
            return substr + substr + substr;
        } else {
            return str + str + str;
        }
    }

    public String backAround(String str) {
        int last = str.length()-1;
        char add = str.charAt(last);
        return add + str + add;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() > 2) {
            String add = str.substring(0, 2);
            return add + str + add;
        }
        else {
            return str + str + str;
        }
    }

    public boolean startHi(String str) {

        return str.length() >= 2 && str.substring(0, 2).equals("hi");


    }


    public boolean icyHot(int temp1, int temp2) {
        return temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100;
    }

    public boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10) || (b <= 20 && b >= 10);
    }

    public boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

    public boolean loneTeen(int a, int b) {
        return ((a <= 19 && a >= 13) && (b > 19 || b < 13)) || ((a > 19 || a < 13) && (b <= 19 && b >= 13));
    }

    public String delDel(String str) {
        String RMV = "del";
        if (str.length()>=4 && str.substring(1, 4).equals(RMV)) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {

        String result = "";
        if (str.length()>0 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length()>1 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b>c) {
            return b;
        } else {
            return c;
        }
    }

    public int close10(int a, int b) {
        if (Math.abs((a-10)) == Math.abs((b-10))) {
            return 0;
        } else
        if (Math.abs((a-10))>Math.abs((b-10))) {
            return b;
        } else {
            return a;
        }

    }

    public boolean in3050(int a, int b) {
        if (a>=30 && a<=40 && b>=30 && b<=40) {
            return true;
        }
        return a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }

    public int max1020(int a, int b) {
        if (a>=10 && a<=20 && b>=10 && b<=20) {
            if (a>b) {
                return a;
            } else {
                return b;
            }
        }
        if ((a<10 || a>20) && (b<10 || b>20)) {
            return 0;
        }
        if (a >= 10 && a <= 20) {
            return a;
        } else {
            return b;
        }
    }

    public boolean stringE(String str) {
        StringBuilder tmp = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') {
                tmp.append('e');
            }
        }
        return tmp.length() >= 1 && tmp.length() <= 3;
    }

}
