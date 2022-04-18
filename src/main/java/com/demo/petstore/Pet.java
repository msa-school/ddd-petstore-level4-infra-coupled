package com.demo.petstore;

public abstract class Pet {
    int appearance;
    int energy;
	int id;

    public abstract String speak();


	public void eat(){
		energy = energy + 1;
	}

	public void sleep(){
		energy = energy + 1;
	}

	public void save(){

		/////// infra code

		System.out.println("ORACLE: insert into pet(id, appearance, energy) values (" + id + ", " + appearance + ", " + energy+")");

		//// if you have to change infra from Oracle to Mysql, you have to change the implementation code from domain classes
		// System.out.println("MYSQL: INSERT INTO PET_TABLE(ID, APPEARANCE, ENERGY) VALUES (" + pet.getId() + ", " + pet.getAppearance() + ", " + pet.getEnergy()+")");

	}

}
