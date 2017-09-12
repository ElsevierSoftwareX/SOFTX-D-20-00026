package polyrun.sampling;


import polyrun.UnitNSphere;

import java.util.Random;

/**
 * HitAndRun sampler.
 */
public class HitAndRun extends RandomWalk {

    private final Random random;
    private final UnitNSphere unitNSphere;

    public HitAndRun() {
        this(new Random());
    }

    public HitAndRun(Random random) {
        this.random = random;
        this.unitNSphere = new UnitNSphere(random);
    }

    @Override
    protected void fillDirectionVector(double[] direction, boolean homogeneous) {
        this.unitNSphere.fillVectorWithRandomPoint(direction, homogeneous);
    }

    @Override
    protected double selectStepLength(double[] direction, double bg, double ed) {
        return (bg + (ed - bg) * this.random.nextDouble());
    }
}