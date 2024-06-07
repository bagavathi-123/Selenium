package org.adactin;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class TestResult {
@Test
public void testResult() {
Result r = JUnitCore.runClasses(LearnAdactinHotel.class);
System.out.println("RUN COUNT -----"+r.getRunCount());
System.out.println("FAILURE-----"+r.getFailureCount());
System.out.println("IGNORE--"+r.getIgnoreCount());
System.out.println("RUNTIME-----"+r.getRunCount());
}
}
