import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Kartik
 *
 */
public class listOfProducts {
	ArrayList<listOfProducts> myList=new ArrayList<listOfProducts>();
	String name;
	String memory;
	String color;
	double price;
	String camera;
	String screen;
	ArrayList<listOfProducts> addProducts()
	{
		
			listOfProducts obj=new listOfProducts();
			obj.name="Iphone 7";
			obj.memory="32gb,128gb";
			obj.color="Red,Silver,Black(glossy,matt)";
			obj.price=899.0;
			obj.camera="8mp(Secondary),12mp(Rear)";
			obj.screen="4.7 inches";
			myList.add(obj);
			
			listOfProducts obj1=new listOfProducts();
			obj1.name="Iphone 7 plus";
			obj1.memory="32gb,128gb";
			obj1.color="Red,Silver,Black(glossy,matt)";
			obj1.price=1049.0;
			obj1.camera="8mp(Secondary),12mp(Rear)";
			obj1.screen="5.5 inches";
			myList.add(obj1);
			
			listOfProducts obj2=new listOfProducts();
			obj2.name="Vivo v5";
			obj2.memory="16gb,32gb";
			obj2.color="Silver,Black,Golden";
			obj2.price=519.0;
			obj2.camera="20mp(Secondary),12mp(Rear)";
			obj2.screen="5 inches";
			myList.add(obj2);
			
			listOfProducts obj3=new listOfProducts();
			obj3.name="Vivo v3";
			obj3.memory="16gb";
			obj3.color="Silver,Black,Golden";
			obj3.price=400;
			obj3.camera="12mp(Secondary),8mp(Rear)";
			obj3.screen="4.5 inches";
			myList.add(obj3);
			
			listOfProducts obj4=new listOfProducts();
			obj4.name="Moto x";
			obj4.memory="16gb,32gb";
			obj4.color="Silver,Black";
			obj4.price=699;
			obj4.camera="8mp(Secondary),12mp(Rear)";
			obj4.screen="5 inches";
			myList.add(obj4);
			
			listOfProducts obj5=new listOfProducts();
			obj5.name="RedMI Note 3";
			obj5.memory="16gb,32gb";
			obj5.color="Silver,Black,Golden";
			obj5.price=250;
			obj5.camera="5mp(Secondary),13mp(Rear)";
			obj5.screen="5 inches";
			myList.add(obj5);
			
			listOfProducts obj6=new listOfProducts();
			obj6.name="RedMI Note 5";
			obj6.memory="16gb,32gb";
			obj6.color="Silver,Black,Golden";
			obj6.price=399;
			obj6.camera="8mp(Secondary),16mp(Rear)";
			obj6.screen="5 inches";
			myList.add(obj6);
			
			listOfProducts obj7=new listOfProducts();
			obj7.name="Samsung Galaxy 7";
			obj7.memory="32gb,64gb";
			obj7.color="Silver,Black,Golden,Space Grey";
			obj7.price=899;
			obj7.camera="12mp(Secondary),16mp(Rear)";
			obj7.screen="5 inches";
			myList.add(obj7);
			
			return myList;

		
	}

}
