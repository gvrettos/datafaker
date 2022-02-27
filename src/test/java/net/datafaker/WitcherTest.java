package net.datafaker;

import org.junit.jupiter.api.Test;

import static net.datafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class WitcherTest extends AbstractFakerTest {

    @Test
    public void testCharacter() {
        assertThat(faker.witcher().character(), matchesRegularExpression("[A-Za-z' -éúï]+"));
    }

    @Test
    public void testWitcher() {
        assertThat(faker.witcher().witcher(), matchesRegularExpression("[A-Za-z -ëúï]+"));
    }

    @Test
    public void testSchool() {
        assertThat(faker.witcher().school(), matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void testLocation() {
        assertThat(faker.witcher().location(), matchesRegularExpression("[A-Za-z -áâé]+"));
    }

    @Test
    public void testQuote() {
        assertThat(faker.witcher().quote(), matchesRegularExpression("[-A-Za-z0-9 —;…\\?\\!\\.’‘'”“,\\[\\]]+"));
    }

    @Test
    public void testMonster() {
        assertThat(faker.witcher().monster(), matchesRegularExpression("[A-Za-z -]+"));
    }

    @Test
    public void testSign() {
        assertThat(faker.witcher().sign(), matchesRegularExpression("[A-Za-z -]+"));
    }

    @Test
    public void testPotion() {
        assertThat(faker.witcher().potion(), matchesRegularExpression("[A-Za-z '-]+"));
    }

    @Test
    public void testBook() {
        assertThat(faker.witcher().book(), matchesRegularExpression("[A-Za-z -]+"));
    }
}
