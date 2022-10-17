package Week3;

public class Student
{

    private String id;
    private String fullname;
    private Course course;

        public Student(String id, String fullname)
        {
            this.id = id;
            this.fullname = fullname;
        }

    public void enrol(Course course)
    {
        this.course = course
    }

    public void print()
    {
        System.out.println(id + " " + fullname);
    }
}
