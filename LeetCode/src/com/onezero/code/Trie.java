package com.onezero.code;

public class Trie {

    /**
     * 208实现 Trie 类：
     *
     * Trie() 初始化前缀树对象。
     * void insert(String word) 向前缀树中插入字符串 word 。
     * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
     * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false
     *
     *  好久之前第一次面试一家小公司找实习时，就问了字典树，奈何我不懂
     */
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(node.children[index]==null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for(int i=0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(node.children[index]==null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEnd;
    }


    public boolean startsWith(String prefix) {
        Trie node = this;
        for(int i=0;i<prefix.length();i++) {
            int index = prefix.charAt(i) - 'a';
            if(node.children[index]==null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}
