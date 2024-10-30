class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> set = new HashSet<>();
      for(int n2:nums2){
        set.add(n2);
      }
      ArrayList<Integer> ans  =new ArrayList<>();
      for(int n1:nums1){
        if(set.contains(n1)){
            ans.add(n1);
            set.remove(n1);
        }
         
      }
      int res[] = new int [ans.size()];
      for(int i =0;i<ans.size();i++){
        res[i] = ans.get(i);
      }
      return res;
    }
}