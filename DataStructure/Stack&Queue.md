## πΒ μ€ν(Stack)

<p align="center">
  <img width="560" height="400" src="https://user-images.githubusercontent.com/38373150/157583608-cd59ac41-8e8f-4ffa-ab83-10e8eca76b1a.jpeg">
</p>




β λ°μ΄ν°λ₯Ό μ°¨κ³‘μ°¨κ³‘ μμμ¬λ¦° ννλ‘ μλ£ κ΅¬μ±

β νμμ μΆ, LIFO(Last-in-First-out)

β λ°μ΄ν° μ½μκ³Ό μ­μ κ° ν λ°©ν₯μμλ§ μ΄λ£¨μ΄μ§λ μλ£κ΅¬μ‘°

β μ½μκ³Ό μ­μ κ° λ°μνλ μμΉλ₯Ό `top` μ΄λΌκ³  ν¨

β μλ£ μ½μμ, `push` μλ£ μ­μ μ, `pop`

β ex) λΈλΌμ°μ  λ€λ‘κ°κΈ° / undo / Android Activity λ±

<br/>

++π‘ `stackUnderflow` μ `stackOverflow` μμλκΈ°

```jsx
stackUnderflow - λμ΄μμ μ­μ λ  μλ£κ° μλλ° pop
stackOverflow - μ€νμ ν¬κΈ° μ΄μμ μλ£λ₯Ό push 
```

<br/>

## πΒ ν(Queue)

<p align="center">
  <img width="560" height="400" src="https://user-images.githubusercontent.com/38373150/157584989-4e400ab1-5dc3-4522-bcd5-4fea7731b5d9.jpeg">
</p>




β μ μμ μΆ, FIFO(First-in-First-out)

β λ°μ΄ν° μ½μ μ°μ°μ `Enqueue` , λ°μ΄ν° μ­μ  μ°μ°μ `Dequeue` λΌκ³  ν¨

β λ°μ΄ν° μ­μ  μ°μ°μ μΆκ΅¬μΈ `front` μμλ§ μν, λ°μ΄ν° μ½μ μ°μ°μ μκ΅¬μΈ `rear` μμ μν

β ex) νλ‘μΈμ€ κ΄λ¦¬, μ°μ μμκ° κ°μ μμ
