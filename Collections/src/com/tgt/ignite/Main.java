package com.tgt.ignite;

import java.util.*;

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
            if (i.getSkillSet().contains("sql"))
                System.out.println(i.toString());
        }


        List<IgniteMembers> cloudteam = new ArrayList<>();
        cloudteam.add(new IgniteMembers("Amit", "TGT", 26, gauthamSkillSet));
        cloudteam.add(new IgniteMembers("Arun","TGT", 27, divyaSkillSet));

        Map<String,List<IgniteMembers>> mem = new HashMap<>();
        mem.put("DOJO",igniteMembers);
        mem.put("Cloud",cloudteam);




        for (String dept: mem.keySet()){
            System.out.println( "Department Name: "+ dept);
            System.out.println("-----------------------------------");
            for(IgniteMembers i: mem.get(dept))
                System.out.println(i.toString());
            System.out.println("-----------------------------------");
        }






    }
}
