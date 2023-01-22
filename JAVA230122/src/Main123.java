
public interface Main123 {
	static void main(String[]a)throws Exception{
		int n,s=0;
		
		System.out.println(System.in.read()-59);
		while((n=System.in.read()-59)>-1)
			s+=(n-n/24-n/31)/3+1;
		System.out.print(s);
	}
}