package LoggerExercise;

import javax.sound.sampled.FloatControl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    /**
     * @TODO Add any necessary fields and variables.
     */
    private static String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    private Logger(){}


    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {

        FileWriter logFile = null;
        try {
            logFile = new FileWriter("log" + today + ".log", true);
            logFile.write(log.toString() + "\n");
            logFile.close();
        } catch (IOException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }

    }
}