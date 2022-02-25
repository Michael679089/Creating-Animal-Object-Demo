package com.ciit.overload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);	

		System.out.println("Input name: ");
		String name = reader.readLine();
		
		System.out.println("Input life span: ");
		float lifeSpan = Float.parseFloat(reader.readLine());
		
		System.out.println("Input size: ");
		float size = Float.parseFloat(reader.readLine());
		
		System.out.println("Input weight: ");
		float weight = Float.parseFloat(reader.readLine());
		
		System.out.println("Input if the reptile has backbone: ");
		boolean hasBackbone = Boolean.parseBoolean(reader.readLine());
		
		Reptile newReptile = new Reptile(name, lifeSpan, size, weight, hasBackbone);
		newReptile.displayInfo();
	}

}
