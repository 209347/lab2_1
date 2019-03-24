package edu.iis.mto.bsearch;

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
        assertEquals(true, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLegnthEqualsOneAndKeyIsInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_ONE);
        assertEquals(ZERO, searchResult.getPosition());
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthEqualsOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_TWO);
        assertEquals(false, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLegnthEqualsOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_TWO);
        assertEquals(MINUS_ONE, searchResult.getPosition());
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertEquals(true, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeZeroIfSeqLengthIsGreaterThanOneAndKeyIsTheFirstElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertEquals(ZERO, searchResult.getPosition());
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertEquals(true, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeTwoIfSeqLengthIsGreaterThanOneAndKeyIsTheLastElementInSeq() {
        searchResult = BinarySearch.search(THREE, SEQ);
        assertEquals(TWO, searchResult.getPosition());
    }

    @Test
    public void searchShouldReturnTrueIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ);
        assertEquals(true, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeOneIfSeqLengthIsGreaterThanOneAndKeyIsTheCenterElementInSeq() {
        searchResult = BinarySearch.search(TWO, SEQ);
        assertEquals(ONE, searchResult.getPosition());
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ZERO, SEQ);
        assertEquals(false, searchResult.isFound());
    }

    @Test
    public void searchPositionShouldBeMinusOneIfSeqLengthIsGreaterThanOneAndKeyIsNotInSeq() {
        searchResult = BinarySearch.search(ZERO, SEQ);
        assertEquals(MINUS_ONE, searchResult.getPosition());
    }
}