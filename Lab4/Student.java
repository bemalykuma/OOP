public class Student {

    public String name;
    public double mScore;
    public double fScore;

    public void showGrade() {
        double score = (mScore * 0.4) + (fScore * 0.4) + 20;
        System.out.print("Your grade is ");
        if (score < 50) {
            System.out.println("F.");
        } else if (score >= 50 && score < 60) {
            System.out.println("D.");
        } else if (score >= 60 && score < 70) {
            System.out.println("C.");
        } else if (score >= 70 && score < 80) {
            System.out.println("B.");
        } else if (score >= 80) {
            System.out.println("A.");
        }
    }

}