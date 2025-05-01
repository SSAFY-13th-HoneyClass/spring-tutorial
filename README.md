# spring-tutorial
spring boot 튜토리얼
## 🌱 1차시 미션

### 1️⃣ spring-tutorial를 완료하자!
![image.png](img/1%EC%A3%BC%EC%B0%A8/image.png)
![image (1).png](img/1%EC%A3%BC%EC%B0%A8/image%20%281%29.png)
![image (2).png](img/1%EC%A3%BC%EC%B0%A8/image%20%282%29.png)

### 2️⃣ spring이 지원하는 기술들(IoC/DI, AOP, PSA 등)을 자유롭게 조사해요

세션 자료에 있는 내용에 추가적으로 본인만의 언어로 기술해주세요

예제 코드까지 추가해주시면 👍

IoC (Inversion of Control, 제어의 역전)
프로그램의 흐름 제어 권한을 개발자가 아니라 스프링이 하는 것이다.
객체 생성, 초기화, 의존관계 연결 등을 대신 해줌
객체를 개발자가 직접 new 하지 않아도 프레임워크가 알아서 new 해서 넣어준다.

DI (Dependency Injection, 의존성 주입)
IoC의 구체적 방법 중 하나이다.
객체가 다른 객체를 직접 생성하지 않고, 필요한 객체를 외부로부터 주입받는 것이다.
생성자, 필드, Setter 주입이 있는데 불변성 보장 및 테스트 용이성으로 생성자 주입을 추천한다. 

AOP (Aspect-Oriented Programming, 관점 지향 프로그래밍)
공통적으로 필요한 기능(로깅, 트랜잭션, 보안 등)을 핵심 비즈니스 로직과 분리하는 방법이다.
메인 기능인 종단 관심사에다가 부가 기능인 횡단 관심사를 공통된 부분에 끼워넣는다.
예를 들어 비밀번호 암호화를 할 때 메인 로직에는 로그인 및 회원가입 기능만 처리한다.
부가 기능인 비밀번호 암호화는 로그인 및 회원가입에 끼워넣는 방식이다.

PSA (Portable Service Abstraction)
다양한 기술에 대해 통합된 추상화를 제공하는 것이다.

데이터베이스 접근, 트랜잭션 처리, 파일 업로드 등 개발자는 Spring 인터페이스만 다루면 된다.

### 3️⃣ Spring Bean 이 무엇이고, Bean 의 라이프사이클은 어떻게 되는지 조사해요

Spring Bean 이란?
Spring IoC 컨테이너에 의해 관리되는 객체

일반적으로 @Component, @Service, @Repository, @Controller 등 어노테이션을 통해 등록함
등록되면 ApplicationContext가 관리함

Bean의 생명주기 (Lifecycle)

1. 객체 생성: <br>
new로 인스턴스 생성 (ex. MemberService memberService = new MemberService() 와 비슷하게 생성)<br><br>
2. 의존성 주입 (DI):<br> 
필요한 의존성을 주입 (@Autowired)<br><br>
3. 초기화 작업: <br>
@PostConstruct로 초기 설정<br><br>
4. 사용: <br>
클라이언트 요청에 따라 사용<br><br>
5. 소멸(정리): <br>
컨테이너 종료 시 @PreDestroy 메서드 호출<br><br>

### 4️⃣ 스프링 어노테이션을 심층 분석해요

- 어노테이션이란 무엇이며, Java에서 어떻게 구현될까요? <br>
주석처럼 메타데이터를 코드에 추가하는 것.
컴파일러나 런타임에 특별한 처리를 할 수 있게 함.
- 스프링에서 어노테이션을 통해 Bean을 등록할 때, 어떤 일련의 과정이 일어나는지 탐구해보세요.
@Component, @Service, @Repository, @Controller 등을 붙이면
ComponentScan이 클래스를 자동으로 찾아서 Bean으로 등록
- `@ComponentScan` 과 같은 어노테이션을 사용하여 스프링이 컴포넌트를 어떻게 탐색하고 찾는지의 과정을 깊게 파헤쳐보세요.<br><br>
흐름<br>
@ComponentScan 선언된 위치부터 하위 패키지를 스캔<br>
@Component가 붙은 클래스를 발견<br>
해당 클래스를 Bean으로 등록 (싱글톤 객체로 관리)<br><br>

- 어떻게 어노테이션을 내가 원하는 기능으로 커스텀할 수 있는 지 알아봐요.<br>
메타 어노테이션 사용<br>
```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface MyService {
}
```

### 5️⃣ **단위 테스트와 통합 테스트 탐구**

- 단위 테스트와 통합 테스트의 의미를 알아봅시다!
## 단위 테스트(Unit Test)
  가장 작은 단위(메서드, 클래스)를 독립적으로 검증

외부 시스템(DB, 네트워크 등)과 격리

특징

빠르다

실패 원인을 찾기 쉽다

## 통합 테스트(Integration Test)
여러 컴포넌트가 서로 정상적으로 작동하는지 검증

실제 DB, 네트워크 등과 연결

특징

느리다

실패 원인을 파악하기 어렵다