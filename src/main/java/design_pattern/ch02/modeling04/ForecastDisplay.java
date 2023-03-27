
package design_pattern.ch02.modeling04;

import java.beans.*;

class ForecastDisplay implements PropertyChangeListener, DisplayElement {
  private float currentPressure = 29.2f;
  private float lastPressure;

  public void propertyChange(PropertyChangeEvent evt){
    String propertyName = evt.getPropertyName();
    if(propertyName != null && !propertyName.equals("") && "weather data changed".equals(propertyName)){
      WeatherData.Values newOne = (WeatherData.Values) evt.getNewValue();
      lastPressure = currentPressure;
      currentPressure = newOne.getPressure();
      display();
    }
  }

  @Override
  public void display() {
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
