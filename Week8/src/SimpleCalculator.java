import java.util.Scanner;

public class SimpleCalculator {
	
	public static int addition(String[] parse) throws AddZeroException, OutOfRangeException {
		int input = Integer.parseInt(parse[0]); int input2 = Integer.parseInt(parse[1]);
		int sum =  input + input2;
		if(parse[0].equals("0") || parse[1].equals("0")) throw new AddZeroException();
		if(sum < 0 || sum > 1000 || input < 0 || input > 1000 || input2 < 0 || input2 > 1000) throw new OutOfRangeException();
		return sum;
	}
	
	public static int submission(String[] parse) throws SubtractZeroException, OutOfRangeException {
		int input = Integer.parseInt(parse[0]); int input2 = Integer.parseInt(parse[1]);
		int sub =  input - input2;
		if(parse[0].equals("0") || parse[1].equals("0")) throw new SubtractZeroException();
		if(sub < 0 || sub > 1000 || input < 0 || input > 1000 || input2 < 0 || input2 > 1000) throw new OutOfRangeException();
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		String[] parse = new String[3];
		
		try {
		if(input.contains("+")) {
			parse = input.split("\\+");
			System.out.println(addition(parse));
		} else if(input.contains("-")){
			parse = input.split("\\-");	
			System.out.println(submission(parse));
		}
		} catch(SubtractZeroException | AddZeroException e) {
			e.printStackTrace();
		} catch(OutOfRangeException e) {
			e.printStackTrace();
		}
		scn.close();
	}

}

class AddZeroException extends Exception {
	AddZeroException() {
		super();
	}
	AddZeroException(String message) {
		super(message);
	}
}

class SubtractZeroException extends Exception {
	SubtractZeroException() {
		super();
	}
	SubtractZeroException(String message) {
		super(message);
	}
}

class OutOfRangeException extends Exception {
	OutOfRangeException() {
		super();
	}
	OutOfRangeException(String message) {
		super(message);
	}
}
