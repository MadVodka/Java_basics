package logic;

public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        int sum = 0;
        for (int i = 0; i < big; i++) {
            if ((sum + 5) == goal) {
                return true;
            }
            if ((sum + 5) < goal) {
                sum += 5;
            }
        }
        for (int j = 0; j < small; j++) {
            if (sum < goal) {
                sum++;
            }
            if (sum == goal) {
                return true;
            }
        }
        return false;
    }

    public int loneSum(int a, int b, int c) {
        int count = 0;
        if (a != b && a != c && b != c) count = a + b + c;
        if (a == b) {
            if (b != c) {
                count = count + c;
            }
        }
        if (a != b) {
            if (a != c) {
                count = count + a;
            } else count = count + b;
        }
        if (a != b && a != c && b != c) count = a + b + c;
        return count;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
            if (b != 13) {
                sum += b;
                if (c != 13) {
                    sum += c;
                }
            }
        }
        return sum;
    }


    public int noTeenSum(int a, int b, int c) {
        int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
        return sum;
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        } else return n;
    }


    public int roundSum(int a, int b, int c) {
        int sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    public int round10(int num) {
        int remain = num % 10;
        int newNum = 0;
        if (remain < 5) {
            newNum = num - remain;
        }
        if ((num % 10) >= 5) {
            newNum = (num - remain) + 10;
        }
        return newNum;
    }


    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
            return true;
        }
        return Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
    }

    public int blackjack(int a, int b) {

        int near;
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21 && b <= 21) near = b;
        else near = a;

        int difA = 21 - a;
        int difB = 21 - b;
        if (difA < difB && difA >= 0) {
            near = a;
        }
        if (difB < difA && difB >= 0) {
            near = b;
        }
        return near;
    }


    public boolean evenlySpaced(int a, int b, int c) {
        int max = 0;
        int min = 0;
        int middle = 0;
        if (a == b && a != c || a == c && a != b || b == c && b != a) return false;
        if (a > b && a > c) {
            max = a;
            if (b > c) {
                middle = b;
                min = c;
            } else {
                middle = c;
                min = b;
            }
        }
        if (b > a && b > c) {
            max = b;
            if (a > c) {
                middle = a;
                min = c;
            } else {
                middle = c;
                min = a;
            }
        }
        if (c > a && c > b) {
            max = c;
            if (a > b) {
                middle = a;
                min = b;
            } else {
                middle = b;
                min = a;
            }
        }
        return (max - middle) == (middle - min);
    }


    public int makeChocolate(int small, int big, int goal) {
        int sum = 0;
        int count = 0;

        for (int j = 1; j <= big; j++) {
            if ((sum + 5) <= goal) {
                sum += 5;
            }
        }
        for (int i = 1; i <= small; i++) {
            if (sum < goal) {
                sum++;
                count++;
            }
            if (sum == goal) {
                return count;
            }
        }

        return -1;
    }

}
