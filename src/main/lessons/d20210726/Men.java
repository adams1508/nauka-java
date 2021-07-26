package main.lessons.d20210726;

public class Men {
    private String name;
    private long height;
    boolean hasCar;

    public Men(String name, long height, boolean hasCar) {
        this.name = name;
        this.height = height;
        this.hasCar = hasCar;
    }

    public String getName() {
        return this.name;
    }

    public long getHeight() {
        return this.height;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setName() {
        this.name = name;
    }

    public void setHeight() {
        this.height = height;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }
}
