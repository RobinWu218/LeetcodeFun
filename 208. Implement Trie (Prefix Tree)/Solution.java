class Trie {
    private class TrieNode{
        char val;
        boolean endOfWord;
        TrieNode[] children = new TrieNode[26];
        // TrieNode(){};
        TrieNode(char c){
           // TrieNode root = new TrieNode();
           this.val = c;
        }
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
        // root.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i<word.length(); i++){
            if (cur.children[word.charAt(i) - 'a'] == null){
                cur.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            cur = cur.children[word.charAt(i) - 'a'];
        }
        cur.endOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i<word.length(); i++){
            if (cur.children[word.charAt(i) - 'a'] == null)return false;
            cur = cur.children[word.charAt(i) - 'a'];
        }
        return cur.endOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i<prefix.length(); i++){
            if (cur.children[prefix.charAt(i) - 'a'] == null)return false;
            cur = cur.children[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */