package domain.units;

/**
 * The type Unit.
 */
public class Unit {

    private long id =999;

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;

        Unit unit = (Unit) o;

        return id == unit.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
