package com.demo.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@NotBlank(message = "Ko để trống email")
	@Email(message = "Ko đúng định dạng email")
	String email;
	String fullname;
	@NotNull(message = "Ko de trong diem")
	@PositiveOrZero(message = "Diem phai lon hon hoac bang 0")
	@Max(value = 10, message ="Diem phai nho hon bang 10")
	Double mark;
	@NotNull(message = "KO de trong gioi tinh")
	Boolean gender;
	@NotBlank(message = "Chon noi song")
	String country;
}
