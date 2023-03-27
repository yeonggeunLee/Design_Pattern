package design_pattern.ch02.modeling04;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // add 순서대로 나온다. PropertyChangeSupport 안에서 리스트로 들어오는 순서대로 관리한다.
        weatherData.addPropertyChangeListener(currentDisplay);
        weatherData.addPropertyChangeListener(statisticsDisplay);
        weatherData.addPropertyChangeListener(forecastDisplay);

//        weatherData.addPropertyChangeListener(forecastDisplay);
//        weatherData.addPropertyChangeListener(statisticsDisplay);
//        weatherData.addPropertyChangeListener(currentDisplay);

        weatherData.setMeasurements(80,65,30.4f);
        System.out.println("------------------------------------------");
        weatherData.setMeasurements(82,70,29.2f);
        System.out.println("------------------------------------------");
        //weatherData.removePropertyChangeListener(forecastDisplay);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
