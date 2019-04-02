package pl.zzpj2019.solid.dip.weathertracker.solution;

public class PhoneAlert implements WeatherAlertGenerator {
    @Override
    public void generateWeatherAlert(String weatherConditions) {
        String notification = "It is " + weatherConditions;
        System.out.println("New notification:\n" + notification);
    }
}
