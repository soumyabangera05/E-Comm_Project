import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckForUser {
	boolean b=false;
	File file=new File("fileOfUser.txt");
	double balance;
	String nameOfUser;
	boolean check(String userEmail,String userPassword) throws FileNotFoundException
	{
		Scanner s=new Scanner(file);
		String line=s.next();
		//System.out.println(line);
		String[] userInfo=line.split(":");
		nameOfUser=userInfo[0];
		String passwordOfUser=userInfo[1];
		String emailOfUser=userInfo[2];
		balance=Double.parseDouble(userInfo[6]);
		if(emailOfUser.equalsIgnoreCase(userEmail) && passwordOfUser.equalsIgnoreCase(userPassword))
		{
			b=true;
		}
		//System.out.println(emailOfUser+"\n"+userEmail+"\n"+passwordOfUser+"\n"+userPassword);

		s.close();
		
		
		return b;
	}

}
