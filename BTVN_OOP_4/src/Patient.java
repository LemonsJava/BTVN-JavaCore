
public class Patient extends Person{
    private int numberMedical;
    private String hospitalalizedDay;

    public Patient() {
    }

    public Patient(String name, int age, String address, int numberMedical, String hospitalalizedDay) {
        super(name, age, address);
        this.numberMedical = numberMedical;
        this.hospitalalizedDay = hospitalalizedDay;
    }

    public int getNumberMedical() {
        return numberMedical;
    }

    public void setNumberMedical(int numberMedical) {
        this.numberMedical = numberMedical;
    }

    public String getHospitalalizedDay() {
        return hospitalalizedDay;
    }

    public void setHospitalalizedDay(String hospitalalizedDay) {
        this.hospitalalizedDay = hospitalalizedDay;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                "numberMedical=" + numberMedical +
                ", hospitalalizedDay='" + hospitalalizedDay + '\'' +
                '}';
    }
}
