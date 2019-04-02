package pl.zzpj2019.solid.ocp.usa.solution;

public class ScSpeedingPolicy implements SpeedingPolicy {
    private static final int MAX_SPEED = 60;

    @Override
    public double calculateFine(int speed) {
        if (speed > MAX_SPEED) {
            return 180.0;
        } else {
            return 0.0;
        }
    }
}
