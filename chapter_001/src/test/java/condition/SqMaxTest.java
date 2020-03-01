package condition;

import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void maxt1() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }
}
