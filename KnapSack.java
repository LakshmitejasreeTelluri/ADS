import java.util.Arrays;
class Item{
	int weight,profit;
	float ratio;
	Item(int weight,int profit){
		this.weight=weight;
		this.profit=profit;
		this.ratio=profit/weight;
	}
}
class GreedyFractionalKnapsack{
		public double getMaxprofit(Item[] items,int m){
			//sort items by profit/weight ratio(descending)
			Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
			double maxprofit=0.0;
			System.out.println("Items placed in the bag:");
			for(Item item:items){
				if(item.weight<=m){
					maxprofit+=item.profit;
					m-=item.weight;
				}
				else{
					double fraction=(double)m/item.weight;
					maxprofit+=item.profit*fraction;
					break;
				}
			}
			return maxprofit;
		}
}
class KnapSack{
	public static void main(String args[]){
		GreedyFractionalKnapsack i=new GreedyFractionalKnapsack();
		Item[] items={
			new Item(10,60),
			new Item(20,100),
			new Item(30,120)
		};
		int m=50;
		double maxprofit=i.getMaxprofit(items,m);
		System.out.println("Maximum profit in KnapSack:"+maxprofit);
	}
}
