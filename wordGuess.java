/*
 *Nicholas Vourlas
 *December 2, 2020
 * ICS4U-01
 * Mr. Hofstatter
 * Word Guess Assignment
 * A small game with variable difficulty in which the user tries to guess words from a series of blanks.
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class wordGuess {

    public static void main(String[] args) {

        //Creating and initializing variables and arrays.
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        Boolean gameWin = false;
        Boolean gameLoss = false;

        String chosenDifficulty = ("");
        int numberOfGuessesMade = 0;

        String[] easyWords = {"hello", "word", "guess", "assignment", "brain"};
        boolean helloH = false;
        boolean helloE = false;
        boolean helloL= false;
        boolean helloO = false;

        boolean wordW = false;
        boolean wordO = false;
        boolean wordR = false;
        boolean wordD = false;

        boolean guessG = false;
        boolean guessU = false;
        boolean guessE = false;
        boolean guessS = false;

        boolean assignmentA = false;
        boolean assignmentS = false;
        boolean assignmentI = false;
        boolean assignmentG = false;
        boolean assignmentN = false;
        boolean assignmentM = false;
        boolean assignmentE = false;
        boolean assignmentT = false;

        boolean brainB = false;
        boolean brainR = false;
        boolean brainA = false;
        boolean brainI = false;
        boolean brainN = false;

        int randomIndex = generator.nextInt(easyWords.length);

        String selectedWord = "";
        String letterToGuess = "";

        //Printing welcome message prompting desired difficulty.
        System.out.println("Hello and welcome to the word guess! Would you like to play on easy or hard?");
        System.out.println("(Input 'a' for easy (unlimited guesses) or 'b' for hard (ten guesses)): ");

        while (!chosenDifficulty.equalsIgnoreCase("a") && !chosenDifficulty.equalsIgnoreCase("b")) {

            System.out.print("Your choice: ");
            chosenDifficulty = scan.nextLine();

            //Randomly choosing which word the user will be guessing from the list of their chosen difficulty.
            if (!chosenDifficulty.equalsIgnoreCase("a") && !chosenDifficulty.equalsIgnoreCase("b")) {
                System.out.println("");
                System.out.println("Not a valid option. Input 'a' for easy (unlimited guesses) or 'b' for hard (ten guesses).");
            }
            if (chosenDifficulty.equalsIgnoreCase("a")) {
                System.out.println("");
                System.out.println("You will be playing on easy, you have unlimited guesses.");
                System.out.println("");
                selectedWord = easyWords[randomIndex];
            } else if (chosenDifficulty.equalsIgnoreCase("b")) {
                System.out.println("");
                System.out.println("You will be playing on hard, you have ten guesses.");
                System.out.println("");
                selectedWord = easyWords[randomIndex];
            }
        }


            //Displaying words/blanks and letters.
        while (gameWin == false && gameLoss == false) {

                    if (selectedWord.equals("hello")) {
                        if (helloH == false) {
                            System.out.print("_");
                        } else if (helloH == true) {
                            System.out.print("H");
                        }
                        if (helloE == false) {
                            System.out.print("_");
                        } else if (helloE == true) {
                            System.out.print("E");
                        }
                        if (helloL == false) {
                            System.out.print("__");
                        } else if (helloL == true) {
                            System.out.print("LL");
                        }
                        if (helloO == false) {
                            System.out.println("_");
                        } else if (helloO == true) {
                            System.out.println("O");
                        }

                        System.out.print("Enter a letter (! To guess the entire word): ");
                        letterToGuess = scan.nextLine();
                        numberOfGuessesMade += 1;

                        if (chosenDifficulty.equalsIgnoreCase("b") && numberOfGuessesMade == 10) {
                            gameLoss = true;
                        }

                        if (letterToGuess.equalsIgnoreCase("h")) {
                            helloH = true;
                        } else if (letterToGuess.equalsIgnoreCase("e")) {
                            helloE = true;
                        } else if (letterToGuess.equalsIgnoreCase("l")) {
                            helloL = true;
                        } else if (letterToGuess.equalsIgnoreCase("o")) {
                            helloO = true;
                        } else if (letterToGuess.equals("!")) {
                            System.out.print("What is your guess?: ");
                            letterToGuess = scan.nextLine();

                            if (letterToGuess.equalsIgnoreCase("hello")) {
                                gameWin = true;
                            } else if (!letterToGuess.equalsIgnoreCase("hello")) {
                                gameLoss = true;
                            }
                        }

                        if (helloH == true && helloE == true && helloL == true && helloO == true) {
                            gameWin = true;
                        }
                    }
                    else if (selectedWord.equals("word")){
                        if (wordW == false) {
                            System.out.print("_");
                        } else if (wordW == true) {
                            System.out.print("W");
                        }
                        if (wordO == false) {
                            System.out.print("_");
                        } else if (wordO == true) {
                            System.out.print("O");
                        }
                        if (wordR == false) {
                            System.out.print("_");
                        } else if (wordR == true) {
                            System.out.print("R");
                        }
                        if (wordD == false) {
                            System.out.println("_");
                        } else if (wordD == true) {
                            System.out.println("D");
                        }

                        System.out.print("Enter a letter (! To guess the entire word): ");
                        letterToGuess = scan.nextLine();
                        numberOfGuessesMade += 1;

                        if (chosenDifficulty.equalsIgnoreCase("b") && numberOfGuessesMade == 10) {
                            gameLoss = true;
                        }

                        if (letterToGuess.equalsIgnoreCase("w")) {
                            wordW = true;
                        } else if (letterToGuess.equalsIgnoreCase("o")) {
                            wordO = true;
                        } else if (letterToGuess.equalsIgnoreCase("r")) {
                            wordR = true;
                        } else if (letterToGuess.equalsIgnoreCase("d")) {
                            wordD = true;
                        } else if (letterToGuess.equals("!")) {
                            System.out.print("What is your guess?: ");
                            letterToGuess = scan.nextLine();

                            if (letterToGuess.equalsIgnoreCase("word")) {
                                gameWin = true;
                            } else if (!letterToGuess.equalsIgnoreCase("word")) {
                                gameLoss = true;
                            }
                        }

                        if (wordW == true && wordO == true && wordR == true && wordD == true) {
                            gameWin = true;
                        }
                     }
                    else if (selectedWord.equals("guess")){
                        if (guessG == false) {
                            System.out.print("_");
                        } else if (guessG == true) {
                            System.out.print("G");
                        }
                        if (guessU == false) {
                            System.out.print("_");
                        } else if (guessU == true) {
                            System.out.print("U");
                        }
                        if (guessE == false) {
                            System.out.print("_");
                        } else if (guessE == true) {
                            System.out.print("E");
                        }
                        if (guessS == false) {
                            System.out.println("__");
                        } else if (guessS == true) {
                            System.out.println("SS");
                        }

                        System.out.print("Enter a letter (! To guess the entire word): ");
                        letterToGuess = scan.nextLine();
                        numberOfGuessesMade += 1;

                        if (chosenDifficulty.equalsIgnoreCase("b") && numberOfGuessesMade == 10) {
                            gameLoss = true;
                        }

                        if (letterToGuess.equalsIgnoreCase("g")) {
                            guessG = true;
                        } else if (letterToGuess.equalsIgnoreCase("u")) {
                            guessU = true;
                        } else if (letterToGuess.equalsIgnoreCase("e")) {
                            guessE = true;
                        } else if (letterToGuess.equalsIgnoreCase("s")) {
                            guessS = true;
                        } else if (letterToGuess.equals("!")) {
                            System.out.print("What is your guess?: ");
                            letterToGuess = scan.nextLine();

                            if (letterToGuess.equalsIgnoreCase("guess")) {
                                gameWin = true;
                            } else if (!letterToGuess.equalsIgnoreCase("guess")) {
                                gameLoss = true;
                            }
                        }

                        if (guessG == true && guessU == true && guessE == true && guessS == true) {
                            gameWin = true;
                        }
                    }
                    else if (selectedWord.equals("assignment")){
                        if (assignmentA == false) {
                            System.out.print("_");
                        } else if (assignmentA == true) {
                            System.out.print("A");
                        }
                        if (assignmentS == false) {
                            System.out.print("__");
                        } else if (assignmentS == true) {
                            System.out.print("SS");
                        }
                        if (assignmentI == false) {
                            System.out.print("_");
                        } else if (assignmentI == true) {
                            System.out.print("I");
                        }
                        if (assignmentG == false) {
                            System.out.print("_");
                        } else if (assignmentG == true) {
                            System.out.print("G");
                        }
                        if (assignmentN == false) {
                            System.out.print("_");
                        } else if (assignmentN == true) {
                            System.out.print("N");
                        }
                        if (assignmentM == false) {
                            System.out.print("__");
                        } else if (assignmentM == true) {
                            System.out.print("M");
                        }
                        if (assignmentE == false) {
                            System.out.print("_");
                        } else if (assignmentE == true) {
                            System.out.print("E");
                        }
                        if (assignmentN == false) {
                            System.out.print("_");
                        } else if (assignmentN == true) {
                            System.out.print("N");
                        }
                        if (assignmentT == false) {
                            System.out.println("_");
                        } else if (assignmentT == true) {
                            System.out.println("T");
                        }

                        System.out.print("Enter a letter (! To guess the entire word): ");
                        letterToGuess = scan.nextLine();
                        numberOfGuessesMade += 1;

                        if (chosenDifficulty.equalsIgnoreCase("b") && numberOfGuessesMade == 10) {
                            gameLoss = true;
                        }

                        if (letterToGuess.equalsIgnoreCase("a")) {
                            assignmentA = true;
                        } else if (letterToGuess.equalsIgnoreCase("s")) {
                            assignmentS = true;
                        } else if (letterToGuess.equalsIgnoreCase("i")) {
                            assignmentI = true;
                        } else if (letterToGuess.equalsIgnoreCase("g")) {
                            assignmentG = true;
                        } else if (letterToGuess.equalsIgnoreCase("n")) {
                            assignmentN = true;
                        } else if (letterToGuess.equalsIgnoreCase("m")) {
                            assignmentM = true;
                        } else if (letterToGuess.equalsIgnoreCase("e")) {
                            assignmentE = true;
                        } else if (letterToGuess.equalsIgnoreCase("t")) {
                            assignmentT = true;
                        } else if (letterToGuess.equals("!")) {
                            System.out.print("What is your guess?: ");
                            letterToGuess = scan.nextLine();

                            if (letterToGuess.equalsIgnoreCase("assignment")) {
                                gameWin = true;
                            } else if (!letterToGuess.equalsIgnoreCase("assignment")) {
                                gameLoss = true;
                            }
                        }

                        if (assignmentA == true && assignmentS == true && assignmentI == true && assignmentG == true &&
                                assignmentN == true && assignmentM == true && assignmentE == true && assignmentT == true) {
                            gameWin = true;
                        }
                    }
                    else if (selectedWord.equals("brain")){
                        if (brainB == false) {
                            System.out.print("_");
                        } else if (brainB == true) {
                            System.out.print("B");
                        }
                        if (brainR == false) {
                            System.out.print("_");
                        } else if (brainR == true) {
                            System.out.print("R");
                        }
                        if (brainA == false) {
                            System.out.print("_");
                        } else if (brainA == true) {
                            System.out.print("A");
                        }
                        if (brainI == false) {
                            System.out.print("_");
                        } else if (brainI == true) {
                            System.out.print("I");
                        }
                        if (brainN == false) {
                            System.out.println("_");
                        } else if (brainN == true) {
                            System.out.println("N");
                        }

                        System.out.print("Enter a letter (! To guess the entire word): ");
                        letterToGuess = scan.nextLine();
                        numberOfGuessesMade += 1;

                        if (chosenDifficulty.equalsIgnoreCase("b") && numberOfGuessesMade == 10) {
                            gameLoss = true;
                        }

                        if (letterToGuess.equalsIgnoreCase("b")) {
                            brainB = true;
                        } else if (letterToGuess.equalsIgnoreCase("r")) {
                            brainR = true;
                        } else if (letterToGuess.equalsIgnoreCase("a")) {
                            brainA = true;
                        } else if (letterToGuess.equalsIgnoreCase("i")) {
                            brainI = true;
                        } else if (letterToGuess.equalsIgnoreCase("n")) {
                            brainN = true;
                        } else if (letterToGuess.equals("!")) {
                            System.out.print("What is your guess?: ");
                            letterToGuess = scan.nextLine();

                            if (letterToGuess.equalsIgnoreCase("brain")) {
                                gameWin = true;
                            } else if (!letterToGuess.equalsIgnoreCase("brain")) {
                                gameLoss = true;
                            }
                        }

                        if (brainB == true && brainR == true && brainA == true && brainI == true && brainN == true) {
                            gameWin = true;
                        }
                    }
                     }




        if (gameWin == true) {
            System.out.println("");
            System.out.println("You won! The secret word is " + selectedWord + ". Number of guesses you made: " + numberOfGuessesMade);
        } else if (gameLoss == true) {
            System.out.println("");
            System.out.println("You lost. The secret word was " + selectedWord + ". Number of guesses you made: " + numberOfGuessesMade);
        }

        }
    }
