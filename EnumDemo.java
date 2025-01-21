//The values() and valueOf() methods
enum Apple{kashmir,A1,A2,A3,A4}
public class EnumDemo {
	public  static void main(String[] args)
	{
		Apple ap;
		System.out.println("Here are the all type of apple:");
		Apple [] allapples = Apple.values();
		for(Apple a :allapples)
			System.out.println(a);
		ap = Apple.valueOf("A2");
		System.out.println("ap conatains : "+ap);
	}

}
