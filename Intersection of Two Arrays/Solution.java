class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap <Integer,Integer> map=new HashMap<>();

        int [] arr1=nums1;
        int [] arr2=nums2;

        if(nums1.length<nums2.length){
            arr1=nums2;
            arr2=nums1;
        }

        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],-1);
        }

        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],arr2[i]);
            }
        }

        ArrayList<Integer> list=new ArrayList();

        for(Integer i: map. keySet()){

            if(map.get(i)!=-1){
                if(! list.contains(map.get(i))){
                    list.add(map.get(i));
                }

            }
        }

        int [] result=new int[list.size()];

        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }

        return result;
    }
}