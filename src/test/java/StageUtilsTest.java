import org.junit.jupiter.api.Assertions;

class StageUtilsTest {

    @org.junit.jupiter.api.Test
    void stage1() {
        String example = "aabcccbbad";
        String result = StageUtils.Stage1(example);
        Assertions.assertEquals("d", result);
    }

    @org.junit.jupiter.api.Test
    void stage2() {
        String example = "abcccbad";
        String result = StageUtils.Stage2(example);
        Assertions.assertEquals("d", result);
    }
}