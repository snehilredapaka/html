import java.util.Scanner;
class EvilnumberProg{
	public String Model3(int num)
	{
		int sq=(int)Math.pow(num,2),tmp=sq,rem=0,sum=0;
		for(;sq!=0;sq/=10)
		{
		    rem=sq%10;
		    sum=sum+rem;
		}
		sq=tmp;	
		if(num==sum)
		{
			return"is an evil number";
		}
		else
		{
			return"is not an evil numbar";
		}
	}
}
public class Evilnumber {

	public static void main(String[] args) {
		EvilnumberProg obj=new EvilnumberProg();
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String result=obj.Model3(input);
		     System.out.println(input+" "+result);
		// TODO Auto-generated method stub

	}

}