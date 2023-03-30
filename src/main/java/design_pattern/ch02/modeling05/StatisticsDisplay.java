
package design_pattern.ch02.modeling05;

import java.util.concurrent.Flow;

public class StatisticsDisplay implements Flow.Subscriber<WeatherData.Values>, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200.f;
  private float tempSum = 0.0f;
  private int numReadings;
  private Flow.Subscription subscription = null;

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
  }

  @Override
  public void onSubscribe(Flow.Subscription subscription) {
    this.subscription = subscription;
    this.subscription.request(1);
  }

  @Override
  public void onNext(WeatherData.Values item){
    float temp = item.getTemperature();
    tempSum += temp;
    numReadings++;

    if(temp > maxTemp){
      maxTemp = temp;
    }
    if (temp < minTemp){
      minTemp = temp;
    }
    display();
    this.subscription.request(1);
  }

  @Override
  public void onError(Throwable throwable){
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void onComplete(){
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
