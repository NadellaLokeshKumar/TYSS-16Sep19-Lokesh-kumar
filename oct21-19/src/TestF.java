
public class TestF {
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add();
	c.mull();
	System.out.println("**********************");
	SciCalculator sc = new SciCalculator();
	sc.add();
	sc.mull();
	sc.sin();
	sc.cos();
}
}
