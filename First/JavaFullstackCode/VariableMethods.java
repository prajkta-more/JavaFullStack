package p1;
public class VariableMethods 
{
int gb=20;        //Global /Instance variable
static int s=40;  //Static variable
void show()
{
int a=10;         //Local Variable
System.out.println("Local variable:"+a);
}
static void greet()
{
System.out.println("Static method called");
}
public int add(int a,int b)
{
	return a+b;
}
public static void main(String[] args)
{
VariableMethods v=new VariableMethods();
System.out.println("Global variable:"+v.gb);
System.out.println("Static variable:"+VariableMethods.s);
v.show();//Local method call.
VariableMethods.greet();//Classname.methodname(Static Method call).
int result=v.add(5,5);
System.out.println("Addition (From method with argument and return value):"+result);//calling method with parameter.

}
}