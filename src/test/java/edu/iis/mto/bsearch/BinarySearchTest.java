package edu.iis.mto.bsearch;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private SearchResult searchResult;
    private final int MINUS_ONE = -1;
    private final int ZERO = 0;
    private final int ONE = 1;

    @Before
    public void setup() {
        searchResult = new SearchResult();
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthEqualsOneAndKeyIsInSeq() {
        int[] SEQ = {1, 2, 3};
        searchResult = BinarySearch.search(1, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLegnthEqualsOneAndKeyIsInSeq() {
        int[] SEQ = {4, 5, 6, 8, 9};
        searchResult = BinarySearch.search(4, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(ZERO));
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthEqualsOneAndKeyIsNotInSeq() {
        int[] SEQ = {5};
        searchResult = BinarySearch.search(2, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(false));
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLegnthEqualsOneAndKeyIsNotInSeq() {
        int[] SEQ = {8};
        searchResult = BinarySearch.search(3, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(MINUS_ONE));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        int[] SEQ = {4, 5, 2, 1};
        searchResult = BinarySearch.search(4, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        int[] SEQ = {4, 1, 5, 7, 1};
        searchResult = BinarySearch.search(4, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(ZERO));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        int[] SEQ = {5, 9, 8, 3, 2};
        searchResult = BinarySearch.search(2, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeTwoIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        int[] SEQ = {5 ,12, 53};
        searchResult = BinarySearch.search(53, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(2));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        int[] SEQ = {5 , 5346, 12};
        searchResult = BinarySearch.search(5346, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeOneIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        int[] SEQ = {345, 235, 361};
        searchResult = BinarySearch.search(235, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(ONE));
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        int[] SEQ = {456, 2137, 856, 144};
        searchResult = BinarySearch.search(ZERO, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(false));
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        int[] SEQ = {3456, 346, 346, 967, 142, 9897, 2342, 976};
        searchResult = BinarySearch.search(65423546, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(MINUS_ONE));
    }

    @Test (expected = IllegalArgumentException.class)
    public void searchShouldThrowIllegalArgumentExceptionIfSeqIsEmpty() {
        searchResult = BinarySearch.search(ONE, new int[0]);
    }
}
