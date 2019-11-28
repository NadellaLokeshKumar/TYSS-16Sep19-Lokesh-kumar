
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "orange";
		p.brand = "Butter Flow";
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brnad is "+p.brand);
		p.write();
		
		System.out.println("**************************************");
		Van v = new Van();
		v.cost = 10000;
		v.color = "pink";
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van color is "+v.color);
		v.move();
		System.out.println("--------------------------------------");
		Van v1 = new Van();
		v1.cost = 20000;
		v1.color = "ornage";
		System.out.println("Van cost is "+v1.cost);
		System.out.println("Van color is "+v1.color);
		v1.move();
	}	
		
		
	}
