package dercochenko.com.Modules.Task8;

import java.util.Objects;

public class Vector {
    private final double x, y, z;
    private final char nameVector;
    private int thisHashCode;


    public Vector(char nameVector, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nameVector = nameVector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        double thisSize = Math.sqrt(x * x + y * y + z * z);
        double incomingSize = Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z);
        return thisSize == incomingSize;
    }

    @Override
    public int hashCode() {
        if (thisHashCode == 0) {
            thisHashCode = Objects.hash(x, y, z);
        }
        return thisHashCode;
    }

    @Override
    public String toString() {
        return "Vector ( " + nameVector +
                "(" + x + ',' + y + ',' + z +
                "), hashCode=" + hashCode() +
                ")";
    }
}
