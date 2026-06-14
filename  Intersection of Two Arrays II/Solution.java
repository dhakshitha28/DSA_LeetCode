class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List <Integer> list=new ArrayList();
        List <Integer> res=new ArrayList();

        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                res.add(nums2[i]);
                int index=list.indexOf(nums2[i]);
                list.set(index,-1);
            }
        }

        int[] resArray = new int[res.size()];

        for(int i = 0; i < res.size(); i++){
            resArray[i] = res.get(i);
        }

        return resArray;
    }
}