package edu.iis.mto.bsearch;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private SearchResult searchResult;
    private final int MINUS_ONE = -1;
    private final int ZERO = 0;
    private final int ONE = 1;
    private final int TWO = 2;
    private final int THREE = 3;
    private final int[] SEQ_ONE = { 1 };
    private final int[] SEQ_TWO = { 2 };
    private final int[] SEQ = { 1, 2, 3 };

    @Before
    public void setup() {
        searchResult = new SearchResult();
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthEqualsOneAndKeyIsInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_ONE);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLegnthEqualsOneAndKeyIsInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_ONE);
        assertThat(searchResult.getPosition(), Matchers.is(ZERO));
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthEqualsOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_TWO);
        assertThat(searchResult.isFound(), Matchers.is(false));
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLegnthEqualsOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_TWO);
        assertThat(searchResult.getPosition(), Matchers.is(MINUS_ONE));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(ZERO));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeTwoIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        searchResult = BinarySearch.search(THREE, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(TWO));
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(true));
    }

    @Test
    public void searchPositionShouldBeOneIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        searchResult = BinarySearch.search(TWO, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(ONE));
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ZERO, SEQ);
        assertThat(searchResult.isFound(), Matchers.is(false));
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ZERO, SEQ);
        assertThat(searchResult.getPosition(), Matchers.is(MINUS_ONE));
    }
}