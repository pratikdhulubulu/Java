public class BasicProblems25Functions {

    // 1.positive or negative
    public static boolean positiveNegative(int num){
        if(num == 0){
            System.out.println("Zero");
            return true;
        }
        else if (num > 0) {
            System.out.println("Positive");
            return true;
        }
        else {
            System.out.println("Negative");
            return false;
        }
    }

    // 2.Even or Odd number
    public static boolean evenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even");
            return true;
        }
        else {
            System.out.println("Odd");
            return false;
        }
    }

    // 3.Sum of First N Natural numbers
    public static int sumOfNumbers(int num){
        int sum = 0;
        sum = ( num * (num + 1) / 2);

        //or
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }

    // 4.Sum of numbers in a given range
    public static int sumOfNumbersInRange(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        return sum;
    }

    // 5.Greatest of two numbers
    public static int largeNum(int num1, int num2){
        if(num1 == num2){
            return 0;
        }
        else if(num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    // 6.Greatest of the Three numbers
    public static int largestNum(int num1, int num2, int num3){
        int largest = (num1>num2 && num1>num3)? num1 : (num2 > num3)? num2: num3;
        return largest;
    }

    // 7.Leap year or not
    public static boolean isLeapYear(int year){
        if( (year % 400 == 0 ) || (year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }

    // 8.Prime number
    public static boolean isPrime(int num){
        if( num == 1 || num == 2){
            return true;
        }
        else if(num == 0){
          return false;
        }
        else {
            for(int i = 2; i <=num/2; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    // 9.Sum of digits of a number
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    // 10.Reverse of a number
    public static int reverseNum(int num){
        int revNum = 0;
        while (num > 0){
            revNum = (revNum * 10) + (num % 10);
            num /= 10;
        }
        return revNum;
    }

    // 11.Palindrome number
    public static boolean isPalindromeNum(int num){
        int revNum = 0;
        int temp = num;
        while (temp > 0){
            revNum = (revNum * 10) + (temp % 10);
            temp /= 10;
        }
        return revNum == num;
    }

    // 12.Armstrong number
    public static boolean isArmstrongNum(int num){
       int temp = num, count = 0;
       while (temp > 0){
           count ++;
           temp /= 10;
       }
       temp = num;
       int armNum = 0;
       while (temp > 0){
           armNum += Math.pow((temp%10),count);
           temp /= 10;
       }
       return num == armNum;
    }

    // 13.Fibonacci Series upto nth term
    public static void fibonacciSeries(int length){
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        while (length> 0){
            System.out.println(nextTerm);
            nextTerm = secondTerm + firstTerm;
            secondTerm = firstTerm;
            firstTerm = nextTerm;

            length--;
        }
    }

    // 14.Find the Nth Term of the Fibonacci Series
    public static int findFibonacciSeries(int length){
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        while (length> 0){
            nextTerm = secondTerm + firstTerm;
            secondTerm = firstTerm;
            firstTerm = nextTerm;
            length--;
        }
        return firstTerm;
    }

    // 15.Factorial of a number
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    // 16.Power of a number
    public static int power(int num, int pow){
        if(num == 0 ){
            return 0;
        }
        if(pow == 0){
            return 1;
        }
        int power = 1;
        for (int i = 0; i < pow; i++){
             power *= num;
        }
        return power;
    }

    // 17.Factor of a number
    public static void printFactors(int num){
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }

    // 18.Finding Prime Factors of a number
    public static void printPrimeFactors(int num){
        for (int i = 1; i <= num; i++){
            if(num % i == 0 && isPrime(i)){
                System.out.println(i);
            }
        }
    }

    // 19.Strong number
    public static boolean strongNum(int num){
        int digit;
        int fact = 1;
        int temp = num;
        int sum = 0;
        while(temp > 0){
            digit = temp % 10;
            temp /= 10;

            fact = 1;
            for (int i = digit; i > 0; i--){
                fact *= i;
            }
            sum += fact;
        }
        return sum == num;
    }

    // 20.Perfect number
    public static boolean perfectNum(int num){
       int sum = 0;
       for(int i = 1; i < num; i++){
           if(num % i == 0){
               sum += i;
           }
       }
        return sum == num;
    }

    // 21.Perfect Square
    public static boolean perfectSquare(int num){
        if(num == 0 || num == 1){
            return true;
        }
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0 && num == i * i){
                return true;
            }
        }
        return false;
    }

    // 22.Auto morphic Number
    public static boolean autoMorphicNum(int num){
        int sq = num * num;
        int temp = num;

        while (num != 0){
            if(sq % 10 != num % 10){
                return false;
            }
            sq /= 10;
            num /= 10;
        }
        return true;
    }

    // 23.Harshad number
    public static boolean harshadNum(int num){
        int sum = 0;
        int temp = num;

        while ( temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    // 24.Abundant Numbers
    public static boolean abundantNum(int num){
        int sum = 0;
        for(int i = 1; i < num / 2; i++){
            if(num % 2 == 0){
                sum += i;
            }
        }
        return num < sum;
    }

    // 25.Friendly pair
    public static boolean friendlyPair(int num1, int num2){
        int sum1 = 0;

        for (int i = 1; i < num1; i++){
            if(num1 % i == 0){
                sum1 += i;
            }
        }
        int sum2 = 0;
        for (int i = 1; i < num2; i++){
            if(num2 % i == 0){
                sum2 += i;
            }
        }
        System.out.println(sum2+ " " +sum1);
        return (sum1 / num1) == (sum2 / num2);
    }
    public static void main(String[] args) {

        System.out.println(friendlyPair(6,12));
    }
}
