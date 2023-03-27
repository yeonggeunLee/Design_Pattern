
package design_pattern.ch02.modeling01;

class StatisticsDisplay {
  private float maxTemp = 0.0f;

  private float minTemp = 200.f;

  private float tempSum = 0.0f;

  private int numReadings = 0;

  public void update(float temp, float humidity, float pressure) {
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

  public void display() {
      System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }

}
