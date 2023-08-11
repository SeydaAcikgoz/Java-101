package obs;

public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course smat;
    Course sfizik;
    Course skimya;
    double mAvarage;
    double fAvarage;
    double kAvarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat = smat;
        this.fizik = sfizik;
        this.kimya = skimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int smat,int sfizik,int skimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozlu = smat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozlu = sfizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.sozlu = skimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Matematik Ortalama : " + this.mAvarage);
            System.out.println("Fizik Ortalama : " + this.fAvarage);
            System.out.println("Kimya Ortalama : " + this.kAvarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fAvarage = (this.fizik.note*80/100)+(this.fizik.sozlu*20/100);
        this.kAvarage = (this.kimya.note*80/100)+(this.kimya.sozlu*20/100);
        this.mAvarage = (this.mat.note*80/100)+(this.mat.sozlu*20/100);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return (this.fAvarage > 55 && this.mAvarage > 55  && this.kAvarage > 55 );
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
