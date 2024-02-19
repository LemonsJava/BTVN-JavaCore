public class Doctor extends Person{
    private String specialist;
    private double timeWork;

    public Doctor() {
    }

    public Doctor(String name, int age, String address, String specialist, double timeWork) {
        super(name, age, address);
        this.specialist = specialist;
        this.timeWork = timeWork;
    }


    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                "specialist='" + specialist + '\'' +
                ", timeWork=" + timeWork +
                '}';
    }
}
