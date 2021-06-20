package com.onezero.code;

import java.util.*;

public class ThroneInheritance {

    /**
     * 一个王国里住着国王、他的孩子们、他的孙子们等等。
     * 每一个时间点，这个家庭里有人出生也有人死亡。
     * 这个王国有一个明确规定的皇位继承顺序，第一继承人总是国王自己。
     * 我们定义递归函数 Successor(x, curOrder) ，给定一个人 x 和当前的继承顺序，该函数返回 x 的下一继承人。
     *
     */

    private String kingName;
    Map<String, List<String>> map = new HashMap<>();
    Set<String> deathSet = new HashSet<>();

    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        map.put(kingName,new LinkedList<>());
    }

    public void birth(String parentName, String childName) {
        map.get(parentName).add(childName);
        map.put(childName,new LinkedList<>());
    }

    public void death(String name) {
        deathSet.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(result,kingName);
        return result;
    }

    public void dfs(List<String> result, String name){
        if(!deathSet.contains(name)){
            result.add(name);
        }
        for(String subName:map.get(name)){
            dfs(result,subName);
        }
    }
}
