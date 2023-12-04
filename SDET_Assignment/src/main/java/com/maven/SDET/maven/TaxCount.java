package com.maven.SDET.maven;


	import java.util.Scanner;
	public class TaxCount {
	
	    // Class variables
	    private double taxableIncome;
	    private double taxPaidPerYear;
	    private double taxPayablePerMonth;

	    // Constructor to initialize variables
	    public TaxCount(double taxableIncome) {
	        this.taxableIncome = taxableIncome;
	    }

	    // Method to calculate tax paid per year
	    public void calculateTaxPaidPerYear() {
	        if (taxableIncome <= 25000) {
	            taxPaidPerYear = 0;
	        } else if (taxableIncome > 25000 && taxableIncome <= 50000) {
	            taxPaidPerYear = taxableIncome * 0.1;
	        } else if (taxableIncome > 50000 && taxableIncome <= 75000) {
	            taxPaidPerYear = taxableIncome * 0.2;
	        } else {
	            taxPaidPerYear = taxableIncome * 0.3;
	        }
	    }

	    // Method to calculate tax payable per month
	    public void calculateTaxPayablePerMonth() {
	        taxPayablePerMonth = taxPaidPerYear / 12;
	    }

	    // Method to display results
	    public void displayResults() {
	        System.out.println("Tax Paid per Year: $" + taxPaidPerYear);
	        System.out.println("Tax Payable per Month: $" + taxPayablePerMonth);
	    }

	    public static void main(String[] args) {
	        // Creating Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Reading TaxableIncome from user
	        System.out.print("Enter Taxable Income: $");
	        double taxableIncome = scanner.nextDouble();

	        // Creating IT_Calculator object
	        TaxCount calculator = new TaxCount(taxableIncome);

	        // Calculating tax paid per year and tax payable per month
	        calculator.calculateTaxPaidPerYear();
	        calculator.calculateTaxPayablePerMonth();

	        // Displaying results
	        calculator.displayResults();

	        // Closing Scanner
	        scanner.close();
	    }
	}



