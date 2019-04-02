package pl.zzpj2019.solid.dip.weathertracker.solution;

public class EmailAlert implements WeatherAlertGenerator {
    @Override
    public void generateWeatherAlert(String weatherConditions) {
        String email = "It is " + weatherConditions;
        System.out.println("New email:\n" + email);
    }
}
