package design_pattern.ch02.modeling01;

public class WeatherStation {
    public static void main(String[] args){
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        WeatherData weatherData = new WeatherData(currentDisplay, statisticsDisplay, forecastDisplay);

        // 코드의 경우의 수를 테스트하기 위해 3번 돌린다.
        // if문 또는 for문 또는 while문 테스트가 제대로 되었는지 보는 것을 '디시전 커버리지 (=결정 검정기준)' 라고한다.초
        weatherData.setMeasurements(80,65,30.4f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(82,70,29.2f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(78,90,29.2f);
    }
}
