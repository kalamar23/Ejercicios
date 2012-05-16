import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DateFormat;
public class Test {
    DateFormat df;
    public Test() {
        df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        Timer timer = new Timer();
        timer.schedule(new DoTick(), 0, 1000);    // do it every second
    }
    
    class DoTick extends TimerTask {
        public void run() {
            Calendar c = df.getCalendar();
            System.out.println(df.format(c.getTime()));
            
            c.add(Calendar.SECOND, 1);
            df.setCalendar(c);
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
    
}