public class SomeCourse {

    private String name;
    private int students;

    public SomeCourse(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "SomeCourse{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}