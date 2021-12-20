class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        if(candidates == null || candidates.length == 0) return result;
        List<Integer> list = new ArrayList();
        backtrack(candidates, 0, target, result, list);
        return result;
    }
    private void backtrack(int[] candid, int start, int target, List<List<Integer>> result, List<Integer> list ){
        
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target < 0) return;
        for(int i = start; i < candid.length; i++){
            list.add(candid[i]);
            backtrack(candid, i, target - candid[i], result, list);
            list.remove(list.size() -1);
        }
    }
}
