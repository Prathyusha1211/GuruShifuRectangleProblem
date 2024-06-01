package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for Area of Rectangle")
public class RectangleTest {

        @Test
        @DisplayName("Actual and Expected Area of Rectangle Matches")
        public void shouldReturnAreaOf12WhenLengthIs3AndBreadthIs4(){
            Rectangle obj = new Rectangle(3,4); 
            double ActualArea = obj.area();
            assertThat(ActualArea,is(closeTo(12,0.0001))); 
        }


        @Test
        @DisplayName("Actual and Expected Area of Rectangle Matches When inputs are double type")
        public void shouldReturnAreaOf14WhenLengthIs3point5AndBreadthIs4point0(){
            Rectangle obj = new Rectangle(3.5,4.0);
            double ActualArea = obj.area();
            assertThat(ActualArea,is(closeTo(14,0.001)));
        }

        @Test
        @DisplayName("Actual and Expected Area of Rectangle Matches When inputs are double type")
        public void shouldReturnAreaOf19point11WhenLengthIs3point9AndBreadthIs4point9(){
            Rectangle obj = new Rectangle(3.9,4.9);
            double ActualArea = obj.area();
            assertThat(ActualArea,is(closeTo(19.11,0.001)));
        } 

        @Test
        @DisplayName("Actual and Expected Area of Rectangle Matches")
        public void shouldReturnPerimeterOf14WhenLengthIs3AndBreadthIs4(){
            Rectangle obj = new Rectangle(3,4); 
            double ActualPerimeter = obj.perimeter();
            assertThat(ActualPerimeter,is(closeTo(14,0.0001))); 
        }


}