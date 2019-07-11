package array;

import java.util.Arrays;

public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int bigDiff(int[] nums) {
        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
                min = nums[i];
                continue;
            }

            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (i == 0) {
                max = nums[i];
                min = nums[i];
                continue;
            }

            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return (sum - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (ignore) {
                ignore = false;
                continue;
            }

            if (num == 13) {
                ignore = true;
                continue;
            }

            sum = sum + num;
        }

        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (ignore) {
                if (num == 7) {
                    ignore = false;
                }
                continue;
            }

            if (num == 6) {
                ignore = true;
                continue;
            }

            sum = sum + num;
        }

        return sum;
    }

    public boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == 2) {
                return true;
            }
        }

        return false;
    }

    public boolean lucky13(int[] nums) {
        boolean one = false;
        boolean three = false;

        for (int num : nums) {
            if (num == 1) {
                one = true;
            } else if (num == 3) {
                three = true;
            }

            if (one || three) {
                return false;
            }
        }

        return true;
    }

    public boolean sum28(int[] nums) {
        int sumEight = 0;

        for (int num : nums) {
            if (num == 2) {
                sumEight = sumEight + num;
            }
        }

        return sumEight == 8;
    }

    public boolean more14(int[] nums) {
        int countOne = 0;
        int countFourth = 0;

        for (int num : nums) {
            if (num == 1) {
                countOne++;
            } else if (num == 4) {
                countFourth++;
            }
        }

        return countOne > countFourth;
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }

        return arr;
    }

    public boolean no14(int[] nums) {
        boolean ones = false;
        boolean forth = false;

        for (int num : nums) {
            if (num == 1) {
                ones = true;
            } else if (num == 4) {
                forth = true;
            }

            if (ones && forth) {
                return false;
            }
        }

        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }

        return true;
    }

    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums[i] == 2) {
                    two = true;
                } else if (nums[i] == 4) {
                    four = true;
                }
            }

            if (two && four) {
                return false;
            }
        }

        return two || four;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums2[i] - nums1[i]) < 3 && Math.abs(nums2[i] - nums1[i]) > 0) {
                count++;
            }
        }

        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7) {
                int next = i + 1;
                int afterNext = i + 2;

                if (next < nums.length && nums[next] == 7) {
                    return true;
                } else if (afterNext < nums.length && nums[afterNext] == 7) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean has12(int[] nums) {
        boolean one = false;
        for (int num : nums) {
            if (num == 1) {
                one = true;
            } else if (num == 2 && one) {
                return true;
            }
        }

        return false;
    }

    public boolean modThree(int[] nums) {
        int count = 0;
        boolean even = false;
        boolean odd = false;
        for (int num : nums) {
            if (num % 2 == 0) {
                if (!even) {
                    count = 0;
                    even = true;
                    odd = false;
                }
            } else {
                if (!odd) {
                    count = 0;
                    even = false;
                    odd = true;
                }
            }

            count++;

            if (count == 3) {
                return true;
            }
        }

        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean prevThree = false;

        for (int num : nums) {
            if (num == 3) {
                if (prevThree) {
                    return false;
                }
                prevThree = true;
                count++;
            } else {
                prevThree = false;
            }
        }

        return count == 3;
    }

    public boolean twoTwo(int[] nums) {
        // not done yet
        return false;
    }

    public boolean sameEnds(int[] nums, int len) {
        int[] startArr = new int[len];

        for (int i = 0; i < len; i++) {
            startArr[i] = nums[i];
        }

        int indexStartArr = len - 1;
        for (int i = nums.length - 1; i >= nums.length - len; i--) {
            if (nums[i] == startArr[indexStartArr]) {
                indexStartArr--;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean tripleUp(int[] nums) {
        boolean hasAdjacent = false;
        int previous = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                previous = nums[i];
                continue;
            }

            if (nums[i] - previous == 1) {
                if (hasAdjacent) {
                    return true;
                }

                hasAdjacent = true;
            } else {
                hasAdjacent = false;
            }
            previous = nums[i];
        }

        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] fillArr = new int[end - start];
        int startValue = start;
        for (int i = 0; i < end - start; i++) {
            fillArr[i] = startValue++;
        }

        return fillArr;
    }

    public int[] shiftLeft(int[] nums) {
        int next = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                next = nums[i];
                continue;
            }

            int temp = nums[i];
            nums[i] = next;
            next = temp;

            if (i == 0) {
                nums[nums.length - 1] = next;
            }
        }

        return nums;
    }

    public int[] tenRun(int[] nums) {
        boolean change = false;
        int valueToSet = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                change = true;
                valueToSet = nums[i];
                continue;
            }

            if (change) {
                nums[i] = valueToSet;
            }
        }

        return nums;
    }

    public int[] pre4(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 4) {
                break;
            } else {
                count++;
            }
        }

        int[] pre4 = new int[count];
        for (int i = 0; i < count; i++) {
            pre4[i] = nums[i];
        }

        return pre4;
    }

    public int[] post4(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                break;
            } else {
                count++;
            }
        }

        int[] post4 = new int[count];
        int index = 0;
        for (int i = nums.length - count; i < nums.length; i++) {
            post4[index] = nums[i];
            index++;
        }

        return post4;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            int prev = i - 1;
            int next = i + 1;

            if (prev > -1 && next < nums.length && nums[i] == val) {
                int prevValue = nums[prev];
                int nextValue = nums[next];

                if (val != prevValue && val != nextValue) {
                    nums[i] = Math.max(prevValue, nextValue);
                }
            }
        }

        return nums;
    }

    public int[] zeroFront(int[] nums) {
        // not done yet
        return null;
    }

    public int[] withoutTen(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                count++;
                nums[i] = 0;
                continue;
            } else if (count > 0) {
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }

        return nums;

    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    int val = nums[j];
                    if (val % 2 != 0) {
                        maxOdd = Math.max(maxOdd, val);
                    }
                }
                nums[i] = maxOdd;
            }
        }

        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
                continue;
            } else {
                int temp = nums[i - count];
                nums[i - count] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] fizzBuzz = new String[end - start];
        int count = start;
        for (int i = 0; i < end - start; i++) {
            if (count % 3 == 0 && count % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";
            } else if (count % 3 == 0) {
                fizzBuzz[i] = "Fizz";
            } else if (count % 5 == 0) {
                fizzBuzz[i] = "Buzz";
            } else {
                fizzBuzz[i] = String.valueOf(count);
            }

            count++;
        }

        return fizzBuzz;
    }

}
