public class FizzBuzz {

    /**
     * @param  n Es el numero que se validara si es o no FizzBuzz
     * @return void
     * @see     Main
     * @author  Roly Anibal Quellca Hancco
     */

    //Constructor
    public FizzBuzz(int n) {

        //change for() -> while()
        int i = 1 ;

        while (i <= n) {
            String output = "";

            output += (i % 3 == 0) ? "Fizz" : "";
            output += (i % 5 == 0) ? "Buzz" : "";
            output = (output.isEmpty()) ? Integer.toString(i) : output;

            System.out.println(output);
            i++;
        }
    }

}
