package sg.edu.rp.c346.boxlist;

public class ToDoBox {

    private String color;

    public ToDoBox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToDoBox{" +
                "color='" + color + '\'' +
                '}';
    }
}
