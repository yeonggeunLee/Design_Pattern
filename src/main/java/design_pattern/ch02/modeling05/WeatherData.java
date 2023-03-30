package design_pattern.ch02.modeling05;

import java.util.concurrent.SubmissionPublisher;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WeatherData extends SubmissionPublisher<WeatherData.Values>{
  private WeatherData.Values values = new WeatherData.Values(0.f,0.f,0.f);

  public void setMeasurements(float temperature, float humidity, float pressure){
    this.values.setTemperature(temperature);
    this.values.setHumidity(humidity);
    this.values.setPressure(pressure);

    this.submit(values);      // values 호출
    try {
      Thread.sleep(150);    // 이전 호출이 끝나기도 전에 다시 setMeasurements가 호출되는 것을 방지
    }catch (InterruptedException ex){
      Logger.getLogger(WeatherData.class.getName()).log(Level.SEVERE,null,ex);
    }
  }
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

    public void setTemperature(float temperature) {
      this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
      this.humidity = humidity;
    }

    public void setPressure(float pressure) {
      this.pressure = pressure;
    }
  }
}
