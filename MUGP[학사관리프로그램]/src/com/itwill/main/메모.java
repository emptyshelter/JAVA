package com.itwill.main;

/**
 * 
 * 애플리케이션은 총 3개의 구조로 나뉘어짐
 * 
 * 1. 보여주기를 위한 층(layer) presentation layer (main) - 메인은 매니저의 참조변수만 가짐
 * 
 * 2. 업무를 주기위한 층 business layer (manager) - dao는 manager쪽으로 무조건 exception을 던져줌
 * (대부분) - 매니저는 dao의 참조변수만 가짐
 * 
 * 3. 0속성을 가진 층 persistance layer (dao)
 * 
 * 
 * 이 구조가 확실해지면 유지보수성이 올라감
 * 
 */
public class 메모 {

}
