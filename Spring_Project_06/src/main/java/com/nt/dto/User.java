package com.nt.dto;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.nt.validators.ValidAge;

@Validated
public class User {
	@Valid
	@NotEmpty(message = "Name is required")
	@Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	private String name;
	@Valid
	@NotEmpty(message = "Password is required")
	@Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
	private String password;
	@Valid
	@NotNull(message = "Gender is required")
	private String gender;
	@Valid
	private String[] hobbies;
	@Valid
	@NotEmpty(message = "Address is required")
	private String address;
	@Valid
	@NotEmpty(message = "Country is required")
	private String country;
	@Valid
	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
	private String phoneNumber;
//	@Valid
//	@NotNull(message = "Age is required")
//	@Min(value = 18, message = "Age must be at least 18")
//	@Max(value = 100, message = "Age must be at most 100")
	@ValidAge
	private Integer age;

	// Getters and setters for all fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
