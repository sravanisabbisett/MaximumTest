package com.testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import maximum.Maximum;

import java.util.Optional;

public class MaximumTest {
    Maximum maximum;

    @Test
    public void givenMaximumInteger_AsAFirstParameter_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.checkMaximum(5,4,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsSecondParameter_ShouldReturnMaximumInteger(){
        Integer maximumResult=maximum.checkMaximum(4,5,3);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumInteger_AsThirdParameter_ShouldReturnMaximumInteger() {
        Integer maximumResult=maximum.checkMaximum(3,4,5);
        Integer expectedResult=5;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsFirstParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.checkMaximum(8.8f,7.7f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsSecondParameter_ShouldReturnMaximumFloat() {
        Float maximumResult=maximum.checkMaximum(7.7f,8.8f,6.6f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumFloat_AsThirdParameter_ShouldReturnMaximumFloat(){
        Float maximumResult=maximum.checkMaximum(6.6f,7.7f,8.8f);
        Float expectedResult=8.8f;
        Assert.assertEquals(expectedResult,maximumResult);
    }
    @Test
    public void givenMaximumString_AsFirstParameter_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("peach","orange","apple");
        Assert.assertEquals("peach",maximumResult);
    }
    @Test
    public void givenMaximumString_AsSecondParameter_ShouldReturnMaximumString() {
        String maximumResult=maximum.checkMaximum("orange","peach","apple");
        Assert.assertEquals("peach",maximumResult);
    }

    @Test
    public void givenMaximumString_AsThirdParameter_ShouldReturnMaximumString() {
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



}
