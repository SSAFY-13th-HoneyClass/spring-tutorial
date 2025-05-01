# spring-tutorial
spring boot 튜토리얼

<img width="1431" alt="스크린샷 2025-04-29 오후 9 39 14" src="https://github.com/user-attachments/assets/a100f583-9cb9-43b9-b604-e98a295ba255" />

# Spring이 지원하는 핵심 기술들
IoC와 DI는 객체를 개발자가 직접 만들지 않고, Spring이 대신 생성하고 주입해주는 개념입니다. 예를 들어 @Autowired를 사용하면 필요한 객체가 자동으로 주입됩니다. 이렇게 하면 코드가 간결해지고, 의존성 관리가 쉬워집니다.

AOP는 로그, 트랜잭션 같은 공통 기능을 핵심 로직에서 분리해주는 기술입니다. @Aspect와 @Before 같은 어노테이션을 통해 메서드 실행 전후에 특정 로직을 삽입할 수 있습니다.

**PSA(Portable Service Abstraction)**는 데이터베이스, 트랜잭션 같은 기술을 Spring이 추상화해서, 어떤 라이브러리를 쓰든 동일한 방식으로 사용할 수 있게 해줍니다. 예를 들어 JdbcTemplate을 사용하면 DB 종류에 관계없이 동일한 방식으로 코드를 짤 수 있습니다.

# Spring Bean과 생명주기
Spring Bean은 Spring 컨테이너가 생성하고 관리하는 객체를 말합니다. Bean은 보통 @Component, @Service, @Repository 등 어노테이션으로 등록됩니다.

Bean의 생명주기는 다음과 같습니다.

1. 객체 생성

2. 의존성 주입

3. 초기화 (@PostConstruct 사용 가능)

4. 사용

5. 소멸 (@PreDestroy 사용 가능)

이 과정을 통해 객체가 안전하게 생성되고, 필요한 자원을 해제하는 것도 자동화할 수 있습니다.

# 스프링 어노테이션 심층 분석
어노테이션은 메타데이터를 담는 Java 문법입니다. @interface로 선언하며, Spring에서는 어노테이션을 활용해 빈 등록, 주입, 설정 등을 자동화합니다.

Spring에서 @ComponentScan은 지정된 패키지 내부의 @Component, @Service, @Repository 등을 찾아 자동으로 빈으로 등록해줍니다. 이 덕분에 개발자가 일일이 등록하지 않아도 됩니다.

커스텀 어노테이션도 만들 수 있습니다. 예를 들어, @MyService라는 어노테이션을 직접 만들고 @Component를 포함시키면, 이를 붙인 클래스도 자동으로 빈으로 등록됩니다.

# 단위 테스트와 통합 테스트
단위 테스트는 특정 클래스나 메서드 하나만을 테스트하는 것으로, 빠르고 독립적인 테스트가 가능합니다. 예를 들어 JUnit과 Mockito를 사용해 서비스의 특정 로직만 테스트할 수 있습니다.

반면, 통합 테스트는 여러 컴포넌트가 실제로 잘 연결되어 작동하는지를 확인하는 테스트입니다. @SpringBootTest를 사용하면 실제 애플리케이션 컨텍스트가 올라가고, 전체 흐름을 테스트할 수 있습니다.





