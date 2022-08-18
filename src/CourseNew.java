public class CourseNew implements Course {
    private String name;
    public CourseNew(String name) {
        this.name = name;

    }
    @Override
    public String toString() {
        return name;
    }

}
