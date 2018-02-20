package com.pawelkassyk.calculator;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Presenter presenter = new Presenter();

    @Test
    public void test1() throws Exception {
        // Given
        String currentDisplay = "6";
        String clicked = "5";
        // When
        String result = presenter.getScreenToDisplay(clicked, currentDisplay);
        // Then
        Assert.assertEquals("65", result);
    }

    @Test
    public void test2() throws Exception {
        // Given
        String currentDisplay = "0";
        String clicked = "5";
        // When
        String result = presenter.getScreenToDisplay(clicked, currentDisplay);
        // Then
        Assert.assertEquals("5", result);
    }

    @Test
    public void test3() throws Exception {
        // Given
        String currentDisplay = "5+5";
        String clicked = "=";
        // When
        String result = presenter.getScreenToDisplay(clicked, currentDisplay);
        // Then
        Assert.assertEquals("10.0", result);
    }
}