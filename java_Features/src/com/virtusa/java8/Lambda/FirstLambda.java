package com.virtusa.java8.Lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstLambda {
	public static void main(String[] args) {
		// Anonymous class
		FileFilter fleFilter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".TMP");
			}
		};

		FileFilter fileFilter = (File file) -> file.getName().endsWith(".TMP");

		File dir = new File("C:\\Users\\VIJAYA~1\\AppData\\Local\\Temp");
		File[] list = dir.listFiles();
		
		for (File str : list) {
			if(fleFilter.accept(str))
			System.out.println(str.getName());
		}
		
		
		Runnable runnable = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello Working!!!");
			}
		};

		Thread t = new Thread(runnable);
		t.start();
		/*
		 * Comparator<String> comparator=new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * } };
		 */

		Comparator comparator = (Object o1, Object o2) -> {
			return o1.toString().compareTo(o2.toString());
		};
		List<String> list1 = new ArrayList<String>();
		list1.add("vijji");
		list1.add("bala");
		list1.add("supriya");
		Collections.sort(list1, comparator);

		for (String s : list1) {
			System.out.println(s.toString());
		}
	

		
		  Test test = () -> System.out.println("Hello!!!!!!!!!!!!!!!!!!!!");
		  test.test();
		 

	}

}
