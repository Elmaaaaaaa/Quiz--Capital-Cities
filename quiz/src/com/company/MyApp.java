package com.company;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("CHECK YOUR KNOWLEDGE- CAPITAL CITIES\n\n");
	String firstQuestion = "What is the capital city of Spain?\n " +
            "(a) Barcelona\n (b) Córdoba\n (c) Madrid ";
        String secondQuestion = "What is the capital city of Albania?\n " +
                "(a) Tirana\n (b) Finiq\n (c) Klos";
        String thirdQuestion = "What is the capital city of Island?\n " +
                "(a) Akranes\n (b) Akureyri\n (c) Reykjavik ";
        String fourthQuestion = "What is the capital city of Switzerland?\n " +
                "(a) Zürich\n (b) Bern\n (c) Basel ";
        String fifthQuestion = "What is the capital city of Malta?\n " +
                "(a) Valletta\n (b) Il-Birgu \n (c) Ir-Rabat ";
        //create an array with question elements(objects)
        Questions[] questions = {new Questions(firstQuestion, "c"),
        new Questions(secondQuestion, "a"), new Questions(thirdQuestion, "c"),
        new Questions(fourthQuestion, "b"), new Questions(fifthQuestion, "a")};
	    //call the method
        takeTest(questions);

    }
	//create a method takeTest
    public static void takeTest(Questions[] questions){
        int score = 0;
	    //loop through questions
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
		//let the user enter his answer userAnswer
            Scanner input = new Scanner(System.in);
            String userAnswer = input.nextLine();
		//check if answer is true and if it is, increase variable score
            if(userAnswer.equals(questions[i].answer)){
                score++;
            }


        }
        System.out.println("Your score is: " + score + "/" + questions.length);

    }
}
