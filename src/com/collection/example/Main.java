package com.collection.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(10,"Alice","HR"));
        personList.add(new Person(15,"Bob","IT"));
        personList.add(new Person(19,"John","HR"));
        personList.add(new Person(20,"Rita","IT"));

        Map<Integer, Person> personMap = new HashMap<>();
        personMap = personList.stream().collect(Collectors.toMap(Person::getAge,Function.identity()));
        System.out.println(personMap);

        Map<String,List<Person>> personDeptMap = new HashMap<>();
        personDeptMap = personList.stream().collect(Collectors.groupingBy(Person::getDepartment));
        System.out.println(personDeptMap);

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> fruitCounts = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(fruitCounts);
        fruitCounts.forEach((fruit, count) -> System.out.println(fruit + ": " + count));

        Map<Integer, Set<String>> grpEx = personList.stream().
                collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toSet())));
        System.out.println(grpEx);

        Map<Integer, HashSet<String>> grpExSortingSet = personList.stream().collect(
                Collectors.groupingBy(
                        Person::getAge,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Person::getName,Collectors.toList()),
                                set -> {
                                    set.sort(Comparator.naturalOrder());
                                    return set.stream().collect(Collectors.toCollection(HashSet::new));
                                })));


        Map<Integer, List<String>> grpExSortingList = personList.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Person::getName, Collectors.toList()),
                                list -> {
                                    list.sort(Comparator.naturalOrder());
                                    return list.stream().collect(Collectors.toList());
                                }
                        )
                ));
        System.out.println(grpExSortingList);


       List<Person> personAcctNum = new ArrayList<>();
        personAcctNum.add(new Person(10, new MTN(),"7867936791","HR", "Alice"));
        personAcctNum.add(new Person(13, new MTN(),"5643123578","IT", "Aadav"));
        personAcctNum.add(new Person(19, new MTN(),"9875323569","IT", "Vais"));
        personAcctNum.add(new Person(20, new MTN(),"2345678901","School", "Bob"));
        personAcctNum.add(new Person(22, new MTN(),"9876543210","Office", "John"));

        Map<String, List<MTN>> mtnList = new HashMap<String, List<MTN>>();
        mtnList = personAcctNum.stream().
                collect(Collectors.groupingBy(Person::getAcctNumber,
                        Collectors.mapping(Person::getMtn,Collectors.toList())));
        System.out.println(mtnList);
        mtnList.forEach((acct,mtnlst)->System.out.println(acct+" "+mtnlst));
    }
}