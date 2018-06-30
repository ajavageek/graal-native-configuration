package ch.frankel.blog.graal;

public class Reflection {

    public Class<?> classForName() throws ClassNotFoundException {
        return Class.forName("java.awt.Button");
    }
}
