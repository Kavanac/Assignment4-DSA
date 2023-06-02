public class Question7 {
    public static int maxCount(int m, int n, int[][] ops) {
        int leftMin = m, rightMin = n;
        for (int[] op : ops) {
            leftMin = Math.min(op[0], leftMin);
            rightMin = Math.min(op[1], rightMin);
        }
        return leftMin * rightMin;
    }
    public static void main(String[] args)
   	{
   		int m=3;
   		int n=3;
   		int[][] ops= {{2,2},{3,3}};

   		
   		System.out.println(maxCount(m,n,ops));
   		}
}