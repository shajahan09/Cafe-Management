package cafeproject;




import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Another {
    public void showDate(){
         Calendar cal = new GregorianCalendar();
         int day = cal.get(Calendar.DAY_OF_MONTH);
         int month = cal.get(Calendar.MONTH);
         int year = cal.get(Calendar.YEAR);
         CafeManagement.dt.setText("Date : "+day +" / "+ month +" / "+ year );
       
       
     }
     public void showTime(){
         Thread clock = new Thread(){
         public void run(){
             try {
              for(;;){   
         Calendar cal = new GregorianCalendar();
         int sec = cal.get(Calendar.SECOND);
         int min = cal.get(Calendar.MINUTE);
         int hour = cal.get(Calendar.HOUR);
         CafeManagement.tm.setText("Time : "+hour +" : "+ min +" : "+ sec);
                 sleep(1000);
              }
             } catch (InterruptedException ex) {
                // Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
             ex.printStackTrace();
             }
         }
         };
        clock.start();
         
         
         
     
                 }
    
}
