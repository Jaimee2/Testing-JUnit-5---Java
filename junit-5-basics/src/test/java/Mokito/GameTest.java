package Mokito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GameTest {

    public static final int OPTION_PAPER = 0;
    public static final int OPTION_sCISSORS = 1;
    public static final int OPTION_ROCK = 2;
    @InjectMocks
    public Game game;

    @Mock
    Scanner scanner;

    @Mock
    Random random;

    @Test
    public void when_them(){

        //Escribimos en la terminal.
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");

        //Capturamos todo lo que sale por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();
    }

    @Test
    public void when_writeQuit_then_exitGame(){

        //Escribimos en la terminal.
        when(scanner.nextLine()).thenReturn("Quit");

        //Capturamos todo lo que sale por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();

        String outPut = out.toString();
        assertTrue(outPut.contains("Let's play Rock, Paper"));

    }

    //Comprobamos que Rock beats Scissors
    @Test
    public void when_chooseRock_beatScissors(){

        //Escribimos en la terminal. ("Quit") para no entrar en un bucle infinito.
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        //Escogemos Scissors
        when(random.nextInt(3)).thenReturn(OPTION_ROCK);

        //Capturamos todo lo que sale por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();

        String outPut = out.toString();

        assertTrue(outPut.contains("Let's play Rock, Paper"));
        assertTrue(outPut.contains("Computer chose scissors"));
        assertTrue(outPut.contains("you win!"));

    }

    //Comprobamos que Paper beat Rock
    @Test
    public void when_choosePaper_beatRock(){

        //Escribimos en la terminal. ("Quit") para no entrar en un bucle infinito.
         when(scanner.nextLine()).thenReturn("Paper").thenReturn("Quit");
        //Escogemos Scissors
        when(random.nextInt(3)).thenReturn(OPTION_PAPER);

        //Capturamos todo lo que sale por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();

        String outPut = out.toString();

        assertTrue(outPut.contains("Let's play Rock, Paper"));
        assertTrue(outPut.contains("Computer chose rock"));
        assertTrue(outPut.contains("you win!"));

    }

    //Comprobamos que Scissors beat paper
    @Test
    public void when_chooseScissors_beatpaper(){

        //Escribimos en la terminal. ("Quit") para no entrar en un bucle infinito.
        when(scanner.nextLine()).thenReturn("Scissors").thenReturn("Quit");
        //Escogemos Scissors
        when(random.nextInt(3)).thenReturn(OPTION_sCISSORS);

        //Capturamos todo lo que sale por consola
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        game.play();

        String outPut = out.toString();

        assertTrue(outPut.contains("Let's play Rock, Paper"));
        assertTrue(outPut.contains("Computer chose paper"));
        assertTrue(outPut.contains("you win!"));

    }
}