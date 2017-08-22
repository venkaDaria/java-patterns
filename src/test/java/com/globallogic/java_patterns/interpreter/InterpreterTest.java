package com.globallogic.java_patterns.interpreter;

import com.globallogic.java_patterns.interpreter.impl.AndExpression;
import com.globallogic.java_patterns.interpreter.impl.OrExpression;
import com.globallogic.java_patterns.interpreter.impl.TerminalExpression;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class InterpreterTest {

    @Test
    public void maleExpressionTest(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        Expression isMale = new OrExpression(robert, john);

        assertTrue(isMale.interpret("John"));
        assertTrue(isMale.interpret("Robert"));
        assertTrue(isMale.interpret("Robert John"));
        assertFalse(isMale.interpret("Julia"));
    }

    @Test
    public void marriedWomanExpressionTest(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        AndExpression isMarriedWoman = new AndExpression(julie, married);

        assertTrue(isMarriedWoman.interpret("Married Julie"));
        assertTrue(isMarriedWoman.interpret("Julie Married"));
        assertFalse(isMarriedWoman.interpret("Married"));
    }
}
