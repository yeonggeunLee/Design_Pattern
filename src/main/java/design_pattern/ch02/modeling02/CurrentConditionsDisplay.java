
package design_pattern.ch02.modeling02;

class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
  }
}
