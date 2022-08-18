package HW;
public class  Box <T> {
    private T  name;

    public Box(T name) {
        this.name = name;
    }

    public <T> String Method(){
        return " Person " +name;

    }
}
