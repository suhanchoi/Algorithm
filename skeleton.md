# Java Skeleton



java skeleton code



```java
// input 
BufferedReader br = new BufferedReader(System.in);
StringTokenizer st = new StringTokenizer(br.readLine());
st.nextToken();

// Sacnner

// length
ary.length; // 배열 길이 반환
str.length(); // 문자열 길이 반환
colletions.size(); // 컬렉션 길이 반환


// String
"str".equals(str);
"str".substring(i,j);
"str".length();


// StringBuilder
StringBuilder sb = new StringBuilder();
sb.append("str");
sb.reverse();
sb.toString();


// Arrays 컬렉션
int[] ary = new int[10];
Arrays.sort(ary); // 배열 정렬
Arrays.sort(ary, Collections.reverseOrder()); // 배열 역정렬

list = Arrays.asList(array);
ary = list.toArray(new String[list.size()]); // array -> List


// 정렬
// Comparable compareTo
// Comparator compare
// return + 이면 바꾸고 - 이면 안바꿈
Arrays.sort(temp, new Comaprator<String>(){
    @Override
    public int compare(String n1, String n2){
        return (n2+n1). compareTo(n1+n2); // 사전순 정렬
    }
});

Collections.sort(list, Collections.reverseOrder());
Collections.sort(list, new Comaprator<ArrayList>(){
    @Override
    public int compare(Integer a, Integer b){
        return a - b;
    }
});


// Math
Math.max();
Math.min();
   

// 형변환
//integer -> String
String str = Integer.toString(num);



// Iterator 이터레이터
Iterator<Integer> it = Collections.iterator();
it.hasNext();
it.next();


// List 
List<Integer> list = new ArrayList<>();
list.add();
list.get();
int[] a = list.toArray(new int[list.size()]); // List -> array



// Map
Map<String, Integer> map = new HashMap<String, Integer>();
map.put("str", 1);
map.get("str");
map.getOrDefault(1, 0)
map.values();
map.containsKey();

// Set
Set<Integer> set = HashSet<Integer>();
set.add(1);
set.contains(1);
set.remove(1);



// Stack 스택
Stack<Integer> st = new Stack<>();
st.push(1);
st.pop();
st.peek();
st.isEmpty();


// Queue 큐
Queue<Integer> q = new LinkedList<>();
q.add(1);
q.poll();
q.peek();
q.isEmpty();



// PriorityQueue 우선순위 큐
PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소가 맨앞, 오름차순
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
pq.offer(1);
pq.poll();
pq.size();
pq.isEmpty();



```



```java
// Algorithm

// dfs stack, 재귀



// bfs queue



// 에라토스테네스의 체 -> 소수(Prime Number)





```

