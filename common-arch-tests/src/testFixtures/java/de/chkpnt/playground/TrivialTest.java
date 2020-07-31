package de.chkpnt.playground;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrivialTest {

    @Test
    void testOnePlusOne() {
        assertThat(1+1, is(2));
    }
}
