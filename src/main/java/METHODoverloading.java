public class METHODoverloading {
    public static void main(String[] args) {

        hello();
        hello1(3, 2);
        hello3("laxmi");
        hello4("laxmi", 23);
        hello8(2, 3, 8, 9);


    }

    public static void hello() {
        System.out.println("laxmi");
    }

    public static void hello1(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    //public static void hello8(int a, int b, int c, int d) {
    //int sum1 = a + b + c + d;
    //System.out.println(sum1);
    //}

    public static void hello3(String name) {
        System.out.println("hello " + name);

    }

    public static void hello4(String name, int age) {
        System.out.println("my age is" + name + age + "laxmi");
    }

    public static void hello8(int a, int b, int c, int d) {
        int sum1 = a + b + c + d;
        System.out.println(sum1);
    }
}
