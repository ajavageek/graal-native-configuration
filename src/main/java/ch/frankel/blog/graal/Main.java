package ch.frankel.blog.graal;

public class Main {

    public static void main(String[] args) throws Exception {
        Reflection reflection = new Reflection();
        Class<?> clazz = reflection.classForName();
        clazz.newInstance();
    }
}
