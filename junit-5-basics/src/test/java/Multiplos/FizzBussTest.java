package Multiplos;

import Multiplos.FizzBuss;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class FizzBussTest {

    /**TEST DRIVE DEVELOPER**/



    @BeforeAll
    public static void print(){
        FizzBuss game;
        game = new FizzBuss();
        List<String> numberList = game.getNumbe();
        System.out.println(numberList);
    }
    FizzBuss game;

    @BeforeEach
    public void before(){
        game = new FizzBuss();
    }


    //Retornar los numeros cuando no sea multiplo de 3 o 5
    @Test
    public void should_number(){

        List<String> numberList = game.getNumbe();
        assertEquals("1",numberList.get(0));
        assertEquals("2",numberList.get(1));
        assertEquals("4",numberList.get(3));
        assertEquals("7",numberList.get(6));
    }

    //Retornar fizz when mult 3
    @Test
    public void should_Fizz(){

        List<String> numberList = game.getNumbe();
        assertEquals("Fizz",numberList.get(2));
    }

    //Retornar Buss when mult 5
    @Test
    public void should_Buss(){

        List<String> numberList = game.getNumbe();
        assertEquals("Buss",numberList.get(4));
    }

    //Retornar Fizz&Buss when mult 5 and 3
    @Test
    public void should_FizzandBuss(){
        List<String> numberList = game.getNumbe();
        assertEquals("Fizz&Buss",numberList.get(14));
    }

}