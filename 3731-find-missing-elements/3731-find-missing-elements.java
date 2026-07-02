class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        System.out.println(list);

        for (int i = min; i <= max; i++) {
            if (list.contains(i)) {
                list.remove(Integer.valueOf(i));
            } else {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }

}