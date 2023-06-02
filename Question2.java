import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question2 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashSet<Integer> set1 = new HashSet<Integer>();
       HashSet<Integer> set2 = new HashSet<Integer>();
       List<List<Integer>> ans=new ArrayList<List<Integer>>();

       
       for(int i=0;i<nums1.length;i++)
       {
           set1.add(nums1[i]);
       }
       
        
       for(int i=0;i<nums2.length;i++)
       {
           set2.add(nums2[i]);
           if(set1.contains(nums2[i]))
                set1.remove(nums2[i]);
       }

        
       for(int i=0;i<nums1.length;i++)
       {
           if(set2.contains(nums1[i]))
                set2.remove(nums1[i]);
       }

       
       ans.add(new ArrayList<Integer>(set1));
       ans.add(new ArrayList<Integer>(set2));
       return ans;
    }
    public static void main(String args[])
	{
		

		int nums1[] = { 1,2,3 };
		int nums2[] = { 2,4,6 };
		
		System.out.println(findDifference(nums1,nums2));
		
		
	}
}
