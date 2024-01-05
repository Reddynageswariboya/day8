class Student{
int rollno;
String name;
static String college="ITS";
static void change(){
college="MTIET";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod{
public static void main(String args[]){
Student s1=new Student(1,"Ammu");
Student s2=new Student(2,"Bujji");
s1.display();
s2.display();
Student.change();
Student s3=new Student(3,"akhi");
s1.display();
s2.display();
s3.display();
}
}

