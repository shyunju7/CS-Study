## ๐กย CORS(Cross-Origin Resource Share)

[MDN - ๊ต์ฐจ ์ถ์ฒ ๋ฆฌ์์ค ๊ณต์  (CORS)](https://developer.mozilla.org/ko/docs/Web/HTTP/CORS)
```jsx
์ถ๊ฐ HTTP ํค๋๋ฅผ ์ฌ์ฉํ์ฌ ํ ์ถ์ฒ์์ ์คํ์ค์ธ ์น ์ ํ๋ฆฌ์ผ์ด์์ด ๋ค๋ฅธ ์ถ์ฒ์ ์ ํํ ์์์ ์ ๊ทผํ  ์ ์๋ ๊ถํ์ ๋ถ์ฌํ๋๋ก ๋ธ๋ผ์ฐ์ ์ ์๋ ค์ฃผ๋ ์ฒด์ 
```


* ์ถ์ฒ(origin)์ `protocol`, `host`, `port` ๋ก ๊ตฌ์ฑ์ด ๋์ด ์๋๋ฐ, ์ธ๊ฐ์ง ๋ชจ๋ ๊ฐ์ ๋ ๋์ผ ์ถ์ฒ

<br/>

### ๐ฅย CORS ์ ๊ทผ ์ ์ด ์๋๋ฆฌ์ค(CORS ๋์ ๋ฐฉ์)

**1) ํ๋ฆฌํ๋ผ์ดํธ ์์ฒญ(Preflight Request)**

โ ์๋น์์ฒญ๊ณผ ๋ณธ์์ฒญ์ผ๋ก ๋๋์ด ์์ฒญํ๋ ๋ฐฉ์

โ `option` ๋ฉ์๋๋ฅผ ์ฌ์ฉํด์ ๋ค๋ฅธ ๋๋ฉ์ธ ๋ฆฌ์์ค ์์ฒญ ๊ฐ๋ฅํ์ง ํ์ธํ, ์ค์  ์์ฒญ ์ ์ก

โ ์ผ๋ฐ์ ์ผ๋ก ๊ฐ์ฅ ๋ง์ด ๋ง์ฃผ์น๋ ์๋๋ฆฌ์ค

** **OPTIONS Method**

```jsx
์ฌ์  ์์ฒญ์ ๋ณด๋ด ์๋ฒ๊ฐ ํด๋น ํ๋ผ๋ฏธํฐ๋ฅผ ํฌํจํ ์์ฒญ์ ๋ณด๋ด๋ ๋๋์ง์ ๋ํ ์๋ต
```

<br/>

**2) ๋จ์ ์์ฒญ(Simple Request)**

โ ์ ์ ๋ช์นญ์ ์์ง๋ง, MDN์ CORS ๋ฌธ์ ์ฐธ๊ณ ํด์ `Simple Request`

โ ํ๋ฆฌํ๋ผ์ดํธ ์์ฒญ๊ณผ ๋น์ทํ์ง๋ง, ์๋น ์์ฒญ ์กด์ฌ ์ ๋ฌด ์ฐจ์ด

โ ์๋ ์์ฒญ์ ๋ง์กฑํ ์ํ์์๋ง ๋จ์ ์์ฒญ ๊ฐ๋ฅ(์๋น ์์ฒญ ์๋ต ๊ฐ๋ฅ)

** **์กฐ๊ฑด**

```jsx
GET POST HEAD ์ค ํ๋์ ๋ฉ์๋

`Accept` `Accept-Language` `Content-Language` `Content-Type` HEADER ๋ง ํ์ฉ

`application/x-www-form-urlencoded` `multipart/form-data` `text/plain` 
Content-Type ๋ง ํ์ฉ
```

<br/>

**3) ์ธ์ฆ์ ๋ณด ํฌํจ ์์ฒญ(Credentialed Request)**

โ ์ธ์ฆ ๊ด๋ จ ํค๋๋ฅผ ํฌํจํ  ๋ ์ฌ์ฉํ๋ ์์ฒญ

โ ex) XMLHttpRequest ๊ฐ์ฒด๋ fetch API ์ต์์ ์ฌ์ฉ(๊ธฐ๋ณธ์ ์ผ๋ก ์ฟ ๊ธฐ ์ ๋ณด๋ ์ธ์ฆ ๊ด๋ จ ํค๋ x)

```jsx
creditionals : 'omit'; // ์ฟ ํค ์ ์ก x
creditionals : 'same-origin'; // ๋์ผ ์ถ์ฒ๋ผ๋ฉด user creditionals ์ ์ก O
creditionals : 'incldue'; // cross-origin์ด๋ผ๋ user creditionals ์ ์ก O
```

<br/>

### ๐ฅย CORS ํด๊ฒฐ ๋ฐฉ๋ฒ

**1) `Access-Control-Allow-Origin` ์๋ต ํค๋ ์ค์ ํ๊ธฐ**

```jsx
Access-Control-Allow-Origin: *
Access-Control-Allow-Origin: <origin>
```

<br/>

**2) `webpack-dev-server` ์ `proxy` ์ค์ ํ๊ธฐ ๐ฅ**

โ webpack.config ํ์ผ์์ proxy ์ค์ 

``` js
devServer: {
    proxy: {
      "/apiโ: {
        target: โhttp://localhost:8080โ,
        changeOrigin: true,
      },
    },
  },
```
<br/>

**3) package.json์ `proxy` ์ค์ ํ๊ธฐ ๐ฅ**

โ CRA๋ก ์์ฑํ ํ๋ก์ ํธ์์ package.json์ proxy๋ฅผ ์ค์ ํจ์ผ๋ก์ ๊ฐ๋จํ ํด๊ฒฐํ  ์ ์์

```jsx
{
  "name": "my-blog",
  "version": "0.1.0",
  "proxy" : "https://velog.io/@shyunju7"
  
  .
  .
  .
}
```
