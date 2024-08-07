package com.tenco.bank.dto;

import com.tenco.bank.repository.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SignInDTO {
	
	private String username; 
	private String password; 
	
	public User toUser() {
		return User.builder()
				.username(this.username)
				.password(this.password)
				.build();
	} 	
	// todo - 추후 사진 업로드 기능 추가 예정 	
}
