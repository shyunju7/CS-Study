## 💙 스택(Stack)

<p align="center">
  <img width="560" height="400" src="https://user-images.githubusercontent.com/38373150/157583608-cd59ac41-8e8f-4ffa-ab83-10e8eca76b1a.jpeg">
</p>




→ 데이터를 차곡차곡 쌓아올린 형태로 자료 구성

→ 후입선출, LIFO(Last-in-First-out)

→ 데이터 삽입과 삭제가 한 방향에서만 이루어지는 자료구조

→ 삽입과 삭제가 발생하는 위치를 `top` 이라고 함

→ 자료 삽입시, `push` 자료 삭제시, `pop`

→ ex) 브라우저 뒤로가기 / undo / Android Activity 등

<br/>

++💡 `stackUnderflow` 와 `stackOverflow` 알아두기

```jsx
stackUnderflow - 더이상의 삭제될 자료가 없는데 pop
stackOverflow - 스택의 크기 이상의 자료를 push 
```

<br/>

## 💙 큐(Queue)

<p align="center">
  <img width="560" height="400" src="https://user-images.githubusercontent.com/38373150/157584989-4e400ab1-5dc3-4522-bcd5-4fea7731b5d9.jpeg">
</p>




→ 선입선출, FIFO(First-in-First-out)

→ 데이터 삽입 연산은 `Enqueue` , 데이터 삭제 연산은 `Dequeue` 라고 함

→ 데이터 삭제 연산은 출구인 `front` 에서만 수행, 데이터 삽입 연산은 입구인 `rear` 에서 수행

→ ex) 프로세스 관리, 우선순위가 같은 작업
