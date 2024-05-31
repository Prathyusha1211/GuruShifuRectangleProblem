package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Area of Rectangle")
public class RectangleTest {

    Rectangle obj = new Rectangle();

    @Nested
    @DisplayName("When Length are Breadth are Integers")
    class InputsAreIntegers{
        @Test
        @DisplayName("Actual and Expected Area of Rectangle Matches")
        public void shouldReturnAreaOfRectangleWhenLengthAndBreadthAreGivenCurrect(){
            int ExpectedArea = 12;
            int ActualArea = obj.getAreaOfRectangle(3,4);
            assertThat(ActualArea,is(ExpectedArea));
        }

        @Test
        @DisplayName("Actual and Expected Area of Rectangle doesn't Matches")
        public void shouldReturnWrongOutputWhenLengthAndBreadthAreGivenWrong(){
            int ExpectedArea = 14;
            int ActualArea = obj.getAreaOfRectangle(3,5);
            assertThat(ActualArea,is(not(ExpectedArea)));
        }

        @Test()
        @DisplayName("Throws error when any input parameter is negative")
        public void shouldReturnExceptionWhenLengthOrBreadthGivenNegative(){
            assertThrows(IllegalArgumentException.class,()->obj.getAreaOfRectangle(-3,9));
        }

    }
    
}