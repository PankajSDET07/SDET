import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxCalculatorTest {

    @Test
    public void testTaxCalculator() {
        double taxableIncome = 30000.0;

        IT_Calculator calculator = new IT_Calculator(taxableIncome);
        calculator.calculateTaxPaidPerYear();

        // Assertion: Verify the tax calculation
        Assert.assertEquals(calculator.getTaxPaidPerYear(), 3000.0, "Incorrect tax calculation");

        calculator.calculateTaxPayablePerMonth();

        // Assertion: Verify the monthly tax calculation
        Assert.assertEquals(calculator.getTaxPayablePerMonth(), 250.0, "Incorrect monthly tax calculation");
    }
}



import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleCompTest {

    @Test
    public void testCircleCalculator() {
        double radius = 5.0;

        CircleComp circle = new CircleComp(radius);
        circle.calculateProperties();

        // Assertion: Verify the diameter calculation
        Assert.assertEquals(circle.getDiameter(), 10.0, "Incorrect diameter calculation");

        // Assertion: Verify the area calculation
        Assert.assertEquals(circle.getArea(), 157.07963267948966, "Incorrect area calculation");
    }
}




<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="MySuite">
    <test name="TaxCalculatorTest">
        <classes>
            <class name="path.to.your.package.TaxCalculatorTest"/>
        </classes>
    </test>
    <test name="CircleCompTest">
        <classes>
            <class name="path.to.your.package.CircleCompTest"/>
        </classes>
    </test>
</suite>
