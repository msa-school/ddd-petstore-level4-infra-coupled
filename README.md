# 시작하기

## Base Project 다운로드 및 실행
먼저, 새로운 브라우저 탭을 열고, base project 를 gitpod 로 접속합니다
https://gitpod.io/#https://github.com/msa-school/ddd-petstore-level3-oop-polymorphism

GidPod 내에 터미널을 열고(왼쪽 상단의 햄버거 버튼 > Terminal > New Terminal), 프로젝트가 잘 컴파일 되는지 확인합니다:
```
mvn spring-boot:run
```

## 미션
- Pet 데이터에 대한 Database 입출력을 하기 위한 Repository 를 구현하라
- Oracle SQL 에서  Mysql 용 SQL 로 전환될 때 도메인 로직에 인프라에 대한 영향도가 어떠한지 평가하라

## 문제: 
- 인프라 구현에 관련된 코드들과 도메인 코드들이 하나의 패키지내에 혼합되어 구현된 구조 
- 도메인 코드만으로 동작할 수 있는 분리된 테스트가 불가
- 인프라 변경에 따라 서로간에 영향도가 생길 수 있는 구조

## 다음
- https://github.com/msa-school/ddd-petstore-level5-layered
