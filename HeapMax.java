import java.util.Arrays;
import java.util.Scanner;
class MaxHeap{
	int[] arr;
	int maxSize,heapSize;
	MaxHeap(int maxSize){
		this.maxSize=0;
		arr=new int[maxSize];
	}
	int parent(int i){
		return (i-1)/2;
	}
	int lChild(int i){
		return 2*i+1;
	}
	int rChild(int i){
		return 2*i+2;
	}
	void MaxHeapify(int i){
		int l=lChild(i);
		int r=rChild(i);
		int largest=i;
		if(l<heapSize&&arr[l]>arr[largest]){
			return largest=l;
		}
		if(r<heapSize&&arr[r]>arr[largest]){
			return largest=r;
		}
		if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			MaxHeapify(largest);
		}
	}
	void insert(int x){
		if(heapSize==maxSize){
			System.out.println("Heap is overflow");
			return;
		}
		int i=arr[heapSize];
		arr[i]=x;
		heapSize++;
		while(i!=0&&arr[parent(i)]<arr[i]){
			int t=arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=t;
			i=parent(i);
		}
	}
	voidremoveMax(){
		if(heapSize<=0){
			System.out.println("Heap is empty");
		}
		if(heapSize==1){
			heapSize--;
		}
		else{
			arr[0]=arr[heapSize-1];
			heapSize--;
			MaxHeapify(0);
		}
	}
	int get
}
