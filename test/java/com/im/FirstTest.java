package com.im;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    static First first;

    @BeforeAll
    static void creationFirstClassObject() {
        first = new First();
    }

    @Test
    void should_return_NewString_ifSubstringexist() {
        //given
        String mainString = "Aman Sharma Aman Sharma";
        String findstring = "Sharma";
        String replacedString = "Kumar";
        String expectedString = "Aman Kumar Aman Kumar";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);
    }

    @Test
    void should_return_mainString_if_SubstringNotFound() {
        //given
        String mainString = "Aman Sharma";
        String findstring = "kumar";
        String replacedString = "ttn";
        String expectedString = "Aman Sharma";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);

    }

    @Test
    void should_return_OddElemenls_afterfilter() {
        //given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        List<Integer> expectedlist = new ArrayList<>();
        expectedlist.add(1);
        expectedlist.add(3);
        expectedlist.add(5);

        //when
        List calculatelist = first.filterEvenElements(list);

        //then
        assertEquals(expectedlist, calculatelist);

    }

    @Test
    void should_ThrowException_InvalidInput_if_ListNotExist() {
        //given
        List<BigDecimal> list = null;
        //List<BigDecimal> list=new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException e) {
            System.out.println(e);

        }
    }

    @Test
    void should_ThrowException_InvalidInput_if_ListIsEmpty() {
        //given
        List<BigDecimal> list = new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException r) {
            System.out.println(r);

        }
    }

    @Test
    void should_returnAveragevalue_if_ListContainsElement() {

        //given
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
        }
        BigDecimal expectedAverage = new BigDecimal(1212121);

        //when
        BigDecimal calculateAverage = first.calculateAverage(list);

        //then
        assertEquals(expectedAverage, calculateAverage);
    }

    @Test
    void should_return_True_if_String_Ispalindrome() {
        //given
        String originalinput = "naman";

        //when
        boolean palindromecheck = first.isPallindrome(originalinput);

        //then
        assertFalse(palindromecheck);

    }
}
