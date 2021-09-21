package com.example.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayhelloFromGet() {
		return "Hello from GET method";
	}
	@GetMapping("/{name}")
	public String sayhelloFromGetByName(@PathVariable String name) {
		return "Hello "+name.toUpperCase()+" from GET method";
	}

	@PostMapping("/")
	public String sayhelloFromPost() {
		return "Hello from POST method";
	}


	@PutMapping("/")
	public String sayhelloFromPut() {
		return "Hello from PUT method";
	}

	@PatchMapping("/")
	public String sayhelloFromPatch() {
		return "Hello from PATCH method";
	}

	@DeleteMapping("/")
	public String sayhelloFromDelete() {
		return "Hello from DELETE method";
	}

}
