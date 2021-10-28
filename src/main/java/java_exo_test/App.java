package java_exo_test;

public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 3 && args.length != 1) {
            System.out.println("\033[31;01mUsage prog <number1> <op> <number2>");
            return;
        }

        try {
            if(args.length == 1) {
                System.out.println(Calculator.sqrt(Double.parseDouble(args[0])));
                return;
            }

            double a = Double.parseDouble(args[0]);
            char op = (args[1]).charAt(0);
            double b = Double.parseDouble(args[2]);

            System.out.println(Calculator.dispatch(a, op, b));
        } catch(NumberFormatException e) {
            System.out.println("[Error] " + e.getMessage());
        }
    }
}
