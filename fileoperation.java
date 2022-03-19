import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
class  
	  fileoperation
{
	public static void main(String[] args) throws Exception
	{

		 FileInputStream fis = new FileInputStream("E:\\java\\java\\ac.txt");
		 FileOutputStream fos = new FileOutputStream("E:\\java\\java\\cnnn.txt");
		 
		 int a = 0;
		 //int y = fis.read();
		 while((a=fis.read()) != -1)
		 {
		 	ch



		 	/*System.out.print(a);
		 	char cj = (char) a;
		 	System.out.print(cj);
		 	//fos.write();*/
		 }




		/*File f =  new File("bhushan.txt");
		boolean fvar= file file.createNameFile();
		if(fvar){System.out.prinln("file has been successfully created");}
		else{System.out.prinln("file already present in specifice location");}
		*/


		//boolean f= file.createNewFile();
		
	}
}