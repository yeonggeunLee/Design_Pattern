package design_pattern.ch02.modeling05;

import java.util.concurrent.Flow;

// Flow.Subscriber <WeatherData.Values> 제네릭 사용법 기억하기
public class CurrentConditionsDisplay implements Flow.Subscriber <WeatherData.Values>, DisplayElement {
    private float temperature;
    private float humidity;
    private Flow.Subscription subscription = null;

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degress and " + humidity + "% humidity");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);          // 데이터 요청 1개 요청
    }

    @Override
    public void onNext(WeatherData.Values item){
        this.temperature = item.getTemperature();
        this.humidity = item.getHumidity();
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
