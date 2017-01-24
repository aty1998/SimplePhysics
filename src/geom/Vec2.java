package geom;

/**
 * Represents a two-dimensional vector.
 * @author Andrew Yang
 * @version 1.0
 */
public class Vec2
{
    /** The x component of the vector. */
    public double x;

    /** The y component of the vector. */
    public double y;

    /**
     * Constructs a new vector with the given components.
     * @param x  the x component of the vector
     * @param y  the y component of the vector.
     */
    public Vec2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a new vector with its components initially set to zero.
     */
    public Vec2()
    {
        this(0, 0);
    }
}
