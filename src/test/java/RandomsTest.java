import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RandomsTest {
    private final Randoms testRandoms = new Randoms(20, 50);

    @Test
    public void whenMultipleHasNextThenTrue() {
        for (int i = 0; i < 100; i++) {
            assertThat(testRandoms.iterator().hasNext()).isTrue();
        }
    }

    @Test
    public void whenIterateThenValueBetweenMinAndMax() {
        for (int i = 0; i < 100; i++) {
            assertThat(testRandoms.iterator().next())
                    .isGreaterThanOrEqualTo(testRandoms.getMin()).isLessThanOrEqualTo(testRandoms.getMax());
        }
    }
}