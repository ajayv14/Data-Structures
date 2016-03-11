package Queues;
//////////////////////////Needs to be bug fixed
public class QueueArray {

//front - 1-2-3-4----rear
	int size = 10; 	
	int[] arr = new int[size];
	int front =-1;
	int rear = -1;
	
	public static void main(String[] args){
		
		QueueArray q = new QueueArray();
		q.enqueue(10);
		  System.out.println(q.front);
		q.enqueue(20);
		  System.out.println(q.front);
        q.enqueue(30);		
        System.out.println(q.front);
		
        System.out.println("enqueue op completed");
        
        q.dequeue();
        System.out.println(q.front);
        
        q.dequeue();
        System.out.println(q.front);
        q.dequeue();
        
        System.out.println(q.front);
        System.out.println("dequeue op completed");
        System.out.println(q.front);
        
        System.out.println(q.front());
        
        
	}
	public void enqueue(int val){
		
		if(isNull()){ //array empty
		 front = rear = 0;
		 arr[rear] = val;
		 }
		else if((rear+1)%size==front){//array full
		 System.out.println("array full");
		}
		else {
			rear = (rear+1)%size;
			arr[rear] = val;			
		}
		}

	public void dequeue(){
		
		if(isNull()){
			 System.out.println("array empty");
		}
		else if(rear == front){
			front = rear = -1;
			
		}
		else{
			
			front = (front+1)%size;
		}
				
	}
	public boolean isNull(){
		
		if(front==1 && rear ==-1){
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
    public int front(){
	
	return arr[front];
}
	
}
