package java_30;

public class ControlFlowStatements {

    public static void main(String[] args) {

        int iNum = 10;
        if (iNum > 0) {
            System.out.println("The iNum is positive.");
        } else if (iNum < 0) {
            System.out.println("The iNum is negative.");
        } else {
            System.out.println("The iNum is zero.");
        }

        switch (iNum) {
            case 1:
                System.out.println("iNum is One");
                break;
            case 10:
                System.out.println("iNum is Ten");
                break;
            default:
                System.out.println("iNum is neither 1 nor 10");
        }
    }
}
