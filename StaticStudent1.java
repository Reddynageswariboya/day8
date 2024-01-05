class Student{
String name;
Static String college="ITS";
static void change(){
college="MTIET";
}
Student(int r,String n){
rolln0=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public class TestStaticMethod{
public static void main(String args[]){
Student s1=new Student(1,"Ammu");
Student s2=new Student(2,"Bujji");
Student.change();
Student s3new Student(3,"Akhi");
s1.display();
s2.display();
s3.display();
}
}
