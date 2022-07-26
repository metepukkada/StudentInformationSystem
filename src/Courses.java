public class Courses {
    Teachers courseTeachers;
    String name;
    String code;
    String prefix;
    int note;
    int verbalScore;

    public Courses(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teachers t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeachers = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeachers != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeachers.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}