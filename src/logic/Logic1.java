package logic;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && isWeekend) {
            return true;
        }
        return cigars >= 40 && cigars <= 60;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else return temp >= 60 && temp <= 90;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int nO = 0;
        if (isBirthday) {
            if ((speed - 5) >= 81) {
                nO = 2;
            }
            if ((speed - 5) >= 61 && (speed - 5) <= 80) {
                nO = 1;
            }
            if ((speed - 5) <= 60) {
                nO = 0;
            }
        }
        if (!isBirthday) {
            if (speed >= 81) {
                nO = 2;
            }
            if (speed >= 61 && speed <= 80) {
                nO = 1;
            }
            if (speed <= 60) {
                nO = 0;
            }
        }
        return nO;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        String time;
        if (vacation) {
            if (day <= 5 && day >= 1) {
                time = "10:00";
            } else time = "off";
        } else if (day <= 5 && day >= 1) {
            time = "7:00";
        } else time = "10:00";
        return time;
    }

    public boolean love6(int a, int b) {
        int sum = a + b;
        int dif = Math.abs(a - b);
        return a == 6 || b == 6 || sum == 6 || dif == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return n >= 1 && n <= 10;
        } else {
            return n <= 1 || n >= 10;
        }
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        return n % 3 == 0 || n % 5 == 0;
    }

    public boolean less20(int n) {
        int mod = n % 20;
        return mod == 18 || mod == 19;
    }

    public boolean nearTen(int num) {
        int A = num % 10;
        return (A >= 0 && A <= 2) || A == 8 || A == 9;
    }

    public int teenSum(int a, int b) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return (a + b);
        }
    }


    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (isMom) {
            return true;
        } else return !isMorning;

    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= (2 * candy) || candy >= (2 * tea)) {
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f') {
            if (str.charAt(str.length() - 1) == 'b') {
                return "FizzBuzz";
            } else return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else return b > a && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return a - 10 >= b || a - 10 >= c || b - 10 >= a || c - 10 >= a || b - 10 >= c || c - 10 >= b;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == 6 && die2 == 6) {
                return die1 + 1;
            }
            if (die1 == die2) {
                return die1 + die2 + 1;
            }
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        int min;
        int max;
        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return min;
        }
        return max;
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && a == c) {
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c) return 20;
        if (a == b || b == c || a == c) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab - ac == 10 || ab - bc == 10) return 5;

        return 0;
    }

    public boolean shareDigit(int a, int b) {
        int rightA = a % 10;
        int rightB = b % 10;

        int leftA = a / 10;
        int leftB = b / 10;

        return rightA == rightB || leftA == leftB || rightA == leftB || rightB == leftA;
    }

    public int sumLimit(int a, int b) {
        int tmp = 0;
        int w = a + b;

        String abab;
        abab = String.valueOf(w);
        String aaa;
        aaa = String.valueOf(a);

        if (abab.length() == aaa.length()) {
            tmp = w;
        }
        if (abab.length() > aaa.length()) {
            tmp = a;
        }
        return tmp;
    }

}
