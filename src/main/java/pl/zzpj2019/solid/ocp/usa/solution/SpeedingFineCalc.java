package pl.zzpj2019.solid.ocp.usa.solution;

public class SpeedingFineCalc {
    public static double calculateSpeedingFine(SpeedingPolicy speedingPolicy, int speed) {
        return speedingPolicy.calculateFine(speed);
    }
}
