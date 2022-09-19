# Week 2 Review Guide

## HTML
1.	What is HTML?
2.	What is the HTML5 doctype declaration?
3.	List some tags. What is <head> used for? <body>?
4.	What are the required tags for an HTML document?
5.	What is the tag for ordered list? unordered list? Change bullet styling?
6.	What features came with HTML5? Are HTML 5 tags different from other tags?
7.	Do all tags come in a pair? List a self-closing tag.
8.	What’s the difference between an element and an attribute? List some global attributes.
9.	What is the syntax for a comment in HTML?
10.	What tags would you use to create a table? A navbar? What about a form?
11.	What’s the difference between a class and id?
12.	How would you include CSS into an HTML document? What about JS?
13.	What is a semantic tag? What about formatting tags/elements?
14.	What’s the difference between a block and an inline element?

## CSS
1.	What is CSS? what are the different ways of styling an html file?
2.	Which way has highest priority when styles cascade: inline, internal, and external stylesheets. Which is best practice? Why?
3.	What are the different CSS selectors? Write the syntax for each.
4.	Write a CSS selector for styling all spans inside of a div. What about only targeting spans that are direct descendents of divs?
5.	Can I select multiple elements at once with CSS? If so, what is the syntax?
6.	Explain the concept of specificity and how it relates to styling conflicts
7.	Explain the CSS box model
8.	What is Bootstrap? What are some bootstrap classes you can use?


## JavaScript
1.	What is JavaScript? What do we use it for?
2.	Can we run JavaScript in a web browser, on a server, or both?
3.	What programming paradigm(s) does JS support?
4.	What are the data types in JS?
	1.	What is the type of NaN? What is the isNaN function?
	2.	What is the data type of a function?
	3.	What about an array?
5.	What is the difference between undefined and null?
6.	What are JS objects? what is the syntax?
7.	What is JSON? Is it different from JS objects?
8.	What are some ways you can use functions in JS?
9.	What are the different scopes of variables in JS?
	1.	What are the different ways to declare global variables?
10.	What is function and variable hoisting?
11.	Explain how the guard and default operators work
12.	What are callback functions? What about self-invoking functions?
13.	Use the object literal syntax to create an object with some properties
14.	What is a truthy or falsy value? List the falsy values.
15.	What is the difference between == and ===? Which one allows for type coercion?
16.	Explain the template literal syntax
17.	What is a Promise?
18.	What are arrays in JS? can you change their size?
19.	List some array methods and explain how they work
20.	Explain what “strict mode” does
21.	What will happen when I try to run this code: console.log(0.1+0.2==0.3) ?

## ES6+
1.	What new features did ES6 introduce?
2.	What is the difference between var, let, and const keywords?
3.	Give the syntax for template literals / string interpolation
4.	What’s the difference between a normal function declaration and an arrow function?
5.	What is the difference between for-of and for-in loops?
6.	Explain the async/await keywords

## Events and DOM
1.	What is the DOM? How is it represented as a data structure? What object in a browser environment allows us to interact with the DOM?
2.	List some ways of querying the DOM for elements
3.	How would you insert a new element into the DOM?
4.	What are event listeners? What are some events we can listen for? What are some different ways of setting event listeners?
5.	What is bubbling and capturing and what is the difference?

## Fetch
1.	What is Fetch?

## HTTP
1.	What does HTTP stand for?
2.	What are the components inside of an HTTP request? What about an HTTP response?
3.	What are the important HTTP verbs / methods and what do they do?
	1.	Which are idempotent?
	2.	Which are safe?
4.	List the levels of HTTP status codes and what they mean
5.	What are some specific HTTP status codes that are commonly used?

## Servlets
1.	What is a servlet? What about a servlet container? Which servlet container have you worked with?
2.	Describe the servlet class inheritance hierarchy. What methods are declared in each class or interface?
3.	How would you create your own servlet?
4.	What is the deployment descriptor? What file configures your servlet container?
5.	Explain the lifecycle of a servlet - what methods are called and when are they called?
6.	Is eager or lazy loading of servlets the default? How would you change this?
7.	What are some tags you would find in the web.xml file?
8.	What is the difference between the ServletConfig and ServletContext objects? How do you retrieve these in your servlet?
9.	What is the purpose of the RequestDispatcher?
10.	Explain the difference between RequestDispatcher.forward() and HttpServletResponse.sendRedirect()
11.	What are some different ways of tracking a session with servlets?
12.	What is object mapping? Any Java libraries for this?
13.	How would you send text or objects back in the body of the HTTP response from a servlet?
14.	What is the difference between getParameter() and getAttribute() methods?

## Hibernate
1.	What is Hibernate? What is JPA?
2.	What is the benefit of using Hibernate over JDBC?
3.	Tell me about some of the JPA annotations you have worked with? What do they do? How do you specify multiplicity relationships with JPA annotations?
4.	What are the interfaces of Hibernate?
5.	Tell me how you set up hibernate? What files are you editing, what goes in them, etc.
6.	What ways are available to you to map an object to database entities in Hibernate?
7.	In the session interface, what is the difference between save and persist methods? get and load methods? Update vs merge methods?
8.	What are the different session methods?
9.	What is the difference between Eager and Lazy fetching and how to setup either?
10.	Under what circumstances would your program throw a LazyInitializationException?
11.	What are the 4 ways to make a query using Hibernate?
12.	What is HQL? What makes it different from SQL?
13.	What is the Criteria API? Can you perform all DDL and DML commands with it? How do Restrictions and Projections work within this API?
14.	What is caching? What is the difference between L1 and L2 cache?
15.	How do you enable second level caching?
16.	Can you write native SQL with Hibernate? Is this a good idea?
17.	What are the configuration options for Hibernate?
	1.	How to specify the SQL dialect?
	2.	What data must be specified for the SessionFactory?
	3.	What is hbm2ddl?
	4.	How would you configure Hibernate to print to the console all SQL statements run?
18.	What are the different object states in Hibernate? What methods move objects to different states?
19.	What is a proxy? When does the proxy resolve to the real object?
20.	What are the properties of a transaction? (ACID)

## AWS
1.	How would you describe AWS? What is “the cloud” or “cloud computing” and why is it so popular now?
2.	Define Infrastructure, Platform, and Software as a Service
3.	What’s the difference between a Region and an Availability Zone (AZ)?
4.	How are you charged for using AWS services?
5.	Explain the following AWS services:
	1.	EC2
	2.	EBS
	3.	RDS
	4.	AMI
6.	What steps would you take to create an EC2 and connect to it via your shell?
7.	What configuration options are available for an EC2?
8.	What are Security Groups? When defining a rule for a security group, what 3 things do you need to specify?
9.	What’s the difference between scalability, elasticity, and resiliency? What is autoscaling?

## Docker
1.	What is containerization?
2.	How are containers different from virtual machines?
3.	What is a Docker image? container?
4.	List the steps to create a Docker image and spin up a container
5.	What is the relevance of the Dockerfile to this process? List some keywords in the Dockerfile
6.	What are some other Docker commands?
7.	What is a container registry? How would you retrieve and upload images to DockerHub?





