import java.util.Scanner;

public class HeartDelivery 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		String[] inputStrings = sc.nextLine().split("@");
		
		int[] houses = new int[inputStrings.length];
		
		for(int i = 0; i < inputStrings.length; i++){
			int hearts = Integer.parseInt(inputStrings[i]);
			houses[i] = hearts;
		}

		String command = sc.nextLine();
		
		int jumpStart = 0;
		int counter = 0;
		
		while( !command.equals("Love!") ){
			String[] commandParts = command.split(" ");
			int jumpLength = Integer.parseInt(commandParts[1]);
			int visitedHouseIndex = jumpStart + jumpLength;
			
			while(visitedHouseIndex >= houses.length){
					visitedHouseIndex = 0;
			}
			
			if(houses[visitedHouseIndex] == 0){
				System.out.println("Place " + visitedHouseIndex + " already had Valentine's day.");
			}else{
				houses[visitedHouseIndex] -= 2;
			 
   		        if(houses[visitedHouseIndex] == 0){
					System.out.println("Place " + visitedHouseIndex + " has Valentine's day.");
					counter++;
				}
			}
			
			jumpStart = visitedHouseIndex;
			
			if(sc.hasNextLine()){
				 command = sc.nextLine();
			}
		}
		
		System.out.println("Cupid's last position was " + jumpStart + ".");
		
		if(counter == houses.length){
			System.out.println("Mission was successful.");
		}else{
			System.out.println("Cupid has failed " + (houses.length - counter) + " places.");
		} 
    }
}