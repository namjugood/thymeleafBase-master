# thymeleafBase

## 프로젝트 세팅 및 참고사항
---
### 1. Download Zip 또는 git clone
---
### 2. 로컬 pc에 프로젝트를 받아왔다면, eclipse실행
---
### 3. import project
---
##### 1. Existing Gradle Project
##### 2. setting.gradle의 프로젝트이름과 동일한지 확인
  ``` gradle
  rootProject.name = 'demo'
  ```
  ``` gradle
  rootProject.name = '${프로젝트 폴더 이름}
  ```
##### 3. Refresh Gradle Project

##### 4. Boot Dashboard 활성화

##### 5. 추가된 프로젝트 실행

##### 6. 접속 확인
- [타임리프 Hello World](http://localhost:8090/sample/ex1)
- [타임리프 반복문](http://localhost:8090/sample/ex2)
- [로그인폼1](http://localhost:8090/sample/loginForm/login1)
- [로그인폼2](http://localhost:8090/sample/loginForm/login2)
- [로그인폼3](http://localhost:8090/sample/loginForm/login3)
- [로그인폼4](http://localhost:8090/sample/loginForm/login4)
- [로그인폼5](http://localhost:8090/sample/loginForm/login5)
- [로그인폼6](http://localhost:8090/sample/loginForm/login6)
- [로그인폼7](http://localhost:8090/sample/loginForm/login7)
- [로그인폼8](http://localhost:8090/sample/loginForm/login8)
- [ADMIN LTE 메인 1](http://localhost:8090/sample/admin/index)
- [ADMIN LTE 메인 2](http://localhost:8090/sample/admin/index2)
- [ADMIN LTE 메인 3](http://localhost:8090/sample/admin/index3)
---
## 구성 라이브러리 설명

> 부트스트랩 : 기본적인 레이아웃으로 구성된 css 라이브러리
---
> Admin LTE : 부트스트랩 기반으로 자주사용하는 화면구성 템플릿 제공
  >> 차트, 테이블, 검색, 카드, 게시판, 갤러리 프로필 등등...
---
> thymeleaf : jsp와 동일한 메커니즘으로 서버사이드 템플릿 엔진 중 하나
  >> 레거시 spring은 jsp를 주로 해왔기때문에 springboot에서도 jsp가 친숙하지만
  >> jsp보다 가볍고, 문법이 단순하여 springBoot의 표준 템플릿엔진으로 채택되었다.
  >> java진영의 템플릿엔진 중 러닝커브가 가장 낮아 신규프로젝트일 경우, 타임리프를 선택하는 경우가 많음.


---
## Controller 연결 이유
해당 소스는 springBoot의 축약된 기능을 활용하여 Controller를 구성하고 HttpMethod별로
메서드 작성이 가능함을 이용하기 위해 굳이 참고템플릿들을 Controller를 통해 응답하게 함.

더불어 html을 응답하기위해 불필요하게 작성되었던 Controller 소스는 제거됨.

그로인해, @GetMapping에 작성된 경로와 html경로가 동일할 경우
'public void 컨트롤러메소드명'(){} 만해도 자동으로 html을 응답.
> 'spring-boot-starter-thymeleaf'와 'spring-boot-starter-web'이 설정된 경우,
>> 시작경로는 src/main/resources/templates부터
> 
>>> 1. 컨트롤러 전역 경로 설정 @RequestMapping("/sample")
> 
>>> 2. 컨트롤러 메소드 경로 설정 @GetMapping({"/ex1"}) public void ex1() {}
> 
>>> 3. templates/sample/ex1.html을 자동으로 렌더링하여 응답
> 
>>> 1, 2, 3일 경우, localhost:8090/sample/ex1 접속시도시 ex1의 헬로월드 출력 확인가능.

  
    
