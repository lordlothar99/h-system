Feature: Execute a simple instruction locally 

	@done 
	Scenario: Prints something in the console when user asks so 
		When I say "Print \"Hello world !\" in the console" 
		Then "Hello world !" is printed in the console