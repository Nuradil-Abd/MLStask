public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Tesla");
        car1.setColor("White");
        car1.setPrice(75000);
        car1.setDateOfIssue(2020);

        Car car2 = new Car();
        car2.setModel("Ford");
        car2.setColor("Blue");
        car2.setPrice(45000);
        car2.setDateOfIssue(2017);

        Car car3 = new Car();
        car3.setModel("Chevrolet");
        car3.setColor("black");
        car3.setPrice(55000);
        car3.setDateOfIssue(2021);

        Person studentOfSchool = new Person();
        studentOfSchool.setName("Kayrat");
        studentOfSchool.setAge(15);
        studentOfSchool.setStatus("Student of high school");


        Person teacherOfSchool = new Person();
        teacherOfSchool.setName("Ilim");
        teacherOfSchool.setAge(33);
        teacherOfSchool.setStatus("Teacher of high school");
        teacherOfSchool.setCar(car2);

        Person studentOfUniversity = new Person("Bektur","student of Oxford university",24, car3);
        Person teacherOfUniversity = new Person("Bradley","IT teacher",38,car1);

        School school = new School();
        school.setHighSchoolStudent(studentOfSchool);
        school.setLessons("English");

        School school1 = new School();
        school1.setLessons("Math");
        school1.setTeacher(teacherOfSchool);

        University university = new University();
        university.setName("Oxford University");
        university.setStudent(studentOfUniversity);
        university.setTeacherInUniversity(teacherOfUniversity);

        Car[] cars ={car1,car2,car3};
        Person[] persons = {studentOfSchool,teacherOfSchool,studentOfUniversity,teacherOfUniversity};
        School[] schools = {school,school1};
        University[] universities = {university};

        carsInfo(cars);
        personInfo(persons);
        schoolsInfo(schools);
        universityInfo(universities);

    }


    public static void carsInfo(Car[] cars){
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void personInfo(Person[] persons){
        for (Person person : persons) {
            person.getInfo();
            if(person.getCar() != null) {
                System.out.println("\n Car: " + person.getCar().getModel() +"\n");
            }else System.out.println("\n");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void schoolsInfo(School[] schools){
        for (School school : schools) {
        System.out.println("School");
            if(school.getHighSchoolStudent() != null){
            System.out.println("HighSchoolStudent : " + school.getHighSchoolStudent().getName());}
            if(school.getTeacher() != null){
                System.out.println("Teacher: " + school.getTeacher().getName());
            }
            System.out.println(school.getInfo());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void universityInfo(University[] universities){
        for (University university : universities) {
            System.out.println("University" +
                    "\nname: '" + university.getName() + '\'' +
                    "\nstudent: " + university.getStudent().getName() +
                    "\nteacher of university: " + university.getTeacherInUniversity().getName() +
                    "\n");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}