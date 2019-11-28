package com.ty.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK {

	public static void main(String[] args) {

		/*Comparator<Employee1> comp = (o1,o2) -> {

			if(o1.height > o2.height) {

				return 1;
			} else if(o1.height < o2.height) {

				return -1;

			}else {

				return 0;
			}
		};	*/


		Comparator<Employee1> comp1 = (o1,o2) -> {			//by using lambda expression, we no need to implements comparator(we can directly use it).

			if(o1.id > o2.id) {

				return 1;
			} else if(o1.id < o2.id) {

				return -1;

			}else {

				return 0;

			}
		};

			TreeSet<Employee1> ts = new TreeSet<>(comp1);

			Employee1 e1 = new Employee1(4, "niki", 5.6);
			Employee1 e2 = new Employee1(1, "basker", 5.2);
			Employee1 e3 = new Employee1(5, "suresh", 5.1);
			Employee1 e4 = new Employee1(2, "dinesh", 4.5);

			ts.add(e1);
			ts.add(e2);
			ts.add(e3);
			ts.add(e4);

			System.out.println("************Using iterator************");
			Iterator<Employee1> it = ts.iterator();
			while(it.hasNext()) {
				Employee1 e = it.next();
				System.out.println("Name is "+e.name);
				System.out.println("Id is "+e.id);
				System.out.println("Height is "+e.height);
				System.out.println("===================");
			}

		}
	}
