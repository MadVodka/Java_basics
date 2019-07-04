package recursion;

public class Recursion1 {

    public int factorial(int n) {
        if (n==1) {
            return n;
        } else {
            return n*factorial(n-1);
        }

    }

    public int bunnyEars(int bunnies) {
        if (bunnies==0) return 0;

        return 2+bunnyEars(bunnies-1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int bunnyEars2(int bunnies) {
        int oddEars = 2;
        int evenEars = 3;
        if (bunnies==0) {
            return 0;
        } else if (bunnies%2==0) {
            return evenEars+bunnyEars2(bunnies-1);
        } else {
            return oddEars+bunnyEars2(bunnies-1);
        }
    }


    public int triangle(int rows) {
        if (rows==0) {
            return 0;
        }

        return rows+triangle(rows-1);
    }

    public int sumDigits(int n) {
        if (n==0) {
            return 0;
        }
        return n%10+sumDigits(n/10);
    }

    public int count7(int n) {
        int count = 0;
        if (n==0) {
            return 0;
        }

        if (n%10==7) {
            count++;
        }

        return count+count7(n/10);
    }

    public int count8(int n) {
        int count = 0;
        if (n==0) {
            return 0;
        }

        if (n%10==8) {
            count++;

            if ((n/10)%10==8) {
                count++;
            }
        }


        return count+count8(n/10);
    }

    public int powerN(int base, int n) {
        if (n==0) return 1;
        return base*powerN(base, n-1);
    }

    public int countX(String str) {
        int count = 0;
        if (str.length()==0) {
            return 0;
        }

        if (str.charAt(0)=='x') {
            count++;
        }

        return count+countX(str.substring(1));
    }

    public int countHi(String str) {
        if (str.length()<2) return 0;
        int count = 0;

        if (str.startsWith("hi")) {
            count++;
            return count+countHi(str.substring(2));
        } else {
            return count+countHi(str.substring(1));
        }
    }

    public String changeXY(String str) {
        if (str.length()==0) return "";
        if (str.charAt(0)=='x') {
            return 'y'+changeXY(str.substring(1));
        } else {
            return str.charAt(0)+changeXY(str.substring(1));
        }
    }

    public String changePi(String str) {
        if (str.length()<2) {
            return str;
        }

        if (str.startsWith("pi")) {
            return "3.14"+changePi(str.substring(2));
        } else {
            return str.substring(0, 1) + changePi(str.substring(1));
        }
    }

    public String noX(String str) {
        if (str.length()==0) return "";

        if (str.startsWith("x")) {
            return noX(str.substring(1));
        } else {
            return str.substring(0, 1) + noX(str.substring(1));
        }
    }

    public boolean array6(int[] nums, int index) {
        if (index>=nums.length) return false;

        if (nums[index]==6) {
            return true;
        } else {
            return array6(nums, ++index);
        }
    }

    public int array11(int[] nums, int index) {
        if (index>=nums.length) {
            return 0;
        }

        int count = 0;
        if (nums[index]==11) {
            count=1;
        }
        return count+array11(nums, index+1);
    }

    public boolean array220(int[] nums, int index) {
        if (index>=nums.length-1) {
            return false;
        }

        if (nums[index]*10==nums[index+1]) {
            return true;
        } else {
            return array220(nums, index+1);
        }
    }

    public String allStar(String str) {
        if (str.length()<=1) {
            return str;
        }

        return str.substring(0, 1)+"*"+allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length()<=1) {
            return str;
        }

        String part;
        if (str.charAt(0)==str.charAt(1)) {
            part = str.charAt(0)+"*";
        } else {
            part = ""+str.charAt(0);
        }
        return part+pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length()==0) {
            return "";
        }

        if (str.charAt(0)=='x') {
            return endX(str.substring(1))+'x';
        }
        return str.charAt(0)+endX(str.substring(1));
    }

    public int countPairs(String str) {
        if (str.length()<=2) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0)==str.charAt(2)) {
            count =1;
        }
        return count+countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length()<3) {
            return 0;
        }

        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1+countAbc(str.substring(2));
        } else {
            return countAbc(str.substring(1));
        }
    }

    public int count11(String str) {
        if (str.length()<2) {
            return 0;
        }

        if (str.startsWith("11")) {
            return 1+count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }
    }

    public String stringClean(String str) {
        if (str.length()<2) {
            return str;
        }

        if (str.charAt(0)==str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0)+stringClean(str.substring(1));
        }
    }

    public int countHi2(String str) {
        if (str.length()<2) {
            return 0;
        }

        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        } else if (str.startsWith("hi")){
            return 1+countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }

    public String parenBit(String str) {
        int start = str.indexOf("(");
        if (start>-1) {
            return "("+parenBit(str.substring(start+1));
        } else {
            if (str.charAt(0)==')') {
                return ")";
            } else {
                return str.charAt(0)+parenBit(str.substring(1));
            }
        }
    }

    public boolean nestParen(String str) {
        if (str.length()==0) {
            return true;
        }
        if (str.startsWith("(")&&str.endsWith(")")) {
            return nestParen(str.substring(1, str.length()-1));
        } else {
            return false;
        }
    }

    public int strCount(String str, String sub) {
        if (str.length()<sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1+strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n==0) {
            return true;
        } else if (str.length()<sub.length()) {
            return false;
        }

        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n-1);
        }

        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.length()<sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) {
                return str.length();
            } else {
                return strDist(str.substring(0, str.length()-1), sub);
            }
        } else {
            return strDist(str.substring(1), sub);
        }
    }

}
