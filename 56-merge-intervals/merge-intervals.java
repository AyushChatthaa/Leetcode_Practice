class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int start=intervals[0][0],end=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
            ArrayList<Integer> newArrayList=new ArrayList<>(Arrays.asList(start,end));
              ans.add(newArrayList);
              start=intervals[i][0];
              end=intervals[i][1];
            }
        }
        ArrayList<Integer> newArrayList=new ArrayList<>(Arrays.asList(start,end));
        ans.add(newArrayList);
        int n=ans.size();
         int[][] res=new int[n][2];
        for(int i=0;i<n;i++){
           res[i][0]=ans.get(i).get(0);
           res[i][1]=ans.get(i).get(1);
        }
        return res;
    }
}