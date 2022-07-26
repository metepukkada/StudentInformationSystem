public class StudentInformationSystem {
    public static void main(String[] args) {

        Courses mat = new Courses("Matematik", "MAT101", "MAT");
        Courses fizik = new Courses("Fizik", "FZK101", "FZK");
        Courses kimya = new Courses("Kimya", "KMY101", "KMY");

        Teachers t1 = new Teachers("Mahmut Hoca", "90550000000", "MAT");
        Teachers t2 = new Teachers("Fatma Ayşe", "90550000001", "FZK");
        Teachers t3 = new Teachers("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Students s1 = new Students("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkVerbalScore(100,100,100);
        s1.isPass();

        Students s2 = new Students("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVerbalScore(100,100,100);
        s2.isPass();

        Students s3 = new Students("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkVerbalScore(100,100,100);
        s3.isPass();

    }
}
