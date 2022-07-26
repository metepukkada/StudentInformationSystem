public class Students {
    String name,stuNo;
    int classes;
    Courses mat;
    Courses fizik;
    Courses kimya;
    double avarage;
    boolean isPass;


    Students(String name, int classes, String stuNo, Courses mat,Courses fizik,Courses kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkVerbalScore(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100){
            this.mat.verbalScore = mat;
        }
        if (fizik >= 0 && mat <= 100){
            this.fizik.verbalScore = fizik;
        }
        if (kimya >= 0 && mat <= 100){
            this.kimya.verbalScore = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalScore == 0 || this.fizik.verbalScore == 0 || this.kimya.verbalScore == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage + "\n" +
                    "(Sınav Notları %80, Sözlü Notları %20 Geçerlidir)");
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3 * 0.80 + (this.fizik.verbalScore + this.kimya.verbalScore + this.mat.verbalScore) / 3 * 0.20;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " || Sözlüsü : " + this.mat.verbalScore);
        System.out.println("Fizik Notu : " + this.fizik.note + " || Sözlüsü : " + this.fizik.verbalScore);
        System.out.println("Kimya Notu : " + this.kimya.note + " || Sözlüsü : " + this.kimya.verbalScore);
    }

}