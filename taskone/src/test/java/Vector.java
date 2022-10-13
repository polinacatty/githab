import java.util.Objects;
import static java.lang.Math.sqrt;
public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return sqrt(x * x + y * y + z * z);
    }

    double scalarProduct(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    Vector crossProduct(Vector vector) {
        double X = this.y * vector.z - this.z * vector.y;
        double Y = this.z * vector.x - this.x * vector.z;
        double Z = this.x * vector.y - this.y * vector.x;
        return new Vector(X, Y, Z);
    }

    double cos(Vector vector) {
        return scalarProduct(vector) / (this.length() * vector.length());
    }

    Vector add(Vector vector) {
        double X = this.x + vector.x;
        double Y = this.y + vector.y;
        double Z = this.z + vector.z;
        return new Vector(X, Y, Z);
    }

    Vector subtract(Vector vector) {
        double X = this.x - vector.x;
        double Y = this.y - vector.y;
        double Z = this.z - vector.z;
        return new Vector(X, Y, Z);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 0;
        result += prime * Double.hashCode(x);
        result += prime * prime * Double.hashCode(y);
        result += prime * prime * prime * Double.hashCode(z);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        Vector other = (Vector) object;
        if (this.x == other.x & this.y == other.y & this.z == other.z) {
            return true;
        }
        else {
            return false;
        }
    }
}
