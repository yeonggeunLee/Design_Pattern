package design_pattern.ch02.modeling02;

import java.util.LinkedList;

public class WeatherData extends Subject {
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new LinkedList<>();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);           // 해당되는 옵저가 있으면 거기에 해당되는 인덱스가 리턴된다. 0이상의. 없으면 음수 리턴
    if(i>=0){
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    // 셋 다 같은 결과값 나오는 반복문
    /* 기본적인 for 문
    for(int i = 0; i < observers.size();i++{
      Observer o = (Observer) observers.get(i);
      o.update(temperature, humidity, pressure);
    }
     */
    /* enhanced for 문
    for(Observer o : observers){
      o.update(temperature, humidity, pressure);
    }
     */
    // 람다 표현식. list 클래스안에 forEach 메소드를 사용. 람다 = 익명의 함수식을 만드는 방법.
    observers.forEach((observer) -> {
      observer.update(temperature,humidity,pressure);
    });
  }

  public void measurementChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
   this.temperature = temperature;
   this.humidity = humidity;
   this.pressure = pressure;

   measurementChanged();
  }

}
