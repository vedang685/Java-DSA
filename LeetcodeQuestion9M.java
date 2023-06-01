import java.util.Arrays;
// solved
//https://leetcode.com/problems/top-k-frequent-elements
// medium problem
public class LeetcodeQuestion9M
{
    public static void main(String[] args)
    {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }

    static int[] topKFrequent(int[] nums, int k)
    {
        int [] ans = new int[k];
        int [] sort = new int[20001];
        int mid = sort.length/2;

        int j = 0;
        while(j < nums.length)
        {
            int max = 0;
            int element = nums[j];
            int counter = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == element)
                {
                    counter++;
                }
            }
            if(counter>max) // potential answer
            {
                if(nums[j] < 0)
                {
                    int i = nums[j]*(-1);
                    sort[mid-i] = counter;
                }
                else
                {
                    int i = nums[j];
                    sort[mid+i] = counter;
                }
            }
            while(nums[j] == element)
            {
                j++;
                if(j == nums.length)
                {
                    break;
                }
            }
        }

        return potentialanswer(sort,k,mid);
    }

    static int[] potentialanswer(int[] sort, int k , int mid)
    {
        int [] ans = new int[k];
        int max = 0;
        int index = 0;
        while(k > 0)
        {
            for(int i = 0; i < sort.length; i++)
            {
                if(sort[i] > max)
                {
                    max = sort[i];
                    index = i;
                }
            }
            max = 0;
            if(index < mid)
            {
                ans[k-1] = -1*(mid-index);
            }
            else
            {
                ans[k-1] = index-mid;
            }
            sort[index] = 0;
            k--;
        }
        return ans;
    }
}
