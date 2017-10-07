class JuiceSize{
	enum FreshJuiceSize{SMALL, LARGE}
	FreshJuiceSize size;
}

public class JuiceTest {
	public static void main(String[] args){
		JuiceSize juice = new JuiceSize();
		juice.size = JuiceSize.FreshJuiceSize.LARGE;
		System.out.println("size is " + juice.size);
	}
}
