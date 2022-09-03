// package Array;

// import java.util.ArrayList;
// import java.util.Arrays;
// // import java.util.Collection;
// // import java.util.HashMap;
// // import java.util.LinkedList;
// // import java.util.List;
// // import java.util.Map;

// class Solution {
//     List<List<Integer>> res = new ArrayList<>();
//     boolean[] visited;

//     public List<List<Integer>> permuteUnique(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         visited = new boolean[n];
//         rec(nums, n, new ArrayList<Integer>());
//         return res;
//     }
    
//     protected void rec(int[] nums, int n, ArrayList<Integer> arr){
//         if(arr.size() == n){
//             res.add(new ArrayList<Integer>(arr));
//             return;
//         }
        
//         for(int i = 0; i < n; i++){
//             if(visited[i] || i>0 && visited[i] == visited[i-1] && !visited[i-1])
//                 continue;
            
//             visited[i] = true;
//             arr.add(nums[i]);
            
//             rec(nums, n, arr);
            
//             visited[i] = false;
//             arr.remove(arr.size()-1);
//         }
//     }
    
// }