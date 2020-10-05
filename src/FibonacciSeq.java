
import acm.program.*;

public class FibonacciSeq extends ConsoleProgram {
	public void run () {
	println ("This program lists the Fibonacci sequesnce");
	int n1=0;
	int n2=1;
	while (n1 <= MAX_TERM_VALUE) {
		println (n1);
		int n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
	}
	}
	final int MAX_TERM_VALUE = 10000;
}