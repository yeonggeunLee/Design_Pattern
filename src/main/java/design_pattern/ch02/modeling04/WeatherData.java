package design_pattern.ch02.modeling04;

import java.beans.*;

public class WeatherData {
  private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
  // WeatherData는 PropertyChangeSupport에 대해서 정보를 갖고 있어야한다. (연관관계)

  private float temperature;
  private float humidity;
  private float pressure;


  // PropertyChangeSupport에 있는 addPropertyChangeListener(listener)를 호출하는 메소드
  public void addPropertyChangeListener(PropertyChangeListener listener){
    this.pcs.addPropertyChangeListener(listener);
  }

  // PropertyChangeSupport에 있는 removePropertyChangeListener(listener)를 호출하는 메소드
  public void removePropertyChangeListener(PropertyChangeListener listener){
    this.pcs.removePropertyChangeListener(listener);
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setMeasurements(float temperature, float humidity, float pressure){
    Values oldOne = new Values(this.temperature, this.humidity, this.pressure); // 기존값
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    Values newOne = new Values(this.temperature, this.humidity, this.pressure); // 변경값

    // PropertyChangeSupport 객체에게 firePropertyChange 메소드 호출. notifyObservers 메소드와 동일한 부분
    // fire => 값을 내보낸다.
    // "weather data changed" 이 property 이름이 있으면  display 객체들에서 반응
    this.pcs.firePropertyChange("weather data changed", oldOne, newOne);
  }

  // public으로 해놔야 다른곳에서도 사용
  public class Values{
    private float temperature;
    private float humidity;
    private float pressure;

    public Values(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
    }

    public float getTemperature() {
      return temperature;
    }

    public float getHumidity() {
      return humidity;
    }

    public float getPressure() {
      return pressure;
    }
  }

}
