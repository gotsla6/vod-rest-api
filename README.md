# 비디오 서비스(VOD) REST API

## 1) 작업 범위
- REST API 설계 및 개발
- API/코드 문서화(Swagger): http://localhost:8080/swagger-ui.html
- 테스트 코드(Swagger)

## 2) 개발 환경
- 기본 환경
    * IDE: IDE: IntelliJ IDEA Ultimate
    * OS: Mac OS X
    * GIT
    * Swagger 2.9.2
- Server
    * Java8
    * Spring Boot 2.5.1
    * JPA
    * Lombok
    * H2
    * Gradle
  

## 3) 테스트 방법
  * 패키지 리스트 조회 (http://localhost:8080/packages)
    swagger url 접속 후 Execute 실행    
    http://localhost:8080/swagger-ui.html#/package-controller
    
    
  * 챕터 리스트 조회 (http://localhost:8080/chapters/{packageId})
    swagger url 접속 후, packageId 값에 1~3 값 입력하여 Execute 실행    
    http://localhost:8080/swagger-ui.html#/chapter-controller
    
  * 영상 리스트 조회 (http://localhost:8080/videos/{chapterId})
    swagger url 접속 후, chapterId 값에 1~8 값 입력하여 Execute 실행   
    http://localhost:8080/swagger-ui.html#/video-controller
    
  * 영상 제목 혹은 태그 검색 
    http://localhost:8080/swagger-ui.html#/video-controller

    1) 제목 검색 (http://localhost:8080/videos/search?title={title})
       swagger url 접속 후, title 값에 찾고 싶은 제목을 입력 후 Execute 실행
       
    2) 태그 검색 (http://localhost:8080/videos/search?tag=fun)
       swagger url 접속 후, tag 값에 찾고 싶은 태그를 입력 후 Execute 실행