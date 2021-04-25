# RUVVE SERVER

<br />

### 언어
java version: 12.0.1 이상

Spring Boot 2.4.5 이상

gradle version: 6.4.1


<br />

### 구성
Spring Boot 기반의 API 서버

<br />

### 환경
- **AWS EC2 (Ubuntu 18.04)**: 실제 어플리케이션이 동작하는 서버 환경
- **AWS RDS (MySQL DB)**: 데이터베이스 저장소
- **AWS S3**: 어플리케이션에서 사용하는 파일을 저장하는 저장소로 파일업로드와 엑셀파일이 저장

<br />

### 빌드 방법
#### Jenkins & Elastic Beanstalk

<br />

#### 직접 빌드

`.env` 파일을 export해서 전역 변수 지정

`./gradlew clean build` 응 이용해서 빌드
  


