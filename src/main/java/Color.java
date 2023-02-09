
public enum Color {

    BLANCYNEGRO("Blanco y negro"),
    COLOR("Color");

    private final String color;
    Color(String color){
        this.color=color;
    }

@Override
    public String toString(){
        return color;
}
}
