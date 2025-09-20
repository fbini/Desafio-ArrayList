package TimeSkillo03;

public class Names {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
