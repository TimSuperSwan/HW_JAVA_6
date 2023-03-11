public class NoteBook {

    private String model;
    private String color;
    private String ram;
    private String hdd;
    public NoteBook(String model, String color, String ram, String hdd) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public String toString() {
        return "NoteBook [model=" + model + ", color=" + color + ", ram=" + ram + ", hdd=" + hdd + "]";
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getRam() {
        return ram;
    }
    public String getMemory() {
        return hdd;
    }

    

    

}