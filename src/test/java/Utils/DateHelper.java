package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    public static Date getDateUsingMMDDYYY(String dateString){
        SimpleDateFormat makeDateFormat=new SimpleDateFormat("MMM dd,yyy");
        Date date=null;
        try{
            date=makeDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static Date getDateUsingMMMDDYYY(String dateString){
        SimpleDateFormat makeDateFormat=new SimpleDateFormat("MMMM dd,yyy");
        Date date=null;
        try{
            date=makeDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static String getCurrentDateValue(){
        Date now=new Date();
        SimpleDateFormat df=new SimpleDateFormat("d");
        return df.format(now);
    }
    public static String getTomorrowDateValue(){
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat df=new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }
    public static String getYesterdayDateValue(){
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat df=new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }
    public static String getDateValueXDaysFromToday(int count){
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE, count);
        SimpleDateFormat df=new SimpleDateFormat("d");
        return df.format(cal.getTime());
    }
    public static ArrayList<String> createArrayFromNowTimeToXTime(int interval, int size){
        Date now = new Date();
        SimpleDateFormat df=new SimpleDateFormat("ha");
        Calendar cal = Calendar.getInstance();
        ArrayList<String>times=new ArrayList<>();
        for(int i=0; i<size; i++){
            cal.add(Calendar.HOUR_OF_DAY,interval);
            times.add(df.format(cal.getTime()));
        }
        return times;

}
    }
