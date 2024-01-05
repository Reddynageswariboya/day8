class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Program{
public static void main(String args[]){
Student[]ob=new Student[5];
ob[0]=new Student();
ob[0].setId(3011);
ob[0].setName("Ammu");
System.out.println("ID:"+ob[0].getId());
System.out.println("Name:"+ob[0].getName());
ob[1]=new Student();
ob[1].setId(3012);
ob[1].setName("Bujji");
System.out.println("ID:"+ob[1].getId());
System.out.println("Name:"+ob[1].getName());
ob[2]=new Student();
ob[2].setId(3013);
ob[2].setName("Akhi");
System.out.println("ID:"+ob[2].getId());
System.out.println("Name:"+ob[2].getName());
ob[3]=new Student();
ob[3].setId(3014);
ob[3].setName("Naga");
System.out.println("ID:"+ob[3].getId());
System.out.println("Name:"+ob[3].getName());
ob[4]=new Student();
ob[4].setId(3015);
ob[4].setName("lakshmi");
System.out.println("ID:"+ob[4].getId());
System.out.println("Name:"+ob[4].getName());
}
}