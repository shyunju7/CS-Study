## ๐ย HTTP method

โ ํด๋ผ์ด์ธํธ๊ฐ ์น ์๋ฒ์๊ฒ ์์ฒญํ๋ ๋ชฉ์ ๊ณผ ์ข๋ฅ๋ฅผ ์๋ฆฌ๋ ์๋จ

โ `GET`, `POST`, `PUT`, `PATCH`, `DELETE` ๋ฑ์ด ์์

<br />

## ๐ย GET๊ณผ POST์ ์ฐจ์ด

### ๐ย GET ๋ฉ์๋

โ ํด๋ผ์ด์ธํธ๊ฐ ์๋ฒ์๊ฒ ์ด๋ค ์ ๋ณด๋ฅผ ์์ฒญํ๊ธฐ ์ํด ์ฌ์ฉ

โ ๋ฐ์ดํฐ๋ฅผ ์ฝ๊ณ , ๊ฒ์ํ  ๋ ์ฌ์ฉํ๋ ๋ฉ์๋ (๋ฐ์ดํฐ ๋ณํ ์์ด ์ฌ์ฉ)

โ ์กฐํ ๋ฐ์ดํฐ์ ๋ํ ์ ๋ณด๋ URL ๋์ ํ๋ฆฌ๋ฏธํฐ๋ฅผ ์ฌ์ฉ(๋ฐ์ดํฐ ๋ธ์ถ ์ํ)

<br />

### ๐ย POST ๋ฉ์๋

โ ๋ฆฌ์์ค๋ฅผ ์์ฑํ๊ฑฐ๋ ์๋ฐ์ดํธ ํ๊ธฐ ์ํด ์๋ฒ์ ๋ฐ์ดํฐ๋ฅผ ๋ณด๋ผ ๋ ์ฌ์ฉ

โ HTTP๋ฉ์ธ์ง์ `Body` ์ ๋ฐ์ดํฐ๋ฅผ ๋ด์ ์ ์ก (`Body` ์ ํ์์ ์์ฒญ ํค๋์ `Content-Type` ์ ํ์)

โ `Body` ๋ ๊ธธ์ด ์ ํ์ด ์๊ธฐ ๋๋ฌธ์ ๋์ฉ๋ ๋ฐ์ดํฐ ์ ์ก์ด ๊ฐ๋ฅํจ

โ ์ ์ก๋๋ ๋ฐ์ดํฐ๊ฐ ๋ธ์ถ๋์ง ์์ `GET` ๋ณด๋ค ์์ 

<br />

### ๐ย GET๊ณผ POST ์ฐจ์ด์ 

|  | GET | POST |
| --- | --- | --- |
| ์บ์ | O | X |
| ์ฌ์ฉ ์์  | ๋ฆฌ์์ค ์์ฒญ | ๋ฆฌ์์ค ์์ฑ/์๋ฐ์ดํธ |
| ๋ฆฌ์์ค ์ ๋ฌ๋ฐฉ์ | QueryString | HTTP Body |
| HTTP ์๋ต ์ฝ๋ | 200 | 201 |
| Idenpotent - ๋ฉฑ๋ฑ๋ฒ์น | O | X |

<br />

++ ๋ฉฑ๋ฑ๋ฒ์น์ด๋, ์ฐ์ฐ์ ์ฌ๋ฌ๋ฒ ์ ์ฉํ๋๋ผ๋ ๊ฒฐ๊ณผ๊ฐ ๋ฌ๋ผ์ง์ง ์์ ์ฑ์ง ์๋ฏธ

<br />

## ๐ย PUT๊ณผ PATHCH ์ฐจ์ด

### ๐ย PUT ๋ฉ์๋

โ ๋ฆฌ์์ค์ด ๋ชจ๋  ๋ฐ์ดํฐ๋ฅผ ์๋ฐ์ดํธ ํ  ๋ ์ฌ์ฉ

โ ๋ฐ์ดํฐ์ ์ผ๋ถ๋ถ๋ง์ ๋ณด๋์ ๊ฒฝ์ฐ, ๋๋จธ์ง ๋ฐ์ดํฐ๋ default ๊ฐ์ผ๋ก ์์ ๋จ(null)

โ ์ ์ฒด ๋ฆฌ์์ค๋ฅผ ์๋ฐ์ดํธ ํ๊ธฐ ๋๋ฌธ์ ๋์ผ ๋ฆฌ์์ ๋ํด ๋ฉฑ๋ฑ์ฑ ์ ์ฉ

```jsx
{
	"name" : "ํด๋ฐ๋ผ๊ธฐ",
	"color" : "๋ธ๋์",
	"count" : 3
}
```

์์ ๋ฐ์ดํฐ๋ฅผ ์ค `count` ๋ฐ์ดํฐ๋ฅผ ์๋ฐ์ดํธํ๊ธฐ ์ํด  `PUT` ์์ฒญ์ ์ฌ์ฉํ๋ค๋ฉด,

```jsx
PUT/flower/1
{
	"name" : "ํด๋ฐ๋ผ๊ธฐ",
	"color" : "๋ธ๋์",
	"count" : 2
}

======================

RESULT
{
	"name" : null,
	"color" : null,
	"count" : 2
}
```

### ๐ย PATCH ๋ฉ์๋

โ ๋ฆฌ์์ค์ ์ผ๋ถ๋ฅผ ์๋ฐ์ดํธ ํ  ๋ ์ฌ์ฉ

โ ๋ฆฌ์์ค์ ์ผ๋ถ๊ฐ ๋ณ๊ฒฝ๋๊ธฐ ๋๋ฌธ์ ๋ฉฑ๋ฑ์ฑ ๋ณด์ฅ x

```jsx
{
	"name" : "ํด๋ฐ๋ผ๊ธฐ",
	"color" : "๋ธ๋์",
	"count" : 3
}
```

์์ ๋ฐ์ดํฐ๋ฅผ ์ค `count` ๋ฐ์ดํฐ๋ฅผ ์๋ฐ์ดํธํ๊ธฐ ์ํด  `PATCH` ์์ฒญ์ ์ฌ์ฉํ๋ค๋ฉด,

```jsx
PATCH/flower/1
{
	"name" : "ํด๋ฐ๋ผ๊ธฐ",
	"color" : "๋ธ๋์",
	"count" : 2
}

======================

RESULT
{
	"name" : "ํด๋ฐ๋ผ๊ธฐ",
	"color" : "๋ธ๋์",
	"count" : 2
}
```
