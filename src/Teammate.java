public class Teammate {

    private String name;
    private boolean hasRing;

    public Teammate(String name, boolean hasRing) {
        this.name = name;
        this.hasRing = hasRing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRing() {
        return hasRing;
    }

    public void setHasRing(boolean hasRing) {
        this.hasRing = hasRing;
    }

    @Override
    public String toString() {
        return "Teammate{" +
                "name='" + name + '\'' +
                ", hasRing=" + hasRing +
                '}';
    }
}
