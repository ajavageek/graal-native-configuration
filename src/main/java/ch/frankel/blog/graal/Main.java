package ch.frankel.blog.graal;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Reflection reflection = new Reflection();
        Class<?> clazz = reflection.classForName();
        Object o = clazz.newInstance();
        Field field = clazz.getDeclaredField("label");
        field.get(o);
    }
}
