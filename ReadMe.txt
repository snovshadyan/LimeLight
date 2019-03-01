										LimeLight Automation Project
										
	- How to run the tests:
	1. This project has been developed with the help of InteliJ IDE. Tests can be run by right clikcing on testng.xml file ans selecting Run from within IDE.
	2. The project is a Maven project. It can also be run from command prompt in the project directory: "mvn clean install".
	Test will be executed on both Chrome and Firefox browsers.
	
	
	- Test cases covered:
	1. Verify Log image
	2. Verify banner image
	3. Verify header
	4. Verify NewJersy image
	5. Verify LosAngeles image
	6. Verify SanFrancisco image
	7. Verify NewJersy text
	8. Verify LosAngeles text
	9. Verify SanFrancisco text
	10. Verify "Register" button 
	11. Verify "Coming Soon" button
	12. Verify Event text
	13. Verify Date text
	14. Verify Location text
	15. Verify Address text
	16. Verify FirstName caption
	16. Verify FirstName input field
	17. Verify LastName caption
	18. Verify LastName input field
	19. Verify Email caption
	20. Verify Email input field
	21. Verify Integer caption
	22. Verify Integer input field
	23. Verify Option caption
	24. Verify Option1 radiobutton
	25. Verify Option2 radiobutton
	26. Verify Option3 radiobutton
	27.Verify "Pick One" caption
	28. Verify dropdown field
	29. Verify "Add comment" caption
	30. Verify comment field
	31. Verify register with blank fields generates error messages: "This field is required"
	32. Verify option check box selection
	33. Verify entering email in incorrect format generates "Please enter a valid email address" error message
	34. Verify register with the form correctly filled out generates the "Thank You!" message
	Note that page title test is not inplemented becasue the page does not have title.
	
	
	- Test Report
	After the test is ran, an HTML Extend report file "LimeLight_Extent.html" will be generated in test-output directory.
	Note: If the test is run frm Maven the html report file will be in target/surefire-reports directory
	
	- Test Log
	After running the test, test log file will be created in Logs directory.
	
	- Screenshots on fail
	Whenever a test fails, a screenshot will be taken and placed in Screenshots directory