package Part1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;

public class Proxy implements Subject{

  private RealSubject realSubject;
  private LocalDateTime dateTime;
  private List<DayOfWeek> allowedDays;
  private int[] timeRange;

  public Proxy(List<DayOfWeek> allowedDays, int[] timeRange) {
    this.realSubject = new RealSubject();
    this.dateTime = LocalDateTime.now();
    this.allowedDays = allowedDays;
    this.timeRange = timeRange;
  }

  private boolean rightDayAndTime(){
    DayOfWeek currentDay = dateTime.getDayOfWeek();
    int hour = dateTime.getHour();
    return allowedDays.contains(currentDay) && hour >= timeRange[0] && hour <= timeRange[1];
  }

  @Override
  public int add(int num1, int num2) throws Exception {
    if (rightDayAndTime()){
      return realSubject.add(num1, num2);
    } else {
      throw new Exception("Not the right day and time for add.");
    }
  }

  @Override
  public int sub(int num1, int num2) throws Exception {
    if (rightDayAndTime()){
      return realSubject.sub(num1, num2);
    } else {
      throw new Exception("Not the right day and time for sub.");
    }
  }

  @Override
  public int multiply(int num1, int num2) throws Exception {
    if (rightDayAndTime()){
      return realSubject.multiply(num1, num2);
    } else {
      throw new Exception("Not the right day and time for multiply.");
    }
  }



}
