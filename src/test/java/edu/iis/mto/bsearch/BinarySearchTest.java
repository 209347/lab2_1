package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private SearchResult searchResult;
    private final int ONE = 1;
    private final int[] SEQ_ONE = { 1 };

    @Before
    public void setup() {
        searchResult = new SearchResult();
    }

    @Test
    public void searchShouldReturnOneIfSeqLengthEqualsOneAndKeyIsInSeq() {
        searchResult = BinarySearch.search(ONE, SEQ_ONE);
        assertEquals(true, searchResult.isFound());
    }
}