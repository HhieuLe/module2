package FizzBuzz;

public class FizzBuzz {
        public static String fizzBuzz(int number) {
            boolean isFiz = number % 3 == 0;
            boolean isBuz = number % 5 == 0;

            if(isFiz&&isBuz) return "FizzBuzz";
            if (isFiz) return "Fizz";
            if(isBuz) return "Buzz";
            return  number + "";

        }
}
