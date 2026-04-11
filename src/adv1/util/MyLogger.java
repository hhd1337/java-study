package adv1.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS"); //시:분:초:밀리초

    public static void log(Object object) {
        String time = LocalTime.now().format(formatter);
        //08:29:02.474 [     main] hello thread
        //08:29:02.477 [     main] 123
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), object);
    }
}
