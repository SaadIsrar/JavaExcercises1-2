public class helloworld {

    public void printSomething(String text) {
        System.out.println(text);
    }

    public void printTwoInteger(int a, int b) {
        System.out.println(a + b);
    }

    public String hello() {
        return "Hello World!";
    }

    public static int sum(int add1, int add2) {

        return add1 + add2;
    }

    public static void main(String[] args) {

        //  System.out.println("Hello World!");
        //  System.out.println("Hello World");

        helloworld hw = new helloworld();

        hw.printSomething("saad");
        hw.printTwoInteger(78, 33);

        System.out.println(hw.hello());
    }

    public static int sum(int a, int c, boolean F) {
        return a + c;
    }

}

