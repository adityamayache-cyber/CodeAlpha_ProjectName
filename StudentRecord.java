import java.util.Scanner;
public class StudentRecord
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of students:");
        int n =sc.nextInt();
        sc.nextLine();
        Student[] students =new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the detail of student"+(i+1));
            System.out.println("enter name");
            String name =sc.nextLine();
            System.out.println("enter marks:");
            int marks = sc.nextInt();   
            sc.nextLine();
            students[i] = new Student(name, marks);
        }  
        System.out.println("\n     Student Details   ");
        for(int  i=0;i<n;i++)
            {
                students[i].display();
            } 
            Student.ShowSummary(n); 
        
     

    }
    
}
class Student
{
    String name;
    int marks;
    char grade;
    static int total=0;
    static int highest= Integer.MIN_VALUE;
    static int lowest=Integer.MAX_VALUE;
     
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks; 
        calculategrade();
        total=total+marks;
        if(marks>highest)
        {
            highest=marks;
        }
        if(marks<lowest)
        {
           lowest=marks;
        }
    }
   
   void calculategrade()
   {
            if(marks>=90)
            {
                grade='A';
            }
            else if(marks>=70)
            {
                 grade ='B';
            }
            else if(marks>=50)
            {
                 grade='C';
            }
            else
            {
                grade ='F';
            }
            
        } 
        void lowest()
        {
            if(lowest>marks)
            {
                lowest=marks;
            }
            else{
                lowest=lowest;
            }
        }     
void display()
    {
        System.out.println("Name:  "+ name +"      Marks:"+marks+"    Grade:"+grade);
    }
    static void ShowSummary(int n)
    {
        double average =(double)total/n;
        System.out.println("\n   Summary   ");
        System.out.println("Highest Scores:"    +highest);
        System.out.println("Lowest Scores:"     +lowest);
        System.out.println("Average Scores:"    +average);

    }
}