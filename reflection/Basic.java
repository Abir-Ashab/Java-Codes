package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Basic {
    public static void main(String[] args) throws Exception {
        // Load the class at runtime
        Class<?> cls = Class.forName("thread.DeadLock_Basics");

        // Get the list of fields and methods
        Field[] fields = cls.getDeclaredFields();
        Method[] methods = cls.getDeclaredMethods();

        // Print the list of fields and methods
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
