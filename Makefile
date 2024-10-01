all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/aula*.java
	javac -d bin libs/*

run:
	@java -cp bin Main


clear:
	rm bin/*

git:
	git config --global user.email jhoeerickifpr@gmail.com
	git config --global user.name JhoeErick