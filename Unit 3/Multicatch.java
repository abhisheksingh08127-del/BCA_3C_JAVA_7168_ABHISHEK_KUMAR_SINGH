public class Multicatch{
public static void main(String args[]){
	
	
	try{
		int[] Abhishekscore=new int[3];
		 Abhishekscore[0]=100;
		 Abhishekscore[1]=70;
		 Abhishekscore[2]=99;
		
		 Abhishekscore[7]=99;  //throws ArrayIndexoutofBoundsExeption
		}
	catch(ArithmeticException e){
		System.out.println("ArithmeticEror occured:");
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array Index error:Abhishek accesed invalid index");
		}
		catch(Exception e){
		System.out.println("General Exception handeler" +e);
		}
	}
}	
	