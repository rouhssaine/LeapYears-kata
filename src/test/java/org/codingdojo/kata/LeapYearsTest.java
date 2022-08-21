package org.codingdojo.kata;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
public class LeapYearsTest {

    @Test
    void should_be_leap_years_when_year_is_2000() {
        // GIVEN
        int year = 2000;

        // WHEN
        Years years = new Years();
        boolean result = years.isLeap(year);

        // THEN
        assertThat(result).isTrue();
    }
}
