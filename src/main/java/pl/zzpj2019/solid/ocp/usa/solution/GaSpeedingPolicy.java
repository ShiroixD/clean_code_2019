package pl.zzpj2019.solid.ocp.usa.solution;

public class GaSpeedingPolicy implements SpeedingPolicy {
    private static final int MAX_SPEED = 75;

    @Override
    public double calculateFine(int speed) {
        if (speed > MAX_SPEED) {
            return 110.0;
        } else {
            return 0.0;
        }
    }
}
