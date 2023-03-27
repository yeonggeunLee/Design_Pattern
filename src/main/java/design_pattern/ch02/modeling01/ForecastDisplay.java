
package design_pattern.ch02.modeling01;

class ForecastDisplay {
  private float currentPressure = 29.2f;

  private float lastPressure;

  public void update(float temp, float humidity, float pressure) {
      lastPressure = currentPressure;
      currentPressure = pressure;
      display();
  }

  public void display(){
      System.out.print("Forecast : ");
      if(currentPressure > lastPressure){
          System.out.println("Improving weather on the way!");
      }
      else if(currentPressure == lastPressure){
          System.out.println("More of the same");
      }
      else if(currentPressure < lastPressure){
          System.out.println("Watch out for cooler, rainy weather");
      }
  }
}
