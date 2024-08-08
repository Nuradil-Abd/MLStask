public class School {
    private Person highSchoolStudent, teacher;
    private String lessons;

    public School() {
    }

    public School(Person highSchoolStudent, String lessons) {
        this.highSchoolStudent = highSchoolStudent;
        this.lessons = lessons;
    }

    public School(String lessons, Person teacher) {
        this.lessons = lessons;
        this.teacher = teacher;
    }

    public Person getHighSchoolStudent() {
        return highSchoolStudent;
    }

    public void setHighSchoolStudent(Person highSchoolStudent) {
        this.highSchoolStudent = highSchoolStudent;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getInfo() {
        return
                "lessons: '" + lessons + '\'' +
                "\n";
    }

}
