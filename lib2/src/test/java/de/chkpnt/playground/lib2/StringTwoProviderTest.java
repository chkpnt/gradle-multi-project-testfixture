package de.chkpnt.playground.lib2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringTwoProviderTest {

    private StringTwoProvider sut = new StringTwoProvider();

    @Test
    void testGetString() {
        assertThat(sut.getString(), is("two"));
    }
}