package string;

public class String3 {
    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        String baseIgnoreCase = base.toLowerCase();
        String removeIgnoreCase = remove.toLowerCase();
        for (int i = 0; i < base.length(); ) {
            if (!baseIgnoreCase.startsWith(removeIgnoreCase, i)) {
                result.append(base.charAt(i));
                i++;
            } else {
                i += remove.length();
            }
        }
        return result.toString();
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("is", i)) {
                countIs++;
            } else if (str.startsWith("not", i)) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        // not done yet
        return false;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.valueOf(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        int length = 0;

        int half = string.length() / 2;

        for (int i = 0; i < half; i++) {
            if (string.substring(0, i + 1).equals(string.substring(string.length() - 1 - i))) {
                length = i + 1;
            }
        }

        return string.substring(0, length);
    }

    public String mirrorEnds(String string) {
        int length = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                length++;
            } else {
                break;
            }
        }

        return string.substring(0, length);
    }

    public int maxBlock(String str) {
        char tempChar = 0;
        int maxLength = 0;
        int tempLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                tempChar = str.charAt(i);
                tempLength++;
                continue;
            }
            if (tempChar == str.charAt(i)) {
                tempLength++;
                maxLength = Math.max(maxLength, tempLength);
            } else {
                tempChar = str.charAt(i);
                maxLength = Math.max(maxLength, tempLength);
                tempLength = 1;
            }
        }
        return maxLength;
    }

    public int sumNumbers(String str) {
        StringBuilder temp = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else if (!temp.toString().isEmpty()) {
                sum += Integer.valueOf(temp.toString());
                temp.setLength(0);
            }
        }
        if (!temp.toString().isEmpty()) {
            sum += Integer.valueOf(temp.toString());
            temp.setLength(0);
        }
        return sum;
    }
}


