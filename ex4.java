public class ex4 {
    public static void main(String[] args){
        Student s = new Student(3,120,"John Student");
        Student s2= new Student(4,120,"Hello Student");
        System.out.println(s.toString());
        System.out.println();

        Student s3 = new Student(3,120,"John Student");
        Student s4= new Student(4,120,"Hello Student");
        Student s5= new Student(4,120,"Wello Student");
        System.out.println(s4.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s4));
        System.out.println();

        Student s6 = new Student(3,120,"John Student");
        Student s7= new Student(4,120,"Hello Student");
        System.out.println(s7.avgcrHigher(s6));
        System.out.println(s6.avgcrHigher(s7));

    }
}

class Student {
    private int yearsStudied;
    private int credits;
    private String name;

    public Student(){
        this(0,0,"Unknown");
    }
    public Student(int yrs,int crd,String nm){
        yearsStudied = yrs;
        credits = crd;
        name = nm;
    }
    public String getName(){
        return name;
    }
    public double getAverageCreditsPerYear(){
        if (yearsStudied == 0)
            return -1;
        return (double)credits/yearsStudied;
    }
    public int getYrsStudied() {
        return yearsStudied;
    }
    public int getCredits() {
        return credits;
    }

    public String toString() {
        return name + " Cr:" + credits + " Ys:" + yearsStudied;
    }
    public boolean equals(Student other) {
        if (this.yearsStudied == other.yearsStudied && this.credits == other.credits ){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean avgcrHigher(Student other) {
        return this.getAverageCreditsPerYear() < other.getAverageCreditsPerYear();
    }
}