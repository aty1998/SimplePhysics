package geom;

/**
 * Represents a two-dimensional axis-aligned bounding box.
 * @author Andrew Yang
 * @version 1.0
 */
public class AABB
{
    public double width;

    public double height;

    public AABB(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public AABB()
    {
        this(0, 0);
    }
}
