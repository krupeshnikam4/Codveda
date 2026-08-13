
import java.util.ArrayList;
import java.util.Scanner;
import javax.security.auth.Subject;

class StudentGrade {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Subject> subjects = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println();
        System.out.println("--- Students Marks Details ---");
        System.out.println();

        System.out.print("Enter number Of Student: ");
        int student = sc.nextInt();

        int subject = 5;
        System.out.print(" Subjects is: " + subject);
        System.out.println();

        int outoffMarks = subject * 100;

        //highest inilize from the zero  
        // take topper name also empty
        int highestMark = 0;
        String Topper = "";

//make for loop for student
        for (int i = 0; i < student; i++) {
            System.out.print("Enter Student Name: ");
            String StudentName = sc.next();

            //inishilize the total marks 
            int Totalmarks = 0;

//make for loop for the subject of the students 
            for (int j = 0; j < subject; j++) {
                System.out.println("      " + (j + 1) + ".Subject");

                System.out.print("Enter Subject Name: ");
                String SUBNmameName = sc.next();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                // total marks 
                Totalmarks = Totalmarks + marks;

            }
            //print here total marks
            System.out.println("======================================");
            System.out.println("Total Marks: " + Totalmarks + "/" + outoffMarks);

            float Average = Totalmarks / subject;
            System.out.println("Average Marks: " + Average + "%");

            //use if statements for check the condition 
            //find the topper students for that student 
            //which students have highest marks 
            if (Totalmarks > highestMark) {
                highestMark = Totalmarks;
                Topper = StudentName;

                //use if statements for check the students Grade 
                if (Average > 90) {
                    System.out.println("Grade O");
                } else if (Average > 80) {
                    System.out.println("Grade A");
                } else if (Average > 70) {
                    System.out.println("Grade B");
                } else if (Average > 60) {
                    System.out.println("Grade C");
                } else if (Average > 50) {
                    System.out.println("Grade D");
                } else if (Average > 40) {
                    System.out.println("Grade E");
                } else if (Average < 40) {
                    System.out.println("Grade F");
                    System.out.println("Bad Result");
                }

            }
            if (Average < 35) {
                System.out.println("Students is Fail");
                System.out.println();
            }
            System.out.println("======================================");
            System.out.println();
        }

        //Topper details show here and which students have highest marks 
        System.out.println("--- Topper Details ---");
        System.out.println();

        System.out.println("Topper name: " + Topper);
        System.out.println("Highest Marks: " + highestMark);
        System.out.println();
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Subject> getSubjects() {
        return subjects;
    }
}

// import java.util.Scanner;
// class StudentGradeTracker{
//          public static void main(String[] args){      
//                Scanner sc = new Scanner(System.in);
//          System.out.println();
//          System.out.println("---Student Marks Details---");
//           System.out.println();
//           System.out.print("Number of Student: ");
//           int Student=sc.nextInt();
//           int subject = 5;
//           String[] name= new String[Student];
//           for(int i=0;i<Student;i++){
//              System.out.print("Enter a name: ");
//  name[i]=sc.next();
//           System.out.print("Math1 Marks: ");
//           int M1 = sc.nextInt();
//           System.out.print("sci Marks: ");
//           int sci = sc.nextInt();
//           System.out.print("chem Mark: ");
//           int chem = sc.nextInt();
//           System.out.print("java Marks: ");
//           int java=sc.nextInt();
//           System.out.print("C Marks: ");
//           int C = sc.nextInt();
//           int TotalMarks = M1+sci+chem+java+C;
//           System.out.println("Total Marks of Student: "+TotalMarks+" / 500 Marks");
//           float average= (float)TotalMarks / subject;
//           System.out.println("Average of Marks: "+average+" %");
//           System.out.println();
//           if(average>35){
//      System.out.print("Student is Pass");
//  }
//  else
//     {
//      System.out.print("Students is Fail");
//  }
//  System.out.println();
//           if(average>=90){
//              System.out.println("Grade: O");
//           }
//           else if(average>=80){
//  System.out.print("Grade: A+");
//           }
//           else if(average>=70){
//  System.out.print("Grade: A");
//           }
//           else if(average>=60){
//              System.out.print("Grade: B+");
//           }
//           else if(average>=50){
//              System.out.print("Grade: B");
//           }
//           else
//              {
//              System.out.print("Grade: Bad Performance");
//           }
//           System.out.println();System.out.println();
//      }
//      }
//  }

