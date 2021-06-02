package Method;

public class ConstructorReference {
	ConstructorReference(){
		System.out.println("constructor");
	}
}
class Main{
	public static void main(String[] args) {
		Interf i=ConstructorReference::new;
		ConstructorReference c=i.get();
	}
}

interface Interf{
	public ConstructorReference get();
}