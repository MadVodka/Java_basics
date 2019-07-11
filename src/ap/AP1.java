package ap;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        int scoreBefore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                scoreBefore = scores[i];
                continue;
            }

            if (scores[i] >= scoreBefore) {
                scoreBefore = scores[i];
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean scores100(int[] scores) {
        int beforeScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                beforeScore = scores[i];
                continue;
            }

            if (beforeScore == scores[i] && scores[i] == 100) {
                return true;
            } else {
                beforeScore = scores[i];
            }
        }

        return false;
    }

    public boolean scoresClump(int[] scores) {
        int initScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                initScore = scores[i];
                continue;
            }

            int next = i + 1;
            if (next < scores.length) {
                boolean dif1 = scores[i] - initScore <= 2;
                boolean dif2 = scores[next] - initScore <= 2;
                boolean dif3 = scores[next] - scores[i] <= 2;

                if (dif1 && dif2 && dif3) {
                    return true;
                }
            }

            initScore = scores[i];

        }

        return false;

    }

    public int scoresAverage(int[] scores) {
        int middle = scores.length / 2;
        int firstHalfAvg = average(scores, 0, middle);
        int secondHalfAvg = average(scores, middle, scores.length);
        return Math.max(firstHalfAvg, secondHalfAvg);
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }


    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }

        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = words[i];
        }

        return arr;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                list.add(word);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int startValue = n;
        while (n > 0) {
            if (n % 10 == 0 || startValue % (n % 10) != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int arrCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[arrCount] = num;
                arrCount++;
                if (arrCount == arr.length) {
                    break;
                }
            }
        }

        return arr;
    }


    public int[] copyEndy(int[] nums, int count) {
        int[] copyEndy = new int[count];
        int countEndy = 0;
        for (int num : nums) {
            if (isEndy(num)) {
                copyEndy[countEndy] = num;
                countEndy++;
                if (countEndy == copyEndy.length) {
                    break;
                }
            }
        }
        return copyEndy;
    }

    boolean isEndy(int n) {
        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
            return true;
        }
        return false;
    }


    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((!a[i].equals("") && !b[i].equals("")) && (a[i].startsWith(b[i]) || b[i].startsWith(a[i]))) {
                count++;
            }
        }

        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (!answers[i].equals("?")) {
                if (answers[i].equals(key[i])) {
                    score += 4;
                } else {
                    score -= 1;
                }
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int len = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                len++;
            }
        }
        String[] without = new String[len];
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                without[count] = word;
                count++;
            }
        }
        return without;
    }


    public int scoresSpecial(int[] a, int[] b) {
        return maxValue(a) + maxValue(b);
    }

    int maxValue(int[] arr) {
        int max = 0;
        for (int val : arr) {
            if (val % 10 == 0) {
                max = Math.max(max, val);
            }
        }
        return max;
    }


    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int multiplier = 1;
            if (heights[i] < heights[i + 1]) {
                multiplier = 2;
            }
            sum += multiplier * Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int result = aName.compareTo(bName);
        if (result == 0) {
            if (aId > bId) {
                return 1;
            } else if (aId < bId) {
                return -1;
            } else {
                return 0;
            }
        } else if (result > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        // not done yet
        return null;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        for (String strA : a) {
            boolean hasAlready = false;
            for (int i = 0; i < b.length; i++) {
                if (strA.equals(b[i])) {
                    if (!hasAlready) {
                        count++;
                        hasAlready = true;
                    }

                    b[i] = "";
                }

            }
        }
        return count;
    }


}
