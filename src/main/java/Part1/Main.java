package Part1;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<DayOfWeek> days = new ArrayList<>();
    days.add(DayOfWeek.MONDAY);
    days.add(DayOfWeek.WEDNESDAY);
    days.add(DayOfWeek.FRIDAY);
    int[] timeRange = new int[]{9, 17};

    Proxy proxy = new Proxy(days, timeRange);

    try{
      proxy.add(2, 3);
      proxy.sub(2,3);
      proxy.multiply(2,3);
    } catch (Exception ex){
      ex.printStackTrace();
    }

    days.clear();

    days.add(DayOfWeek.TUESDAY);
    days.add(DayOfWeek.FRIDAY);

    try{
      proxy.add(2,3);
      proxy.sub(2,3);
      proxy.multiply(2,3);
    } catch (Exception ex){
      ex.printStackTrace();
    }

  }

}
