import java.util.Scanner;
class Employee{
private int eid;
private String name;
private String dept;
public void setEid(int eid){this.eid=eid;}
public void setName(String name){this.name=name;}
public void setDept(String dept){this.dept=dept;}
public int getEid(){return this.eid;}
public String getName(){return this.name;}
public String getDept(){return this.dept;}
}
class Program2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[4];

for(int i=0;i<4;i++){
ob[i]=new Employee();
ob[i].setEid(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDept(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("Eid:"+ob[j].getEid());
System.out.println("Name:"+ob[j].getName());
System.out.println("Dept:"+ob[j].getDept());
}
}
}