import java.util.*;
public class todolist {
    private static ArrayList<String> taskList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            menu();
            int c=sc.nextInt();
             sc.nextLine();
            switch(c){
                case 1:
                addTask(sc);
                break;
                case 2:
                mark(sc);
                break;
                case 3:
                remove(sc);
                break;
                case 4:
                display(sc);
                break;
                case 5:
                System.out.println("\n\n----------Tata Bye Bye...!!---------------\n\n");
                System.exit(0);
                default:
                System.out.println("Enter the valid data");
            }
        }
    }
    private static void menu(){
        System.out.println("\n********To-Do List*******");
        System.out.println("1.Add Task");
        System.out.println("2.Mark as Completed");
        System.out.println("3.Remove Task");
        System.out.println("4.Display tasks");
        System.out.println("5.Exit");
        System.out.print("Enter the choice: ");

    }
    private static void addTask(Scanner sc){
        System.out.print("Enter the task: ");
        String task=sc.nextLine();
        taskList.add(task);
        System.out.println("Task added successfully "+task);
    }
    private static void display(Scanner sc){
        if(taskList.isEmpty()){
            System.out.println("No tasks...>!!!");
        }
        else{
            System.out.println("\n_______________ To-Do List______________");
            for(int i=0;i<taskList.size();i++){
                System.out.println(i+"."+taskList.get(i));
            }
        }
    }
    private static void mark(Scanner sc){
        display(sc);
        System.out.print("Enter the index you have to mark completed: ");
        int in=sc.nextInt();
        if(in>=0&&in<taskList.size()){
            String task=taskList.get(in);
            taskList.set(in,task+"{Completed}");
            System.out.println("Marked as completed "+task);
        }
        else{
            System.out.println("Error !!");
        }
    }
    private static void remove(Scanner sc){
        display(sc);
        System.out.print("Enter the index you have remove :");
        int in=sc.nextInt();
        if(in>=0&&in<taskList.size()){
            String task=taskList.get(in);
            taskList.remove(in);
            System.out.println("Task removed "+task);
        }
        else{
            System.out.println("Error !!");
        }
    }

}
