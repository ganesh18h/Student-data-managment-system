import java.util.ArrayList;
import java.util.Scanner;
class Main 
{
    //student class to store
    static class Student
    {
        int Roll;
        String Name;
        float Marks;
        //intialize the object
        public Student(int roll,String name,float marks)
        {
        this.Name=name;
        this.Roll=roll;
        this.Marks=marks;
        }
        public void display()
        {
            System.out.println("Name         :"+Name);
            System.out.println("Roll Number  :"+Roll);
            System.out.println("Marks        :"+Marks);
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        int choice;
        do
        {
            System.out.println("\nStudent Data Managment Systems");
            System.out.println("1.Add student");
            System.out.println("2.view all students");
            System.out.println("3.Search by roll number");
            System.out.println("4.Delete student");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                //Entering Student deatails
                System.out.println("Enter Student Name");
                String name=sc.nextLine();


                System.out.println("Enter the roll number");
                int roll=sc.nextInt();


                System.out.println("Enter the marks");
                float marks=sc.nextFloat();


                students.add(new Student(roll, name, marks));


                System.out.println("The deatils entered Succesfully");
                break;

                case 2: 
                if(students.isEmpty())
                {
                    System.out.println("there is no data");
                }else
                    {
                    for(Student st:students)
                        {
                            st.display();
                        }
                    }
                    break;
                case 3:
                System.out.println("Enter the roll number");
                int Searchroll=sc.nextInt();
                boolean found=false;
                for(Student st:students)
                {
                    if(st.Roll==Searchroll)
                    {
                        System.out.println("\n Student details founded!!");
                        st.display();
                        found=true;
                        break;
                    }
                }
                if(!found)
                    {
                        System.out.println("Student not found");
                    }
                break;
                case 4:
                System.out.println("Enter the student roll number  to delete");
                int deleteroll=sc.nextInt();
                boolean deleted=false;
                for(int i=0;i<students.size();i++)
                {
                    if(students.get(i).Roll==deleteroll)
                    {
                        students.remove(i);
                        System.out.println("Deleted succesfully");
                        deleted=true;
                        break;
                    }
                }
                
                if(!deleted)
                {
                    System.out.println("Student details not found");
                    break;
                }


                case 5:
                System.out.println("Exiting from the menu");
                break;

                default:
                System.out.println("Invalid choice");
                break;
            
            }
        }
            while(choice!=5);
            sc.close();
    }   
}
