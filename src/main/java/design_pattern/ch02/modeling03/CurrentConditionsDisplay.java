
package design_pattern.ch02.modeling03;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    observable.addObserver(this);
  }

  // update가 중요함  if(obs instanceof WeatherData) 중요
  public void update(Observable obs, Object arg) {
    if(obs instanceof WeatherData){   // 중요! WeatherData인 경우에만 실행. 넘겨준 데이터가 WeatherData인지 확인하는 코드가 필요. 바람직하지는 않다.
      WeatherData weatherData = (WeatherData) obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  public void display() {
    System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
  }

}
