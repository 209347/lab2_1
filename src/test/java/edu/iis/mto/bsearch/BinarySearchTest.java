package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private SearchResult searchResult;
    private final int ZERO = 0;
    private final int ONE = 1;
    private final int[] SEQ_ONE = { 1 };
    private final int[] SEQ_TWO = { 2 };

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
        assertEquals(ZERO, SEQ_ONE[searchResult.getPosition()]);
    }

    @Test
    public void searchShouldReturnFalseIfSeqLengthEqualsOneAndKeyIsInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_TWO);
        assertEquals(false, searchResult.isFound());
    }
}