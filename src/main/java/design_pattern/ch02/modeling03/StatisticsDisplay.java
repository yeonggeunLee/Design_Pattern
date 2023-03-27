
package design_pattern.ch02.modeling03;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200.f;
  private float tempSum = 0.0f;
  private int numReadings = 0;

  public StatisticsDisplay(Observable observable) {
    observable.addObserver(this);
  }
  public void update(Observable observable, Object arg) {
    if(observable instanceof WeatherData){
      WeatherData weatherData = (WeatherData) observable;
      float temp = weatherData.getTemperature();
      tempSum += temp;
      numReadings++;

      if(temp > maxTemp){
        maxTemp = temp;
      }
      if (temp < minTemp){
        minTemp = temp;
      }
      display();
    }
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }
}
