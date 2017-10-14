import javax.swing.JOptionPane;


public class OperationClass {	
	public double addition (double firstNumber, double secondNumber){
		double result=0;
		result = firstNumber + secondNumber;
		return result;
	}
	public double subtraction (double firstNumber, double secondNumber){
		double result=0;
		result = firstNumber - secondNumber;
		return result;
	}
	public double multiplication (double firstNumber, double secondNumber){
		double result=0;
		result = firstNumber * secondNumber;
			return result;		
	}
	public double division (double firstNumber, double secondNumber){
		double result=0;
		if (secondNumber == 0 ){
			JOptionPane.showMessageDialog(null, "Деление на ноль");
			return result;
		}
		else{
			result = firstNumber / secondNumber;
			return result;
		}
	}
}
