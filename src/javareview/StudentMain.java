package javareview;

public class StudentMain {
    public static void main(String[] args) {

        Student tom = new Student(1,"siriboon");
        Student tang = new Student(2,"chutima");

        System.out.println(tom.getId() + " : "+tom.getName());
        System.out.println(tang.getId() + " : "+tang.getName());

        System.out.println(tom);
        System.out.println(tang);

        tom.setMidtermScore(10);
        tom.setFinalScore(8);
        System.out.println("Tom's total = " + tom.getTotalScore());

    }
}
