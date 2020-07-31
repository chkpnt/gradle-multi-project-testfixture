package de.chkpnt.playground.lib1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringOneProviderTest {

    private StringOneProvider sut = new StringOneProvider();

    @Test
    void testGetString() {
        assertThat(sut.getString(), is("one"));
    }
}