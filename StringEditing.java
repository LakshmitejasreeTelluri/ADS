import java.util.Scanner;
class EditDistance{
	public int calculateEditDistance(String x,String y){
		int n=x.length();
		int m=y.length();
		int[][] c=new int[n+1][m+1];
		c[0][0]=0;
		for(int i=1;i<=n;i++){
			c[i][0]=i;
		}
		for(int j=1;j<=m;j++){
			c[0][j]=j;
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if((x.charAt(i-1))==(y.charAt(j-1))){
					c[i][j]=c[i-1][j-1];
				}
				else{
					c[i][j]=Math.min((c[i-1][j-1]+2),Math.min(c[i-1][j]+1,c[i][j-1]+1));
				}
			}
		}
		System.out.println("The cost required for string editing is:"+c[n][m]);
		return c[n][m];
	}
}
class StringEditing{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		EditDistance ob=new EditDistance();
		System.out.println("Enter string 1:");
		String x=sc.nextLine();
		System.out.println("Enter new String to be get after modifying string 1:");
		String y=sc.nextLine();
		System.out.println("The cost for editing the string 1 to new string is:"+ob.calculateEditDistance(x,y));
	}
}
