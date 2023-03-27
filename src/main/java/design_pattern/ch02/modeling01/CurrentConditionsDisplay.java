
package design_pattern.ch02.modeling01;

class CurrentConditionsDisplay {
  private float temperature = 0.0f;

  private float humidity = 0.0f;

  public void update(float temp, float humidity, float pressure) {
      this.temperature = temp;
      this.humidity = humidity;
      display();
  }

  public void display() {
      System.out.println("Current conditions : " + temperature + "F degress and "+ humidity + "% humidity" );
  }

}
