package org.codingdojo.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
public class LeapYearsTest {

    Years years;

    @BeforeEach
    void setup() {
        years = new Years();
    }

    @Test
    void should_be_leap_years_when_year_is_2000() {
        assertThat(years.isLeap(2000)).isTrue();
    }

    @Test
    void should_not_be_leap_years_when_year_is_2001() {
        assertThat(years.isLeap(2001)).isFalse();
    }

    @Test
    void should_not_be_leap_years_when_year_is_2008() {
        assertThat(years.isLeap(2008)).isTrue();
    }

}
