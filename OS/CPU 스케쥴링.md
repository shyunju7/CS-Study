### π₯ CPU μ€μΌμ₯΄λ¬
---
β λ€μ€ νλ‘κ·Έλ¨ μ΄μμ μ²΄μ κΈ°λ³ΈμΌλ‘, 
    μ΄μμ²΄μ λ CPUλ₯Ό νλ‘μΈμ€ κ°μ κ΅νν¨μΌλ‘μ¨ λ μμ°μ μΌλ‘ κ΄λ¦¬ν¨

β λ€μ€ νλ‘κ·Έλλ°μ λͺ©μ μ `CPU μ΄μ©λ₯ `μ μ΅λννλ κ²

β μ€λΉ νμ μλ νλ‘μΈμ€ μ€ νλλ₯Ό μ νν΄ μ€ννλ μ£Όμ²΄

<br/>

### π μ μ  μ€μΌμ₯΄λ¬ VS λΉμ μ  μ€μΌμ₯΄λ¬

```jsx
μ μ  β CPUλ₯Ό νλ‘μΈμ€ μ°μ μμμ λ°λΌ κ°μ λ‘ λΉΌμμ CPU νμ
λΉμ μ  β CPUκ° νλ‘μΈμ€μ ν λΉλλ©΄ νλ‘μΈμ€ μ’λ£λ λκΈ° μνλ‘ μ νλκΈ° μ κΉμ§ CPU μ μ 
```

<br/>

### π₯Β λΉμ μ  μ€μΌμ₯΄λ§ μκ³ λ¦¬μ¦

---

**1) μ μ μ μ²λ¦¬ μκ³ λ¦¬μ¦ (FCFS, First Come First Seved Scheduling) = FIFO**

β νλ‘μΈμ€κ° μ€λΉ νμ λμ°©ν μμλλ‘ CPUλ₯Ό ν λΉνλ λ°©μ

β λ¨μ ) νκ·  λκΈ°μκ°μ΄ κΈΈμ΄μ§ μ μμ (β λνν μμ€νμ μ ν©νμ§ μμ)

β μ μ²΄ νλ‘μΈμ€λ€μ νκ·  λκΈ°μκ°μ΄ λμ΄λλ νμ (β μ½λ³΄μ΄ νμ) λ°μ

<br/>

**2) μ΅λ¨ μμ μ°μ  μ€μΌμ₯΄λ§ (SJF, Shortest Job First Scheduling)**

β CPU μμ μκ°μ΄ κ°μ₯ μ§§μ νλ‘μΈμ€μκ² λ¨Όμ  CPUλ₯Ό ν λΉ

β νκ·  λκΈ° μκ°μ κ°μ₯ μ§§κ² κ°μ§λ μ΅μ μ μκ³ λ¦¬μ¦μ΄μ§λ§, μ€μ  μ μ©μ λ¬΄λ¦¬ 
    (β μ€μ  μ€ν μκ°(CPU Burst)λ₯Ό μ μ μμ)

β κ°μ₯ κΈ΄ μμ μκ°μ κ°μ§ νλ‘μΈμ€μκ² CPUλ₯Ό ν λΉν΄μ£Όμ§ λͺ»νλ νμ (β κΈ°μ νμ) λ°μ κ°λ₯

```jsx
++ μ μ ν λ°©μμΌλ‘ κ΅¬νλ SJF β `SRTF(Shortest Remain Time First)`
β λ μ§§μ μμ μκ°μ κ°μ§ νλ‘μΈμ€κ°  λμ°©νλ€λ©΄, CPUλ₯Ό λΉΌμμ ν λΉ 
β κ°μ₯ μ΅μνμ λκΈ°μκ°μ λ³΄μ₯
```

<br/>

**3) HRN (Highest Response-ratio Next)**

β SJF λ°©μμ κΈ°μνμμ ν΄κ²°νκΈ° μν΄ `Aging`κΈ°λ²μ μ μ©ν λΉμ μ  λ°©μ

β μ°μ μμ  = (λκΈ°μκ° + μ€νμκ°) / μ€νμκ° (λκΈ°μκ°μ΄ Aging μ­ν )

    κ³μ°λ μ°μ μμ μμΉκ° λμμλ‘ λμ μ°μ μμ λΆμ¬

<br/>

4**) μ°μ μμ μ€μΌμ₯΄λ§ (Priority Scheduling)**

β νλ‘μΈμ€λ§λ€ μ°μ μμ μμ±μ κ°κ² λ¨

β λκΈ°μ€μΈ νλ‘μΈμ€λ€λΌλ¦¬ μ°μ μμ λΉκ΅ν, μ°μ μμ λμ νλ‘μΈμ€κ° λ€μμΌλ‘ μ§ν

β μ°μ μμ μμΉκ° λμμλ‘ μ°μ μμκ° λκ³ , μ°μ μμκ° κ°λ€λ©΄ FIFOλ°©μμΌλ‘ λμν¨

β κΈ°μνμ(Starvation) λ°μν  μ μμ

<br/>

**5) κΈ°μλΆ (Deadline)**

β νλ‘μΈμ€κ° μ¬μ©ν  μ μλ CPUμ μκ°μ μ ν΄μ£Όκ³  μκ° μμ νλ‘μΈμ€λ₯Ό μλ£νλλ‘ νλ κΈ°λ²

