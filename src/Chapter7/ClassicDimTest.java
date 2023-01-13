package Chapter7;

public class ClassicDimTest {
    public static void main(String[] args) {
      int [] [] gradeArray= {
              {67,34,55,67,87},
              {34,55,67,89,65},
              {23,667,7,88,97},
              {23,11,2,445,67}

      };
      ClassicDIm dimensional = new ClassicDIm("English", gradeArray);
        System.out.printf("WELCOME TO MY GRADE-BOOK FOR %n%n%s%n%n", dimensional.getCourseName());
        dimensional.processGrades();
    }
}
