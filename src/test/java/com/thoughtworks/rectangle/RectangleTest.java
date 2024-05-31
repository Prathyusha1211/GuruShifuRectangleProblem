package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaOfRectangle(){
        Rectangle rectangleObj = new Rectangle();
        int ActualArea = rectangleObj.getAreaOfRectangle(3,4);
        int ExpectedArea = 12;
        assertThat("When Length and Breadth are given currect", ExpectedArea,is(ActualArea));
    }
}
