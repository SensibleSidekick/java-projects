package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketContainingStringReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsBeforeCharactersReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketsAfterCharactersReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void nestedBracketsReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void closedBracketFirstReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void noOpenBracketFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oneAndAHalfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void multipleOpenBracketsReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[["));
    }

    @Test
    public void charactersBetweenUnevenBracketsReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void emptyStringReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

}

/*

Multiple balanced brackets
One balanced pair, one unbalanced pair
test for empty string/null/undefined
test for non bracket characters between balanced brackets
 */