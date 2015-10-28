package polyrun.solver;

import polyrun.constraints.ConstraintsSystem;
import polyrun.exceptions.UnboundedSystemException;

/**
 * Represents solver of General Linear Programming problem.
 */
public interface GLPSolver {
    enum Direction {
        Maximize,
        Minimize
    }

    SolverResult solve(Direction direction, double[] objective, ConstraintsSystem constraints) throws UnboundedSystemException;
}
