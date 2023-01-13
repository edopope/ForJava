package Chapter7;

public class ClassicDIm {
    private String courseName;
    private int [] [] grades;

    public ClassicDIm(String courseName, int [] [] grades){
        this.courseName = courseName;
        this.grades = grades;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
public void processGrades(){
        outputGrades();
    System.out.printf("%n%s  %d%n%s %d%n%n",
            "the lowest grade is:",getMinimum(),
            "and the highest grade is ",getMaximum());
}
    public int getMinimum(){
        int lowGrade = grades[0] [0];
        for(int [] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0] [0];
        for(int [] studentGrades : grades){
            for(int grade : studentGrades){
               if(grade > highGrade) {
                   highGrade = grade;
               }
            }
        }
        return highGrade;
    }

    public double getAverage(int [] setOfGrades){
        int total = 0;
        for(int grade : setOfGrades){
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

public void outputGrades(){
    System.out.printf("the grades are %n%n");
    System.out.print("        ");
    for (int test = 1; test < grades[0].length ; test++) {
        System.out.printf("Test %d ",test);
    }
    System.out.println("Average");
    for (int student = 1; student < grades.length; student++) {
        System.out.printf("student %2d", student);
        for(int test : grades[student]){
            System.out.printf("%8s", test);

        }
        double average = getAverage(grades[student]);
        System.out.printf("%9.2f%n", average);

    }
}

}

