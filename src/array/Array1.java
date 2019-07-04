package array;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        if (nums[0]==6 || nums[nums.length-1]==6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length>0 && nums[0]==nums[nums.length-1]) {
            return true;
        }
        return false;
    }

    public int[] makePi() {
        int[] myArray ={3, 1, 4};
        return myArray;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length-1]==b[b.length-1]) {
            return true;
        }
        return false;
    }

    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int tmp =  nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = tmp;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int tmp = 0;
        tmp = nums[2];
        nums[2] = nums[0];
        nums[0] = tmp;
        return nums;
    }


    public int[] maxEnd3(int[] nums) {
        if (nums[0]>=nums[2]) {
            nums[1]=nums[0];
            nums[2]=nums[0];
        } else {
            nums[0]=nums[2];
            nums[1]=nums[2];
        }
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length<1) return 0;
        if (nums.length>1) {
            return nums[0]+nums[1];
        } else return nums[0];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] c = new int[2];
        c[0]=a[1];
        c[1]=b[1];
        return c;
    }

    public int[] makeEnds(int[] nums) {

        int[] arr = new int[2];
        arr[1] = nums[nums.length-1];
        arr[0] = nums[0];
        return arr;
    }

    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public boolean no23(int[] nums) {
        if ((nums[0]==2 || nums[0]==3) || (nums[1]==2 || nums[1]==3)) {
            return false;
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int double_length = 2*nums.length;
        int[] arr = new int[double_length];
        arr[double_length-1]=nums[nums.length-1];
        return arr;
    }

    public boolean double23(int[] nums) {
        return nums.length > 1 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

    public int[] fix23(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==2 && nums[i+1]==3) {
                nums[i+1]=0;
            }
        }
        return nums;
    }


    public int start1(int[] a, int[] b) {
        int count=0;
        if (a.length>0 && a[0]==1) {
            count++;
        }
        if (b.length>0 && b[0]==1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0]+a[1];
        int sumB = b[0]+b[1];

        if (sumA>=sumB) {
            return a;
        } else return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] Array = new int[2];
        int middle = nums.length/2;

        if (nums.length<3) {
            return nums;
        }

        Array[0]=nums[middle-1];
        Array[1]=nums[middle];
        return Array;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] Sum = new int[4];

        Sum[0]=a[0];
        Sum[1]=a[1];
        Sum[2]=b[0];
        Sum[3]=b[1];
        return Sum;
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length>1) {
            int tmp = nums[0];
            nums[0]=nums[nums.length-1];
            nums[nums.length-1]=tmp;
            return nums;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        int middle = nums.length/2;
        if (nums.length>3) {
            int[] arr = new int[3];
            arr[0]=nums[middle-1];
            arr[1]=nums[middle];
            arr[2]=nums[middle+1];
            return arr;
        }
        return nums;
    }

    public int maxTriple(int[] nums) {
        int max=0;
        if (nums.length>1) {
            int mid = nums.length/2;
            int first = nums[0];
            int second = nums[mid];
            int third = nums[nums.length-1];
            if (first > second && first > third) {
                max = first;
            } else if (second>third) {
                max = second;
            } else max = third;
        }
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length>1) {
            int[] arr = new int[2];
            arr[0]=nums[0];
            arr[1]=nums[1];
            return arr;
        }
        return nums;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length>1 && ((nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3)
                || (nums[nums.length-2]==1 && nums[nums.length-1]==3))) {
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if (a.length>=2) {
            arr[0]=a[0];
            arr[1]=a[1];
        }
        if (a.length==1) {
            arr[0]=a[0];
            arr[1]=b[0];
        } else if (a.length==0) {
            arr[0]=b[0];
            arr[1]=b[1];
        }
        return arr;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length>0 && b.length>0) {
            int[] arr = new int[2];
            arr [0]=a[0];
            arr[1]=b[0];
            return arr;
        }
        if (a.length==0 && b.length==0) {
            return new int[0];
        } else  if (b.length==0) {
            int[] arr = new int[1];
            arr[0]=a[0];
            return arr;
        } else {
            int[] arr = new int[1];
            arr[0]=b[0];
            return arr;
        }
    }


}
