class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        if (ransomArray.length > magazineArray.length) {
            return false;
        }
        for (Character ch : magazineArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : ransomArray) {
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

