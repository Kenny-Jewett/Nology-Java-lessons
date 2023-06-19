public class Student {

    private String name;
    private byte age;
    private String subject;
    private boolean hadGraduated;

    public Student(String name, byte age, String subject, boolean hadGraduated) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.hadGraduated = hadGraduated;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isHadGraduated() {
        return hadGraduated;
    }

    public void setHadGraduated(boolean hadGraduated) {
        this.hadGraduated = hadGraduated;
    }

    void setName(String name) {
        if (name.length() > 4){
            this.name = name;
        }  else {
            System.out.println("Name has to be greater than four characters.");
        }
    }

    String getName() {
        return this.name;
    }

    void printNameAndSubject() {
        System.out.println(this.name + " " + this.subject);
    }

}
