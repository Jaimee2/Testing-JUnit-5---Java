package Mokito;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GameTest {

    @InjectMocks
    public Game game;

    @Mock
    Scanner scanner;

    @Test
    public void when_them(){
        //Escribimos en la terminal.
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");

        game.play();
    }
}