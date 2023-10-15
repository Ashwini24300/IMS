package com.app.DTO;

import java.time.LocalDateTime;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
// Generic response from the server.
public class ApiResponse {

	// message to return to client.
	private String message;
	
	// timestamp of the action.
	private LocalDateTime timestamp;

	public ApiResponse(String message) {
		
		this.message = message;
		this.timestamp = LocalDateTime.now();

	}
}


