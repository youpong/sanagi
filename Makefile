.PHONY: run clean


run: Hello.class
	java Hello
clean:
	- rm *.class
Hello.class: Hello.java
	javac Hello.java

