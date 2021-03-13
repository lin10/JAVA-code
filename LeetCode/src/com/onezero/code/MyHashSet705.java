package com.onezero.code;

/**
 *
 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。

 实现 MyHashSet 类：

 void add(key) 向哈希集合中插入值 key 。
 bool contains(key) 返回哈希集合中是否存在这个值 key 。
 void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。

 *
 */

public class MyHashSet705 {
    boolean[] hash;
    /** Initialize your data structure here. */
    public MyHashSet705() {
        hash = new boolean[1008600];
    }

    public void add(int key) {
        hash[key] = true;
    }

    public void remove(int key) {
        hash[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hash[key] == true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
