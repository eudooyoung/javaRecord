package com.multi.collection.a_basic;

import java.util.*;

public class Exec01 {
    public static void main(String[] args) {
        //List
        // ArrayList는 List중에서도 가장 많이 쓰이는  List이다.

        // Vector는 동기화를 제공해준다. --> 두개의 스레드가 동시에 접근한다고 했을 때 한번에 한 스레드가 접근하도록 하니깐 데이터의 안정성을 놓고 봤을 때 좋다.
        //                       하지만 이런 경우는 복수의 사용자가 존재 할 때 좋은 거지
        //                       애초에 한명의 사용자가 사용할 경우 동기화가 필요 없는데도 이를 고려해서 처리하게 되기 때문에 성능의 저하를 가져온다.
        // 이를 보완해서 나온게 ArrayList이다.
        // 근데 왜 아직도 Vector라는 개념이 없어지지 않고 존재하냐라고 한다면 이를 바탕으로 만들어진 프로그램들이 아직 존재하기 때문에 호환성을 위해 남겨놓은 것이다.

        // LinkedList는 데이터와 데이터를 체인처럼 관리하는 것이다.
        // 그래서 특정 인덱스에서 객체를 삭제하거나 추가 할 때 굉장히 편한데
        // 왜냐하면 내가 작업하고자 하는 인덱스의 인스턴스 앞뒤를 자동으로 인지해주고 있어서
        // 내가 해당 인스턴스를 삭제했을 경우 앞뒤의 링크만 연결해주는 작업을 내부적으로 해주기 때문에...
        // 그래서 만약 삭제나 삽입이 좀 자주 일어난다 하는 경우 LinkedList 사용

        LinkedList a1 = new LinkedList();  // list interface 확인
//        Vector a1 = new Vector();
//        ArrayList a1 = new ArrayList(); // 다양한 자료형을 담을 수 있음

        a1.add(100); // Object > Integer > int .. 오토 언박싱?
        a1.add(200);
        a1.add("제니");
        a1.add(100.0);
        a1.add(true);

        System.out.println(a1);  // toString 재정의?
        System.out.println(a1.get(0));
        System.out.println(a1.size());

        a1.remove(0);
        System.out.println(a1);

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        System.out.println(a1.indexOf("제니")); // 찾고자하는 값의 인덱스를 찾을 때, 1번 인덱스에 저장되어 있음

        System.out.println(a1.contains("제니")); // 포함 되어 있는지 확인
        System.out.println();
//        a1.clear();
//        System.out.println(a1);
//        System.out.println(a1.get(0));

        for (Object o : a1) { // Object 타입으로 받음
            System.out.println(o);
            if (o instanceof String str) {
                System.out.println("instanceof: " + str);
            }
        }

        /*
         * 1. Hash (hash알고리즘 도입) :
         *     데이터의 검색 성능 향상을 위해서 사용
         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 2. Set
         *     - 순서유지 안됨, 중복 저장이 되지 않는다.(수학에서의 집합 개념)
         *     - 종류로는 HashSet, LinkedHashSet, TreeSet이 있다.
         *
         * 3. HashSet
         *     - 순서가 존재하지 않는다.
         *         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 4. LinkedHashSet
         *     - 넣는 순서가 유지 된다.
         *         *     (hashCode와 equals를 모두 오버라이딩 해야한다.)

         * 5. TreeSet
         *     - 정렬기준대로 순서가 정해짐(기본 오름차순)
         *     - hashCode()와 equals()를 오버라이딩 할 필요 없이 알아서 중복저장 되지 않는다.
         *     - 세팅은 해 주어야 됨(Comparable이나 Comparator 구현 클래스)
         *
         *
         */

        System.out.println();
        HashSet a2 = new HashSet(); // set: 중복되지 않음

//        for(int i = 0; i< a1.size(); i++) {
//            a2.add(a1.get(i));
//        }
//        System.out.println(a2);

        a2.add("제니"); // Object 타입으로 담는다.
        System.out.println(a2);

        a2.addAll(a1); // collection 타입으로 담는다
        System.out.println(a2);

//        a2.clear();
//        System.out.println(a2);
        System.out.println();
        for (Object o : a2) {
            System.out.println(o);
        }

        System.out.println();
        Iterator it = a2.iterator(); // Iterator 형식으로
        while (it.hasNext()) { // 다음에 꺼낼 요소가 있는지 확인
            System.out.println(it.next()); // 현재 요소를 꺼냄
        }

        //map - 매핍시킨다. 연결시킨다.
        //키 : 값의 쌍으로 매핑시켜서 연결시켜서 저장함.
        /*
         * Map :
         * 데이터를 저장할때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는 자료 구조 클래스.
         * 해당객체를 저장할때 key(고유의값 ) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다.
         * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties 등이 있다.
         *
         * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다.
         *   (ID는 중복 불가능, 즉 Set과 관련이 있음을 알 수 있다.)
         *
         * - key와 value를 묶어서 Entry라고 한다. */
        System.out.println();
        HashMap map = new HashMap(); // map 은 별도의 컬렉션 인터페이스
        map.put("apple", "사과"); // (키값, 밸류값)
        map.put("banana", "바나나");
        map.put("apple", "오렌지"); // 최신 값으로 덮어씌움

        System.out.println(map);
        System.out.println(map.get("banana"));

        map.remove("apple");
        System.out.println("apple에 저장된 밸류 삭제: ");
        System.out.println(map);
        System.out.println("바나나를 도쿄바나나로 교체");
        map.replace("banana", "바나나", "도쿄바나나");
        System.out.println(map);

        System.out.println();
        map.put("banana1", "바나나");
        map.put("banana2", "바나나");

//        2.map 출력방식 1
        Set entrySet = map.entrySet(); // set 형태로 바꿔줌
        Iterator it2 = entrySet.iterator();

        while(it2.hasNext()) {
//            System.out.println(it2.next());
            Map.Entry entry = (Map.Entry)it2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

//            String key = (String)it2.next();
//            System.out.println(map.get(key));
        }

//        2.
        Set keySet = map.keySet();
        Iterator it3 = keySet.iterator();
        while (it3.hasNext()) {
//            System.out.println(it3.next());
            String key = (String)it3.next();
            System.out.println(map.get(key));
        }

//        3.
        Collection values = map.values();
        Iterator it4 = values.iterator();
        while(it4.hasNext()){
            System.out.println(it4.next());
        }

        // LinkedList는 Queue 인터페이스를 구현하므로,
        // 큐의 기능인 FIFO(First-In-First-Out) 원칙에 따라 요소를 추가하고 제거하는 메서드 사용

        LinkedList<String> milk = new LinkedList<>(); // generic ... queue

        milk.add("111");
        milk.add("222");
        milk.add("333");

        System.out.println(milk);

        milk.addLast("상한 우유"); // addLast: 뒤에 추가
        milk.addFirst("신선한 우유"); // addFirst: 앞에 추가
        milk.addLast("상한 우유"); // addLast: 뒤에 추가
        milk.addFirst("신선한 우유");

        System.out.println(milk);

        System.out.println();
        milk.removeFirst();
        milk.removeLast();
        System.out.println(milk); // 앞, 뒤 삭제

        milk.remove(); // 먼저 들어온게 먼저 삭제됨
        milk.remove();
        milk.remove();

        System.out.println(milk);
        for(String s : milk) {
            System.out.println(s);
        }

        //Stack (후입선출 - LIFO)
        //        Stack은 Vector를 상속받아 구현되었으며, LIFO(Last-In, First-Out) 방식으로 동작한다.
        //        push(), pop(), peek() 등의 메서드를 제공한다.
        //

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop(); // 마지막에 추가된 값 제거: 3
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        // Queue 계열 (선입선출 - FIFO)
    //        Queue는 FIFO(First-In, First-Out) 방식으로 동작하는 자료구조다.
    //                요소가 추가된 순서대로 처리된다.

        Queue<String> queue = new LinkedList<>();
        queue.add("111");
        queue.add("222");
        queue.add("333");

        queue.poll(); // 먼저 추가된 값부터 제거: "111"
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

//        Deque (Double Ended Queue) 인터페이스를 구현하는 ArrayDeque 또는 LinkedList를 사용하여
//        양방향에서 요소를 추가 및 제거할 수 있다.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);

        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
