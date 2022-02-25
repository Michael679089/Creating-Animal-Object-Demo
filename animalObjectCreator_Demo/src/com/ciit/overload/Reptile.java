package com.ciit.overload;

public class Reptile extends Animal{
	
	public Reptile() {
		name = "Reptile";
		lifeSpanInYears = 0;
		sizeInCM = 0;
		weightInGrams = 0;
		hasBackbone = false;
	}
	
	public Reptile(String name, float lifeSpan, float size, float weight, boolean hasBackbone) {
		this.name = name;
		this.lifeSpanInYears = lifeSpan;
		this.sizeInCM = size;
		this.weightInGrams = weight;
		this.hasBackbone = hasBackbone;
	}
	
	//generic methods
	public void displayInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Life Span: " + this.lifeSpanInYears);
		System.out.println("Size in CM: " + this.sizeInCM);
		System.out.println("Weight in grams: " + this.weightInGrams);
		System.out.println("Has Backbone?: " + this.hasBackbone);
	}
	
	//getter
	public String getName () {
		return this.name;
	}
	
	public float getLifeSpan() {
		return this.lifeSpanInYears;
	}
	
	public float getSize() {
		return this.sizeInCM;
	}
	
	public float getWeight() {
		return this.weightInGrams;
	}

	public boolean getBackbone() {
		return this.hasBackbone;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLifeSpan(float years) {
		this.lifeSpanInYears = years;
	}
	
	public void setSize(float size) {
		this.sizeInCM = size;
	}
	
	public void setWeight(float weight) {
		this.weightInGrams = weight;
	}
	
	public void setBackbone(boolean hasBackbone) {
		this.hasBackbone = hasBackbone;
	}
	
}
