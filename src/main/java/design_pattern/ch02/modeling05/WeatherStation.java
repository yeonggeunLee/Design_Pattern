package design_pattern.ch02.modeling05;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.subscribe(currentConditions);
        weatherData.subscribe(statisticsDisplay);
        weatherData.subscribe(forecastDisplay);

        // 결과가 위에서 subscribe 시킨 순서와 다르게 순서가 바뀌어서 동작한다
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
