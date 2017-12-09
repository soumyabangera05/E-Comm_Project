import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Kartik
 *
 */
public class EntryClass extends CheckForUser {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//String summary=d.getDate();
		DateFormat dateFormat=new SimpleDateFormat("YYYY/mm/dd HH:mm:ss");
		Date date=new Date(0);
		
		
		
		PrintWriter input=new PrintWriter("fileOfUser.txt");
		PrintWriter bill=new PrintWriter("fileOfBill.txt");

		//PrintWriter io=new PrintWriter(summary);
		//String dateTime="cartList.txt";
		//PrintWriter io=new PrintWriter(dateTime);
		CheckForUser obj=new CheckForUser();
		
		boolean c=true; 
		boolean choice=true;
		double cartPrice=0.0;
		do{
		int wish=Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for login \n2 for register \n0 to exit"));
		switch(wish)
		{
			case 0:
			{
				choice=false;
				System.exit(0);
				break;
			}
			case 1:
			{
				String email=JOptionPane.showInputDialog("Enter your E-mail");
				String password=JOptionPane.showInputDialog("Choose your password");
				boolean result=obj.check(email, password);
				if(result)
				{
					//System.out.println("sucess");
					ArrayList<listOfProducts> productList=new ArrayList<listOfProducts>();
					ArrayList<listOfProducts> cartList=new ArrayList<listOfProducts>();
					listOfProducts tempObj=new listOfProducts();
					//listOfProducts tempObj1=new listOfProducts();
					productList=tempObj.addProducts();
					for(int i=0;i<productList.size();i++)
					{
					//System.out.println(productList);
						tempObj=productList.get(i);
						System.out.println("Product number "+i);
						System.out.println("Product name "+tempObj.name);
						System.out.println("Product color "+tempObj.color);
						System.out.println("Product camera "+tempObj.camera);
						System.out.println("Product memory "+tempObj.memory);
						System.out.println("Product screen "+tempObj.screen);
						System.out.println("Product price "+tempObj.price+"\n");
					}
					do{
					int w=Integer.parseInt(JOptionPane.showInputDialog("Enter product number to add to cart or 90 to exit"));
					if(w==90)
					{
						c=false;
						//break;
					}
					else if(w<productList.size())
					{
						listOfProducts tempObj1=new listOfProducts();
						tempObj1=productList.get(w);
						cartList.add(tempObj1);
					}
					else
					{
						JOptionPane.showConfirmDialog(null, "Pease try again and enter valid information");
					}
					//System.out.println("Enter product number to add to cart or 0 to exit");
					}while(c);
					System.out.println("\n*****You Added Cart List*****");
					for(int i=0;i<cartList.size();i++)
					{
					//System.out.println(productList);
						tempObj=cartList.get(i);
						//System.out.println("Product number "+i);
						System.out.println("Product name "+tempObj.name);
						System.out.println("Product color "+tempObj.color);
						System.out.println("Product camera "+tempObj.camera);
						System.out.println("Product memory "+tempObj.memory);
						System.out.println("Product screen "+tempObj.screen);
						System.out.println("Product price "+tempObj.price+"\n");
						cartPrice=cartPrice+tempObj.price;
						//System.out.println("Total Price "+cartPrice);
					}
					double tax=(13.5/100)*cartPrice;
					if((cartPrice+tax)<=obj.balance)
					{
						System.out.println("Purchase successful\n");
						System.out.println("Tax "+tax);
						System.out.println("Total Price (Inc all taxes) "+(cartPrice+tax));
						//String summaryName=LocalDateTime.now()+".txt";
						try{
						//io=new PrintWriter("cartList.txt");
						}catch(Exception e)
						{
							System.out.println("File not found");
						}
						bill.println(" *****WELCOME TO KARTIK'S KART***** \n Here is your purchase \n");
						for(int i=0;i<cartList.size();i++)
						{
							listOfProducts cartObj=new listOfProducts();
							cartObj=cartList.get(i);
							bill.println("Product name "+cartObj.name+"\n"+"Product price "+cartObj.price+"\n");
						}
						bill.println("Tax "+tax+"\n"+"Total price (Inc all taxes) "+(cartPrice+tax));
						bill.println("\n *****Have a Good Day*****");
						bill.println("\n"+ZonedDateTime.now());
						bill.close();
					}
					else
					{
							JOptionPane.showConfirmDialog(null, "Purchase failed out of balance");
							choice=false;
							break;
							
					}
					

				}
				else
				{
					JOptionPane.showConfirmDialog(null, "User not exit Please try again");
				}
				break;
			}
			case 2:
			{
				String Firstname=JOptionPane.showInputDialog("Enter your first name");
				String Lastname=JOptionPane.showInputDialog("Enter your last name");
				String age=JOptionPane.showInputDialog("Enter your age");
				String password=JOptionPane.showInputDialog("Choose your password");
				String email=JOptionPane.showInputDialog("Enter your E-mail");
				String cardNumber=JOptionPane.showInputDialog("Enter your card number");
				double cardBalance=Double.parseDouble(JOptionPane.showInputDialog("Enter your card balance"));
				
				input.println(Firstname+":"+password+":"+email+":"+Lastname+":"+age+":"+cardNumber+":"+cardBalance);
				input.close();
				break;
			}
			default:
			{
				JOptionPane.showConfirmDialog(null, "Invalid input try again");
			}
			
		}

		}while(choice);
		
		input.close();
	}

}
