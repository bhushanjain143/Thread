class A
{
	void m1 (student ss)
	{
	System.out.println(ss.age);
	System.out.println(ss.loc);
	}
}
class student
{
int age;
String loc;
	
}
class B1
{
	public static void main(String[] args) 
	{
	A aaa  = new A();
	student  st11 = new student();
	st11.age = 100;
	st11.loc = "bhus";
	aaa.m1(st11);
	}
}