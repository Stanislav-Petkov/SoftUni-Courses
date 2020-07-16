
class MergingListsLab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        List<Integer> merged = new ArrayList<>();
        String[] parts1 = scanner.nextLine().split(" ");
        String[] parts2 = scanner.nextLine().split(" ");
        for (int i = 0; i < parts1.length; i++) {
            nums1.add(Integer.parseInt(parts1[i]));
        }
        for (int i = 0; i < parts2.length; i++) {
            nums2.add(Integer.parseInt(parts2[i]));
        }
        int maxSize = Math.min(nums1.size(), nums2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < nums1.size()) {
                merged.add(nums1.get(i));
            }
            if (i < nums2.size()) {
                merged.add(nums2.get(i));
            }
        }
        if (nums1.size() < nums2.size()) {
            merged.addAll(getRemaininglElements(nums1, nums2));
        } else {
            merged.addAll(getRemaininglElements(nums2, nums1));
        }
        System.out.println(merged.toString().replaceAll("[\\[\\],]", ""));
    }

    public static List<Integer> getRemaininglElements(List<Integer> shorterList, List<Integer> longerList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}