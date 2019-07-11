package array;

public class Array3 {

    public int maxSpan(int[] nums) {
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    span = Math.max(span, j - i + 1);
                }
            }
        }
        return span;
    }

    public int[] fix34(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (; j < nums.length; j++) {
                    if (nums[j] == 4 && i != j - 1) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        i++;

                        break;
                    }
                }
            }
        }

        return nums;
    }

    public int[] fix45(int[] nums) {
        int j = 0;
        int ignore = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (; j < nums.length; j++) {
                    if (nums[j] == 5 && i != j - 1 && ignore != j) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        i++;
                        ignore = i;
                        break;
                    }
                }
            }
        }

        return nums;
    }

    public boolean canBalance(int[] nums) {
        int half1 = 0;
        for (int i = 0; i < nums.length; i++) {
            half1 += nums[i];
            int half2 = 0;
            for (int j = i + 1; j < nums.length; j++) {
                half2 += nums[j];
            }
            if (half1 == half2) {
                return true;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        boolean contain = false;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    contain = true;
                    break;
                } else {
                    contain = false;
                }
            }
            if (contain) {
                continue;
            } else {
                return false;
            }
        }
        return contain;
    }

    public int[] squareUp(int n) {
        int[] squareArr = new int[n * n];

        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = (i * n) - 1; j >= (n * i) - i; j--) {
                squareArr[j] = count++;
            }
        }
        return squareArr;
    }

    public int[] seriesUp(int n) {
        int size = n * (n + 1) / 2;
        int[] arr = new int[size];
        for (int i = 1; i <= n; i++) {
            int digit = i;
            for (int j = (i * (i + 1) / 2) - 1; j >= ((i * (i + 1)) / 2) - i; j--) {
                arr[j] = digit--;
            }
        }
        return arr;
    }

    public int maxMirror(int[] nums) {
        // not done yet
        return 0;
    }

    public int countClumps(int[] nums) {
        int count = 0;
        int last = -1;
        ;
        for (int i = 0; i < nums.length - 1; i++) {
            int next = i + 1;
            if (nums[i] == nums[next] && last != nums[i]) {
                count++;
            }
            last = nums[i];
        }
        return count;
    }

}
