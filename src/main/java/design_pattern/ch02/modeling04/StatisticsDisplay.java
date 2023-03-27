
package design_pattern.ch02.modeling04;

import java.beans.*;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200.f;
  private float tempSum = 0.0f;
  private int numReadings = 0;

  @Override
  public void propertyChange(PropertyChangeEvent evt){
    String propertyName = evt.getPropertyName();
    if(propertyName != null && !propertyName.equals("") && "weather data changed".equals(propertyName)){
      WeatherData.Values newOne = (WeatherData.Values) evt.getNewValue();
      float temp = newOne.getTemperature();
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

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }
}
