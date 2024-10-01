all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/aula*.java
	javac -d bin libs/*
	javac -d bin Trabalhos/Bim2R2.java

run:
	@java -cp bin Main


clear:
	rm bin/*

git:
	git config --global user.email jhoeerickifpr@gmail.com
	git config --global user.name JhoeErick