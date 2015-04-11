package demo;

public class Test1 {

    private static void printSyntax() {
        System.out.println("Usage: demo.Test1 <integer>");
        System.exit(-1);
    }

    public static void checkInt(int v) {
        switch (v) {
        case 0:
            {
                System.out.println("That's nothing :-)\n");
                break;
            }
        case 1:
            {
                System.out.println("One is the loneliest number :-(\n");
                break;
            }
        case 2:
            {
                System.out.println("Two is company.\n");
                break;
            }
        default:
            {
                System.out.println("This is a crowd!\n");
            }
        }
    }

    public static void main(String[] args) {
        int val = 0;
        if (args.length == 0) {
            printSyntax();
        } else {
            try {
                val = Integer.parseInt(args[0]);
                if (val < 0) {
                    System.out.println("Sorry we don't accept anyone who is being negative here.\n");
                } else {
                    checkInt(val);
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("That was not an integer!\n");
                System.exit(1);
            }
        }
    }
}
