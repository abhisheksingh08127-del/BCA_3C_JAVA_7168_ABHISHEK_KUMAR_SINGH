import java.util.Scanner;
import Addition.Add;
import Substraction.Sub;
import Multiplication.Multi;
import Division.Div;

public class Arithmain
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter 1st Number:");
		int n1=scn.nextInt();
		
		System.out.println("Enter 2nd Number:");
		int n2=scn.nextInt();
		
		Add a=new Add();
		a.calAdd(n1,n2);
		a.dispAdd();
		
		Sub s=new Sub();
		s.calSub(n1,n2);
		s.dispSub();
		
		Multi m=new Multi();
		m.calMulti(n1,n2);
		m.dispMulti();
		
		Div d=new Div();
		d.calDiv(n1,n2);
		d.dispDiv();
		
		
		
	}
}