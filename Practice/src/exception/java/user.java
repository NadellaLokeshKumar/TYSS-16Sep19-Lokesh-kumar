package exception.java;
import java.util.Scanner;
public class user {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
			System.out.println("enter your age");
	int Vote=s.nextInt();
	if(Vote>18) {
		System.out.println("apply for vote");
	}
	else {
		try {
			VoteInvalidException e=new VoteInvalidException("you are not 18");
		throw e;	
		}
		catch(VoteInvalidException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
}
