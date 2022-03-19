class bhus
{
	int a = 10;
	Static  b = 20;
}
class Staticex extends bhus
{
	bhus bb =new bhus();
	bb.a++;
	bb.b++;
	//bhus b1 =new bhus();
	//bhus b2 =new bhus();
	System.out.println(bb.a);


}