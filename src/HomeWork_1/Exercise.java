package HomeWork_1;

import java.util.Objects;

public class Exercise {

    private final int intA;
    private final int intB;

    public Exercise(int intA, int intB) {
        this.intA = intA;
        this.intB = intB;
    }

    public int getIntA() {
        return intA;
    }

    public int getIntB() {
        return intB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return intA == exercise.intA && intB == exercise.intB || intA == exercise.intB && intB == exercise.intA ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intA) + Objects.hashCode(intB);
    }

    @Override
    public String toString() {
        return intA + " * " + intB + " = ?";
    }
}
