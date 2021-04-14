import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
        System.out.println(Calendar.getInstance().getTime());
        System.out.println(Locale.getDefault().getDisplayName());

        System.out.println(getCurrentDate());
        System.out.println(getCurrentDate2());
        System.out.println(getCurrentTime());

        System.out.println(getTomorrowDate());
    }

    public static String getCurrentDate() {
//        return Calendar.getInstance().getDisplayName(Calendar.DAY_OF_YEAR, Calendar.SHORT, Locale.getDefault());
//        return Calendar.getInstance().getDisplayName(Calendar.getInstance()., Calendar.LONG_FORMAT, Locale.getDefault());
//        return new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime());
        return new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    public static String getCurrentDate2() {
        return new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());
    }

    public static String getTomorrowDate() {
        Date tomorrow = new Date();
        tomorrow.setTime(tomorrow.getTime() + 24 * 3600 * 1000);
        return new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(tomorrow);
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }
}
