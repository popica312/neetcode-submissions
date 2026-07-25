class Solution {

    // solution 2 (with hint): decode based on length of strings - parity words (a number as delimiter)
    // Solution: add length of string, separated by a character, won't fail on strings also containing that pattern
    // as it is incorporated in the encoding of the word.
    // CORRECT SOLUTION
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs)
            sb.append(str.length()).append('#').append(str);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')   // walk to the delimiter
                j++;
            int length = Integer.parseInt(str.substring(i, j));
            String s = str.substring(j + 1, j + 1 + length);
            result.add(s);
            i = j + 1 + length;            // jump past this whole chunk
        }
        return result;
    }
}
