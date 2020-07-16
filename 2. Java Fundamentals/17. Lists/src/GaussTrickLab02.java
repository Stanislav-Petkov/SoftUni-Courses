class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> nums = new ArrayList<>();
        for (int j = 0; j < parts.length; j++) {
            nums.add(Integer.parseInt(parts[j]));
        }
        int sum = nums.size();
        for (int i = 0; i < sum / 2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size() - 1);
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}