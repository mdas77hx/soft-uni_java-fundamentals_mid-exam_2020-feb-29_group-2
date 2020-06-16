import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String firstLine = sc.nextLine();
		
		List<String> shoppingList = new ArrayList<>( Arrays.asList( firstLine.split("!") ) );

		String command = sc.nextLine();
		
		while( !command.equals("Go Shopping!") ){
			String[] commandParts = command.split(" ");
			
			switch(commandParts[0]){
				
					case "Urgent":
					if(!shoppingList.contains(commandParts[1])){
						shoppingList.add(0,commandParts[1]); 
					}
					break;
					
					case "Unnecessary":
					if(shoppingList.contains(commandParts[1])){
						shoppingList.remove(commandParts[1]); 
					}
					break;
					
					case "Correct":
					if(shoppingList.contains(commandParts[1])){
						for(int i = 0; i < shoppingList.size(); i++){
							if( shoppingList.get(i).equals(commandParts[1]) ){
								shoppingList.set( i, commandParts[2] );
							}	
						}
					}
					break;
					
					case "Rearrange":
					if(shoppingList.contains(commandParts[1])){
						shoppingList.remove(commandParts[1]);
						shoppingList.add(commandParts[1]);
					}
					break;
			}
			if(sc.hasNextLine()){
				 command = sc.nextLine();
			}
		}
		String result = String.join(", ", shoppingList);
		System.out.println(result);
    }
}