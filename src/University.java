public class University {

    private String name;
    private Person student, teacherInUniversity;


    public University() {
    }

    public University(String name, Person student, Person teacherInUniversity) {
        this.name = name;
        this.student = student;
        this.teacherInUniversity = teacherInUniversity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public Person getTeacherInUniversity() {
        return teacherInUniversity;
    }

    public void setTeacherInUniversity(Person teacherInUniversity) {
        this.teacherInUniversity = teacherInUniversity;
    }



}
