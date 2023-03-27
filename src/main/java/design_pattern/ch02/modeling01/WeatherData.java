
package design_pattern.ch02.modeling01;

class WeatherData {
  // 구현에 대해 프로그래밍 -> 수정하기 어려움.
  private CurrentConditionsDisplay currentConditions;
  private StatisticsDisplay statisticsDisplay;
  private ForecastDisplay forecastDisplay;

  private float temperature = 0.0f;
  private float humidity = 0.0f;
  private float pressure = 0.0f;

  // WeatherData 객체가 생성될 때 위의 값으로 초기화
  public WeatherData(CurrentConditionsDisplay currentConditions, StatisticsDisplay statisticsDisplay,
                     ForecastDisplay forecastDisplay) {
    this.currentConditions = currentConditions;
    this.statisticsDisplay = statisticsDisplay;
    this.forecastDisplay = forecastDisplay;
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    setTemperature(temp);
    setHumidity(humidity);
    setPressure(pressure);

    measurementsChanged();
  }

  private void measurementsChanged() {
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    // 확장성이 떯어짐
    currentConditions.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure);
    forecastDisplay.update(temp, humidity, pressure);
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }
}
