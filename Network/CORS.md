## 💡 CORS(Cross-Origin Resource Share)

[MDN - 교차 출처 리소스 공유 (CORS)](https://developer.mozilla.org/ko/docs/Web/HTTP/CORS)
```jsx
추가 HTTP 헤더를 사용하여 한 출처에서 실행중인 웹 애플리케이션이 다른 출처의 선택한 자원에 접근할 수 있는 권한을 부여하도록 브라우저에 알려주는 체제
```


* 출처(origin)은 `protocol`, `host`, `port` 로 구성이 되어 있는데, 세가지 모두 같을 때 동일 출처

<br/>

### 🔥 CORS 접근 제어 시나리오(CORS 동작 방식)

**1) 프리플라이트 요청(Preflight Request)**

→ 예비요청과 본요청으로 나누어 요청하는 방식

→ `option` 메서드를 사용해서 다른 도메인 리소스 요청 가능한지 확인후, 실제 요청 전송

→ 일반적으로 가장 많이 마주치는 시나리오

** **OPTIONS Method**

```jsx
사전 요청을 보내 서버가 해당 파라미터를 포함한 요청을 보내도 되는지에 대한 응답
```

<br/>

**2) 단순 요청(Simple Request)**

→ 정식 명칭은 없지만, MDN의 CORS 문서 참고해서 `Simple Request`

→ 프리플라이트 요청과 비슷하지만, 예비 요청 존재 유무 차이

→ 아래 요청을 만족한 상태에서만 단순 요청 가능(예비 요청 생략 가능)

** **조건**

```jsx
GET POST HEAD 중 하나의 메서드

`Accept` `Accept-Language` `Content-Language` `Content-Type` HEADER 만 허용

`application/x-www-form-urlencoded` `multipart/form-data` `text/plain` 
Content-Type 만 허용
```

<br/>

**3) 인증정보 포함 요청(Credentialed Request)**

→ 인증 관련 헤더를 포함할 때 사용하는 요청

→ ex) XMLHttpRequest 객체나 fetch API 옵션에 사용(기본적으로 쿠기 정보나 인증 관련 헤더 x)

```jsx
creditionals : 'omit'; // 쿠키 전송 x
creditionals : 'same-origin'; // 동일 출처라면 user creditionals 전송 O
creditionals : 'incldue'; // cross-origin이라도 user creditionals 전송 O
```

<br/>

### 🔥 CORS 해결 방법

**1) `Access-Control-Allow-Origin` 응답 헤더 설정하기**

```jsx
Access-Control-Allow-Origin: *
Access-Control-Allow-Origin: <origin>
```

<br/>

**2) `webpack-dev-server` 에 `proxy` 설정하기 🔥**

→ webpack.config 파일에서 proxy 설정

```jsx
* webpack-dev-server는 코드가 변경되면 빌드하여 결과를 확인할 수 있는 개발용 서버 제공
빠른 속도로 변경된 코드를 개발 서버에 반영해서 보여줌(파일 생성 x, 메모리 로드)
```

<br/>

**3) package.json에 `proxy` 설정하기 🔥**

→ CRA로 생성한 프로젝트에서 package.json에 proxy를 설정함으로서 간단히 해결할 수 있음

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
