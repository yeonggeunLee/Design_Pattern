
package design_pattern.ch02.modeling04;

import java.beans.*;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
  private float temperature;
  private float humidity;

  // propertychange에 따라 실행
  // PropertyChangeListener는 자바 swing에서 자주 사용
  @Override
  public void propertyChange(PropertyChangeEvent evt){
    String propertyName = evt.getPropertyName();
    // 아래부분이 중요한 부분
    if(propertyName != null && !propertyName.equals("") && "weather data changed".equals(propertyName)){
      WeatherData.Values newOne = (WeatherData.Values) evt.getNewValue();
      this.temperature = newOne.getTemperature();
      this.humidity = newOne.getHumidity();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
  }

}
