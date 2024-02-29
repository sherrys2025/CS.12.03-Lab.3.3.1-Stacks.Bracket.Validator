import static org.junit.jupiter.api.Assertions.*;

class CheckParenthesesTest {

    private String brackets1;
    private String brackets2;
    private String brackets3;
    private String brackets4;
    private String brackets5;
    private String brackets6;
    private String brackets7;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        brackets1 = "[{}]";
        brackets2 = "(()())";
        brackets3 = "{]";
        brackets4 = "[()]))()";
        brackets5 = "[]{}({})";
        brackets6 = "{{}[([])]}";
        brackets7 = "{{}[([])]}}";
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        brackets1 = null;
        brackets2 = null;
        brackets3 = null;
        brackets4 = null;
        brackets5 = null;
        brackets6 = null;
        brackets7 = null;

    }

    @org.junit.jupiter.api.Test
    void checkValidParentheses() {

        String[] validBracketArray = new String[]{brackets1, brackets2, brackets5, brackets6};
        String[] invalidBracketArray = new String[]{brackets3, brackets4, brackets7};

        for (String bracketString: validBracketArray) {
            assertTrue(BracketValidator.checkValidParentheses(bracketString));

        }

        for (String bracketString: invalidBracketArray) {

            assertFalse(BracketValidator.checkValidParentheses(bracketString));

        }

    }

}
