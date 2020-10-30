package com.testing;

import org.junit.Assert;
import org.junit.Test;
import maximum.Maximum;


public class MaximumTest {
    Maximum maximum;

    @Test
    public void givenMaximumInteger_AsFirstPosition_ShouldReturnMaximumInteger() {
        Comparable maximumResult=maximum.checkMaximum(5,4,3);
        Assert.assertEquals(5,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsSecondPosition_ShouldReturnMaximumInteger(){
        Comparable maximumResult=maximum.checkMaximum(4,5,3);
        Assert.assertEquals(5,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsThirdPosition_ShouldReturnMaximumInteger() {
        Comparable maximumResult=maximum.checkMaximum(3,4,5);
        Assert.assertEquals(5,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsFirstPosition_ShouldReturnMaximumFloat() {
        Comparable maximumResult=maximum.checkMaximum(8.8f,7.7f,6.6f);
        Assert.assertEquals(8.8f,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsSecondPosition_ShouldReturnMaximumFloat() {
        Comparable maximumResult=maximum.checkMaximum(7.7f,8.8f,6.6f);
        Assert.assertEquals(8.8f,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsThirdPosition_ShouldReturnMaximumFloat(){
        Comparable maximumResult=maximum.checkMaximum(6.6f,7.7f,8.8f);
        Assert.assertEquals(8.8f,maximumResult);
    }
    @Test
    public void givenMaximumString_AsFirstPosition_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("peach","orange","apple");
        Assert.assertEquals("peach",maximumResult);
    }
    @Test
    public void givenMaximumString_AsSecondPosition_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("orange","peach","apple");
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenMaximumString_AsThirdPosition_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("apple","orange","peach");
        Assert.assertEquals("peach",maximumResult);
    }
    @Test
    public void givenMaximumInteger_ShouldReturnMaximumInteger() {
        Comparable maximumResult=new Maximum(8,7,6).maximum();
        Assert.assertEquals(8,maximumResult);
    }
    @Test
    public void givenMaximumFloat_UsingGenericClass_ShouldReturnMaximumFloat() {
        Comparable maximumResult= new Maximum(7.7,6.7,9.9).maximum();
        Assert.assertEquals(9.9,maximumResult);
    }
    @Test
    public void givenMaximumString_UsingGenericClass_ShouldReturnMaximumString(){
        Comparable maximumResult=new Maximum("peach","orange","apple").maximum();
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenNIntegers_UsingMoreThanThreeParameters_ShouldReturnMaximumInteger() {
       Integer maximumResult=maximum.moreThan_ThreeParameters(5,7,2,8,9,10);
       Integer expectedResult=10;
       Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNFloats_UsingMoreThanThreeParameters_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.moreThan_ThreeParameters(7.7f,4.4f,5.5f,9.9f);
        Float expectedResult=9.9f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenNStrings_UsingMoreThanThreeParameters_ShouldReturnMaximumString(){
        String maximumResult=maximum.moreThan_ThreeParameters("orange","peach","apple","strawberry");
        Assert.assertEquals("strawberry",maximumResult);
    }

}
