


import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	private String description;
	private String dueDate;
	
	public Task(String descrip, String due){
		this.description = descrip;
		this.dueDate = due;
	}
		

	

	
	public static void main(String[] args) {
		String Date, whatToDo;
		String userChoiceStr, removeTaskStr;
		int userChoice, removeTask;
		ArrayList<Task> taskList = new ArrayList<Task>();
        Scanner user_input = new Scanner(System.in);
        
        
  
        
        
        do
        {
        	System.out.print("What would you like to do?\n");
        	System.out.print("1. Add task\n");
        	System.out.print("2. View all tasks\n");
        	System.out.print("3. Remove task\n");
        	System.out.print("4. Terminate\n");
        	
        	userChoiceStr = user_input.nextLine();
        	userChoice = Integer.parseInt(userChoiceStr);
        	
        	
        	switch(userChoice){
        	case 1:
        		System.out.println("When is it due?");
        		Date = user_input.nextLine(); 
        		System.out.println("What do you have to do?");
        		whatToDo = user_input.nextLine();
        		taskList.add(new Task(whatToDo, Date));
        		System.out.println("Okay, Its been added to the list!\n");
        		break;
        		
        	case 2:
        		for(Task task : taskList){
        			System.out.println("Due on:" + task.dueDate);
        			System.out.println("To Do:" + task.description);
        			System.out.println("\n");
        			}
        		break;
        		
        	case 3:
        		removeTaskStr = user_input.nextLine();
        		removeTask = Integer.parseInt(removeTaskStr);
        		taskList.remove((removeTask-1));
        		break;
        		
        	case 4: 		
        		userChoice = -1;
        		user_input.close();
        		break;
        		
        	default: System.out.println("Invalid input! Try again");
        		}
        	
        }
        while(userChoice != -1);
		
	}


}
