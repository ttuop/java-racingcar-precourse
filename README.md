# 자동차 경주 게임

## 진행 방법

* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

* 게임 구성 요소
    * 연료 클래스
        * 숫자가 4이상이면 충분
        * 숫자가 3이하면 불충분
        * 숫자가 0~9 외이면 예외
    * 엔진 클래스
        * 연료가 충분하면 이동
        * 연료 유효성 체크
    * 마일리지 클래스
        * 이동 거리를 저장
    * 자동차 이름 클래스
        * 이름 유효성 체크
    * 자동차 클래스
        * 이름, 마일리지, 엔진 객체를 저장
        * 자동차 이름과 이동 거리 출력
* 게임 기능
    * 사용자가 입력한 자동차 이름으로 자동차 생성
    * 0~9 사이 숫자를 랜덤으로 생성해서 등록된 자동차 이동
    * 등록된 자동차를 상태 출력
    * 우승 자동차 이름 출력
* 사용자 기능
    * 자동차 이름 입력
        * 쉼표로 분리된 이름 입력
        * 이름은 5자 이하 제한
    * 자동자 이동 횟수 입력
