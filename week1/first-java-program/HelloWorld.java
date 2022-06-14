public class HelloWorld{

	// This is a single comment
	/*
	This is a multi line comment
	access modifier: public 
	non access modifer: static
	return type: void
	method name: main (Entry point of JVM)
	*/
	public static void main(String[] args){
		System.out.println("Hello World!");
		if(args.length == 0){
			System.out.println("No arguments in args");
		} else {
			System.out.println(args[0]);
		}
	}
}
