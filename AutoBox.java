//Demo for Autobox and unbox in expression Wrapper concept.
public class AutoBox {
	public static void main(System args[])
	{
		Integer iob,iob2;
		int i;
		iob = 100;
		System.out.println("Original value of job: "+iob);
		++iob;
		System.out.println("After ++iob:"+iob);
		iob2=iob+(iob/3);
		System.out.println("After expression ion2:"+iob2);
		i=iob+(iob/3);
		System.out.println("i after expression:"+i);
	}

}
