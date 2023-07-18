import java.util.*;
public class Pro2
{ 
 
  public static void main(String args[])
  {
    int front=-1,rear=-1,y;
    int queue[]=new int[10];
    int stack[]=new int[10];
    int top=-1;
    Scanner sc=new Scanner(System.in);
    int ch,n,x;
    System.out.println("Enter size of stack");
    n=sc.nextInt();
    System.out.println("Enter size of queue:");
			int m=sc.nextInt();
    front++;
    while(true)
    {
	 System.out.println("1.Push \n2.Pop \n3.Enqueue \n4.Dequeue \n5.exit");
      System.out.println("Enter your choice");
      ch=sc.nextInt();
	 switch(ch)
	 {
	    case 1:if(top>=n-1)
			  {
				System.out.println("Stack Overflow");
			  }
			  else
			  {
                  System.out.println("Enter elements to be pushed");
                  x=sc.nextInt();
                  ++top;
                  stack[top]=x;
			  }
		        break;
        case 2:if(top<=-1)
		     {
				System.out.println("Stack is underflow");
		     }
		     else
		     {
				System.out.println(stack[top]+" is deleted");
				top--;
			}
				System.out.println("Present elements in queue are:");
		   			for(int i=0;i<=top;i++)
		  			{
		   				System.out.print(stack[i]+" ");
	       			}	
		 				 System.out.print("\n");
		    			 break;

	  case 3:
			if(rear>=m)
			{ 
				System.out.println("Queue is Full");
			}
			
			else
			{
				System.out.println("Enter element to be insert");
				y=sc.nextInt();
				rear++;
				queue[rear]=y;	
			}
			break;
      case 4:if(front<=-1)
		   {
			System.out.println("queue is alreay empty");
		   }
		   else
		   {
			System.out.println(queue[front]+" is deleted");
			front++;
		   }
		   System.out.println("Present elements in queue are:");
		   for(int i=front;i<m;i++)
		  {
		   System.out.print(queue[i]+" ");
	       }	
		  System.out.print("\n");
            break;
	case 5:
		System.exit(5);    
	    default:System.out.println("Invalid choice");
      }
    }
   }
}