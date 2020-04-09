package com.tgt.ignite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<IgniteMembers> igniteMembers = new ArrayList<>();

        Set<String> gauthamSkillSet = new HashSet<>();
        gauthamSkillSet.add("Java");
        gauthamSkillSet.add("Golang");
        gauthamSkillSet.add("HTML");

        Set<String> divyaSkillSet = new HashSet<>();
        divyaSkillSet.add("Java");
        divyaSkillSet.add("SQL");
        divyaSkillSet.add("NOSQL");
        divyaSkillSet.add("AI");

        igniteMembers.add(new IgniteMembers("Gautham","VTU",28,gauthamSkillSet));
        igniteMembers.add(new IgniteMembers("Divya","TGT",25, divyaSkillSet));

        for (IgniteMembers i : igniteMembers){
            
                System.out.println(i.toString());
        }

    }
}