β μ£Όμ΄μ§ μκ°μ μ΄κ³Όνμ λ, νλ‘μΈμ€λ μ κ±°λκ±°λ μ²μλΆν° λ€μ μ€ν( β λΆλ΄μ΄ ν° κΈ°λ²)

<br/>

### π₯ μ μ ν μ€μΌμ₯΄λ§ μκ³ λ¦¬μ¦

---

**1) λΌμ΄λ λ‘λΉ μ€μΌμ₯΄λ§(RR, Round Robin)**

β FCFSλ₯Ό μ μ ν κΈ°λ²μΌλ‘ λ³νν μ€μΌμ₯΄λ§μΌλ‘, νλ‘μΈμ€λ§λ€ κ°μ ν¬κΈ°μ CPU μκ°μ ν λΉλ°μ 
    κ· λ±ν CPU μ μ  μκ°μ λ³΄μ₯ (β κ³΅μ ν μ€μΌμ₯΄λ§ κΈ°λ²)

β νλ‘μΈμ€κ° ν λΉλ μκ° λ΄μ μμμ μλ£νμ§ λͺ»νμ κ²½μ°, μ€λΉνμ λ§μ§λ§μΌλ‘ λ³΄λ΄μ Έ λκΈ°

β μλΆν  μμ€νμ μν΄ μ€κ³λ μ€μΌμ₯΄λ§ κΈ°λ²

β ν λΉμκ°μ΄ λλ¬΄ κΈΈλ©΄ FCFSμ κ°μ νμ λ°μ

β ν λΉμκ°μ΄ λλ¬΄ μ§§λ€λ©΄ λ¬Έλ§₯κ΅ν μμ£Ό λ°μνμ¬ μ€λ²ν€λ λ°μ 

<br/>

**2) λ€λ¨κ³ ν μ€μΌμ₯΄λ§ (Multi Level Queue)**

β νλ‘μΈμ€λ€μ νΉμ  κ·Έλ£ΉμΌλ‘ λΆλ¦¬νμ¬, κ° κ·Έλ£Ήλ§λ€ λμμ μΈ νλ₯Ό μ΄μ©ν΄μ μ€μΌμ₯΄λ§ νλ κΈ°λ²

β νΉμ κ·Έλ£Ήμ ν¬κ² μ¬μ©μμ μνΈμμ©νλ μ λ©΄μμκ³Ό νλ©΄μμμΌλ‘ λΆλ¦¬ν¨ 
    (νλ‘μΈμ€ μ’λ₯λ νΉμ±μ λ°λΌ μ¬λ¬κ°λ‘ λΆν  κ°λ₯)

β μ λ©΄μμ νμ νλ‘μΈμ€λ€μ RRκΈ°λ²κ³Ό κ°μ ν¨μ¨μ μ΄κ³  λΉ λ₯Έ μ€ν κΈ°λ² μ¬μ©

β νλ©΄μμ νλ FCFSμ κ°μ κΈ°λ²μΌλ‘ μ§νλ¨

β μ€μλμ λ°λΌ 1μ°¨μ μΌλ‘ μ΄λ€ νμ μ μ₯ν μ§ μ°μ μμ λΆμ¬

    κ° νμμ λ€λ₯Έ μκ³ λ¦¬μ¦μ΄λ μ€μΌμ₯΄λ§ κΈ°λ²μ ν΅ν΄ νμ μ μ₯λ νλ‘μΈμ€λ€μ μ°μ μμ μ ν¨
    (β μ°μ μμ μ²λ¦¬μ λν ν¨μ¨μ± λμΌ μ μμ)

β λ¨μ ) νλ² νμ λ€μ΄κ°λ©΄ μ΄λμ΄λ λ³κ²½ λΆκ°λ₯μΌλ‘ μ μ°μ± λ?μ

β μ₯μ ) μ€λ²ν€λκ° μ κ² λ°μν¨

<br/>

**3) λ€λ¨κ³ νΌλλ°± ν μ€μΌμ₯΄λ§ (Multi Level Feedback Queue)**

β MLQμ λ¨μ μ κ°μ νμ¬ μλ‘ λ€λ₯Έ νλ‘ μ΄λν  μ μλ λ°©μ

β 1μ°¨μ μΌλ‘ κ°μ₯ μ€μν μμμΈ νλ‘μΈμ€λ€μ λͺ¨μ νμ λ£μ

β λͺ¨μμ§ νλ RRκΈ°λ²μ μν΄ μ€μΌμ₯΄λ§λλ©°, μλ£νμ§ λͺ»νμ κ²½μ° λ€μ νλ‘ λμ΄κ°

β μ κ³Όμ μμλ μ²λ¦¬λμ§ λͺ»νμλ€λ©΄ κ°μ₯ μ€μλκ° λ?λ€κ³  νλ¨λλ νμ μ΅μ’μ μΌλ‘ λ€μ΄κ°λ©°
    FCFSκΈ°λ²μΌλ‘ μ²λ¦¬λ¨

β RRκΈ°λ²μ ν λΉ μκ°μ λ³΄κ³  μ°μ μμλ₯Ό μμΈ‘νκ³  λ³κ²½νλ©΄μ μ¬μ©νλ κΈ°λ²
