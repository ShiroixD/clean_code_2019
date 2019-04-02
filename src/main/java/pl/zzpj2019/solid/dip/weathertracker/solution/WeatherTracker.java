package pl.zzpj2019.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private WeatherAlertGenerator alertGenerator;
    private String currentConditions;

    public WeatherTracker(WeatherAlertGenerator alertGenerator) {
        this.alertGenerator = alertGenerator;
    }

    public void setCurrentConditions(String currentConditions) {
        this.currentConditions = currentConditions;
        alertGenerator.generateWeatherAlert(currentConditions);
    }
}
