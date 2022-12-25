public class CourseImpl extends Course {
    private String name;

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}