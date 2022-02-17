package demo;

public class HelloWorld {
    public String hi(String name) {
        return String.format("Hello %s", name);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld =  new HelloWorld();
        String result = helloWorld.hi("JJ");
        System.out.println(result);

    }
}
