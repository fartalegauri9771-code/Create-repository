public class Solution17 {

    private Trie[] children;
    private boolean isEnd;

    public Solution17() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Solution17 current = this;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Trie();
            }

            current = current.children[index];
        }

        current.isEnd = true;
    }

    public boolean search(String word) {
        Solution17 node = findNode(word);

        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private Solution17 findNode(String str) {
        Solution17 current = this;

        for (char ch : str.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return null;
            }

            current = current.children[index];
        }

        return current;
    }

    public static void main(String[] args) {

        Solution17 trie = new Solution17();

      
        trie.insert("apple");
        trie.insert("app");

       
        System.out.println("Search apple: " + trie.search("apple"));
        System.out.println("Search app: " + trie.search("app"));
       
        System.out.println("Starts with app: " + trie.startsWith("app"));
        System.out.println("Starts with ban: " + trie.startsWith("ban"));
    }
}