package assignment;

public class SmartCalculator 
{
	private double principal;
    private double rate;
    private double time;
    private double[] numbers;
    private double totalMarks;
    private double marksObtained;
    
 // Constructors
    // Non-parameterized constructor
    public SmartCalculator() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.numbers = null;
        this.totalMarks = 0;
        this.marksObtained = 0;
    }
   
 // Parameterized constructor
    public SmartCalculator(double principal, double rate, double time, double[] numbers, double totalMarks, double marksObtained) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.numbers = numbers;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
    }

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double[] getNumbers() {
		return numbers;
	}

	public void setNumbers(double[] numbers) {
		this.numbers = numbers;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}
    
	// Methods
    // Calculate Simple Interest
    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }
   
    // Calculate Compound Interest
    public double calculateCompoundInterest() {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    // Calculate Mean of Given Numbers
    public double calculateMean() {
        if (numbers == null || numbers.length == 0) {
            return 0; // return 0 if the array is empty
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Calculate Factorial of a Given Number
    public double calculateFactorial(int n) {
        if (n < 0) {
            return -1; // return -1 for invalid input
        } else if (n == 0) {
            return 1; // return 1 for 0! = 1
        } else {
            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    // Calculate Percentage of Marks Obtained
    public double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }

}
