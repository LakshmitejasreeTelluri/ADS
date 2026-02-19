import java.util.Scanner;
class StackArray{
		int maxsize;
		int[] stack;
		int top;
		StackArray(int size){
			maxsize=size;
			stack=new int[maxsize];
			top=-1;
		}
		public int push(int data){
			if(top==maxsize-1){
				System.out.println("Stack overflow");
				return -1;
			}
			return stack[++top]=data;
		}
		public int pop(){
			if(top==-1){
				System.out.println("Stack underflow");
				return -1;
			}		
			return stack[top--];
		}
		public int peek(){
			if(top==-1){
				return -1;
			}
			return stack[top];
		}
		public boolean isEmpty(){
			return top==-1;
		}
		public int printStack(){
			for(int i=top;i>=0;i--){
				System.out.println(stack[i]);
				return stack[i];
			}
			
		}
}
class Stack{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stack size:");
		int maxsize=sc.nextInt();
		StackArray st=new StackArray(maxsize);
		st.push(10);
		st.push(20);
		System.out.println("Stack:"+st.printStack());
		st.pop();
		System.out.println("Stack:"+st.printStack());
		st.peek();
		System.out.println("Top element of stack:"+st.printStack());
	}
}

