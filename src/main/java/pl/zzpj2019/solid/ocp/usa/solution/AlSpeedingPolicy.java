package pl.zzpj2019.solid.ocp.usa.solution;

public class AlSpeedingPolicy implements SpeedingPolicy {
    private static final int MAX_SPEED = 70;

    @Override
    public double calculateFine(int speed) {
        if (speed > MAX_SPEED) {
            return 28.0;
        } else {
            return 0.0;
        }
    }
}
