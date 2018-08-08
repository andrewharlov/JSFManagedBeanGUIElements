package com.harlov.jsf.loginPage;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	private String email;
	private String password;
	private String married;
	private String gender; 
	private List<String> beverageOptions;
	private List<String> selectedBeverages;
	private List<String> animalsOptions;
	private List<String> selectedAnimals;
	
	public User() {
		beverageOptions = new ArrayList<>();
		beverageOptions.add("Tea");
		beverageOptions.add("Coffee");
		beverageOptions.add("Beer");
		beverageOptions.add("Milkshake");
		
		animalsOptions = new ArrayList<>();
		animalsOptions.add("Puppy");
		animalsOptions.add("Kitty Cat");
		animalsOptions.add("Hamster");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public List<String> getBeverageOptions() {
		return beverageOptions;
	}

	public List<String> getSelectedBeverages() {
		return selectedBeverages;
	}

	public void setSelectedBeverages(List<String> selectedBeverages) {
		this.selectedBeverages = selectedBeverages;
	}

	public List<String> getAnimalsOptions() {
		return animalsOptions;
	}

	public List<String> getSelectedAnimals() {
		return selectedAnimals;
	}

	public void setSelectedAnimals(List<String> selectedAnimals) {
		this.selectedAnimals = selectedAnimals;
	}
	
}
