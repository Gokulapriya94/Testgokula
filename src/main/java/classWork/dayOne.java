package classWork;

public class dayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. program-Calling a method-Calculator
//		Calculator c= new Calculator();
//			c.add(0);
//			c.sub(0);
//			c.mul(0);
//			c.div(0);
//			
//			
//		
		
	
		
//		1.Greatest of three number
/*		int a=10,b=30,c=20;
		
		if (((a>b)&&(a>c)))
		{
			System.out.println("A is Greatest");
		}else if((b>c))
		{
			System.out.println("B is Greatest");
		}else
		{
			System.out.println("C is Greatest");
	} 
	*/
		
//		2.Sum of 1+2+3.....+10
		/*int i,j=10,sum=0;
		
		for(i=1;i<=j;i++)
		{
			sum=sum+i;
			
			}
		System.out.println(sum);
			*/
		
//		3.Odd number upto 100
		
	/*	int j,i=0,temp;
		int n=100;
		System.out.println("Odd numbers are between "+i+" to " +n+ " are ");
		{
		for (j=i;j<n;j++)
		{
			temp=j%2;
			if((temp==1))
			
			{
				//System.out.println("Odd numbers are between "+i+" to " +n+ " are "+j);
				System.out.println(j);
			}
			
//			else if ((temp==0))
//			{
//				System.out.println("Even numbers are"+j);
//			} 
			
		}
		}		
	 */
		    
//			4. Find prime number within 100
		
		
	/*	int i,n=100,temp;
		System.out.println("Prime numbers till 100 are:");
		{
		for (i=1;i<=n;i++) 
			
		for(int j=i;j<=i;j++)
		{
			temp=(i/j);
		if ((temp)==1)
		{
			System.out.println("Answer"+temp);
		}
		}       */   
//			5.Switch case:
		
/*		int i;
		
		switch(i=100) {
		case 1:
			System.out.println("1.January");
			break;
		case 2:
			System.out.println("2.February");
			break;
		case 3:
			System.out.println("3.March");
			break;
		case 4:
			System.out.println("4.April");
			break;
		case 5:
			System.out.println("5.May");
			break;
		case 6:
			System.out.println("6.June");
			break;
		case 7:
			System.out.println("7.July");
			break;
		case 8:
			System.out.println("8.August");
			break;
		case 9:
			System.out.println("9.September");
			break;
		case 10:
			System.out.println("10.October");
			break;
		case 11:
			System.out.println("11.November");
			break;
		case 12:
			System.out.println("12.December");
			break;
		default:
			System.out.println("Exceeds the month limit, select month between 1 to 12");
			
		}   */
		
//			Checking Prime number or not
		int i,num=13;
		int count=0;
		
		for (i=0;i<= num;i++) {
			
			System.out.println(i);
			if((num%i)==0) {
				count++;
			}
if(count==2)
{
	System.out.println(num + " is a Prime number");
}else {
	System.out.println(num + " is Not a Prime number");
}
		}
	
		
	}

	}

		
	

