public class Lamp {

    private String name;
    private String color;
    private boolean isOn;

    public Lamp(String name, String color, boolean isOn) {
        this.name = name;
        this.color = color;
        this.isOn = isOn;
    }

    void lampSwitch() {
        if(this.isOn) {
            System.out.println(this.name  + " is Off");
            setOn(!isOn);
        } else {
            System.out.println(this.name  + " is On");
            setOn(!isOn);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
