public class ex3 {
    public static void main(String[] args){
        Student s = new Student();
        double d = s.getAverageCreditsPerYear();
        System.out.println(s.getName());
        System.out.println(d);
        System.out.println();

        Student s1 = new Student(3,100,"Sam Student");
        double d1 = s1.getAverageCreditsPerYear();
        System.out.println(s1.getName());
        System.out.println(d1);
    }
}

class Student {
    private int yearsStudied;
    private int credits;
    private String name;

    public Student(){
        this.yearsStudied = 0;
        this.credits = 0;
        this.name = "Unknown";
    }

    public Student(int yearsStudied, int credits, String name) {
        this.yearsStudied = yearsStudied;
        this.credits = credits;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getCredits(){
        return credits;
    }

    public int getAverageCreditsPerYear() {
        if (yearsStudied == 0) {
            return -1;
        }
        else{
            return (int) credits / yearsStudied;
        }
    }


}
