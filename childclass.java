package firstproject;

class parents
{
public void p()
{
System.out.println("This is a parents class");
}
}
class child extends parents
{
public void c()
{
System.out.println("This is a child class");
}
}

public class childclass {

public static void main(String[] args) {
// TODO Auto-generated method stub
parents pc = new parents();
child cc = new child();
parents pcp = new child();
System.out.println("calling the parents method using Parent Object");
pc.p();
System.out.println();
System.out.println("calling the child method using Child Object");
cc.c();
System.out.println();
System.out.println("calling the Parents method using Child Object");
pcp.p();

}

}