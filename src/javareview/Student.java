package javareview;

public class Student {
    // ---access specifier / access modifier---
    // ตัวระบุการเข้าถึงตัวแปรและเททอด มี 4 ระดับ
    // private, public, package (default), protected

    // --------1. field, attribute, instance variable------------
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    // --------2. constructor------------
    // --------ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    // --------3. method (คล้ายฟังก์ชัน)---------
    double getTotalScore(){
        double total = midtermScore + finalScore;
        return total;
    }
    //--------getters------------
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }
    public String toString(){
        return id + " :: " + name;
    }

}
