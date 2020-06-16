import java.util.Scanner;

public class NationalCourt 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int empl1 = Integer.parseInt(sc.nextLine());
		int empl2 = Integer.parseInt(sc.nextLine());
		int empl3 = Integer.parseInt(sc.nextLine());
		int peopleCount = Integer.parseInt(sc.nextLine());
		
		int hoursNeeded = peopleCount / (empl1 + empl2 + empl3);
		if(peopleCount % (empl1 + empl2 + empl3) != 0){
			hoursNeeded++;
		}
		
		if(hoursNeeded / 3  > 0){
			if(hoursNeeded % 3 != 0){ 
				hoursNeeded += hoursNeeded/3;
			}else{
				hoursNeeded += hoursNeeded/3 - 1;
			}
		}
		
		System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}