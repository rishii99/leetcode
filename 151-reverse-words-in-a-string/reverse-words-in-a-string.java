class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        List<String> list=Arrays.asList(words);
        Collections.reverse(list);
        return String.join(" ",list);
    }
}
