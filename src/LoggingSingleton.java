import java.util.ArrayList;
/*
 * Singleton
 * Singleton is used to limit object creation to more than 1. For example, logging, connect to database, and others.
 * Example :
 *  a. Logging -> like in class LoggingSingleton.java
 *  b. Connect to database
 */

public class LoggingSingleton {
    private static LoggingSingleton logger = null;
    private ArrayList<String>whatUserDo;

    private LoggingSingleton() {
        whatUserDo = new ArrayList<String>();
    }

    public static synchronized LoggingSingleton getInstance(){
		if(logger == null)
			logger = new LoggingSingleton();
		return logger;
	}

    public void viewLog(){
        System.out.println("Logging Singleton");
        System.out.println("=================");
        for(String s: whatUserDo){
            System.out.println(s);
        }
        System.out.println("=================");
    }

    public void addLog(String task){
        whatUserDo.add(task);
    }

}
