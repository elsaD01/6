package task1;

public class FlowsMethod {
        public void methodA(String input) {
            System.out.println("J");
            if (!input.equals("start")) {
                System.out.println("b");
                methodB("start");
            } else {
                System.out.println("A");
                System.out.println(methodC(input));

            }
            System.out.println("R");
        }

        public void methodB(String start) {
            System.out.println("S");
        }

        public int methodC(String input) {
            System.out.println("V");
            methodD(input.length());
            return input.length() * 2;
        }

        public void methodD(int number) {
            System.out.println("A");
            if (number > 5) {
                System.out.println("g");
            }
            System.out.println("E");

        }



}
