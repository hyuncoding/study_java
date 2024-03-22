# JAVA
> JAVA1, JAVA2 및 웹개발 강의에서 공부한 Java 관련 내용입니다.
> study_java repository의 공부 내용은 Java 1, 2 강의에서 공부한 내용인 반면,
> 이 repository의 내용은 추후 Spring Boot를 활용한 Java 기반 웹개발을 배우기 위해
> 공부한 내용이므로, Java의 기초 문법도 포함되어 있지만 보다 상위 과정의 내용도 있습니다.


# DAY 01

## 1-1. JAVA - 프로그래밍 언어  

- 프로그래밍 언어는 개발자와 컴퓨터가 소통하기 위한 언어이다.

## 1-2. 소스코드  

- 명령어를 작성해 놓은 것.  
- 개발자와 컴퓨터가 소통할 것을 글로 작성해 놓은 것.

## 1-3. 소스파일  

- 소스코드가 작성되어 있는 파일.

## 1-4. 컴파일  

- 사람의 언어를 컴퓨터 언어로 바꿔주는 작업.

## 1-5. 컴파일러  

- 컴파일을 해주는 프로그램 또는 명령어.

## 1-6. 콘솔  

- 개발자와 컴퓨터가 소통한 결과를 보여주는 창.

## 1-7. 프로그램  

- 소스코드로 잘 짜여진 틀.

### 일반 프로그램

- 프로그램
- OS(운영체제): 하드웨어에 적절한 전기 신호를 흘려주는 역할
- 하드웨어

* 일반 프로그램은 이식성이 나쁘다.

### JAVA 프로그램

- 프로그램
- JVM : JAVA 프로그램을 OS에 맞게 번역한다.
- OS(운영체제): 하드웨어에 적절한 전기 신호를 흘려주는 역할
- 하드웨어

* JAVA 프로그램은 이식성이 좋다.


## 1-8. JVM(Java Virtual Machine)  

- JAVA 프로그램을 실행해줌.

## 1-9. JRE(Java Runtime Environment)  

- JVM을 생성하며, 실행할 때 필요한 라이브러리 파일들을 가지고 있다.

## 1-10. JDK(Java Development Kit)  

- JRE외에 개발에 필요한 도구들을 가지고 있다.  
- 컴파일 명령어와 실행 명령어를 담고 있다.	  

## 1-11. 기본 구조
	프로젝트
		패키지
			클래스(앞글자 대문자)
				메소드(이름())
					소스코드

<hr/>

# DAY 02

## 2-1. 출력 메소드  

	print() : 마지막에 자동 줄바꿈이 되지 않고 아래의 문장과 이어서 출력된다.
	println() : 마지막에 자동으로 줄바꿈된다.
	printf()

## 2-2. 서식 문자(format)  

- 반드시 따옴표 안에서 작성한다.

    	%d : decimal(10진수 정수)
    	%o : ocatal(8진수 정수)
    	%x : hexadecimal(16진수 정수)
    	%f : float(실수)
    	%c : character(문자)
    	%s: String(문자열)

## 2-3. 출력 메소드의 목적  

- 전달받은 데이터 및 전달할 데이터 검사, 오류 발생 지점 구체화 및 검사


## 2-4. 변수: 저장공간

    	x 		        =		      10
    저장공간의	    대입		    값
    이름		      연산자

## 2-5. 자료형(type, 종류)

	자료형	type	  byte	값
	
	정수형	int	    4	    10, 32, 543, -32, 2147483647, ... (21억 정도까지)
	실수형	float	  4	    10.5, -0.9, 0.0, 123.45645, ...
		    double	8	    10.5, -0.9, 0.0, 123.45645, ...
	문자형	char	  2	    '김', 'A', '0', '.', ...
	문자열	String	?	    "양현", "ABC", "A", "0", ...

## 2-6. 변수의 선언  

	type   name    = value;
	자료형 변수명   = 초기값; // 초기화
	자료형 변수명;

	예)
		int x = 10;
	
		x라는 이름의 저장공간이 할당(allocation)되고 그 안에 10이 들어간다.

<hr/>

    RAM(메모리)
    ==========================
    OS Kernel Space
    ==========================
    Stack
    --------------------------
    Free
    --------------------------
    Heap
    ==========================
    BSS
    ==========================
    Data 영역
    ==========================
    Text 영역
    ==========================


	
	int x = 10;
	x라는 이름의 저장공간이 RAM에 할당되고 10이라는 값이 들어간다.

## 2-7. 주소(해시코드)  

	int x = 10;
	x라는 이름의 저장공간이 RAM에 할당되면 고유한 값인 주소값이 부여된다.


## 2-8. 변수의 사용  

	int data = 20; // 저장공간
	data = 30; // 저장공간
	System.out.print(data + 9); // 값
	data = data + 7; // 저장공간, 값
	data - 9; // 값

## 2-9. 변수 선언 시 주의사항  

1. 같은 이름의 변수로 선언할 수 없다.  
2. 초기화를 해준다.  
3. 되도록 선언부에 한꺼번에 선언한다(영역 상단).  


## 2-10. 변수명 주의사항  

- 문자로 시작해야 한다.
- 특수문자는 사용할 수 없다. 단, _는 허용한다.
- 소문자로 시작한다.
- 공백을 사용할 수 없다.
- 되도록 한글은 사용하지 않는다.
- 명사로 사용한다.
- 뜻이 있는 단어를 사용한다.

    	a, b, c, d, e, ... (X)
    	data, number, age, name, ... (O)
    
    	happyDay(카멜 표기법), happy_day(언더바[스네이크] 표기법)

## 2-11. 변수를 사용하는 이유  

1. 반복되는 값을 쉽게 관리할 수 있다.
2. 의미 없는 값을 하나의 정보로 만들기 위해서 사용한다(자료구조).

## 2-12. 상수 : 항상 그대로인 수  

- 값을 변경할 수 없도록 한다.


## 2-13. 상수의 선언  

	final type name = value;

## 2-14. 상수를 사용하는 이유  

1. 의미 없는 값에 의미를 부여하기 위해서  
2. 오타 방지  

## 2-15. 형변환  

- 자동 형변환  
  정수 + 정수 = 실수  
  정수 + 실수 = 실수  
  3 + 0.0 = 3.0  
  5 / 2 = 2  
  5.0 / 2 = 2.5  

  문자 + 정수 = 정수  
  
- 강제 형변환  
  (type)value  
  (double)3  

## 2-16. 문자열 형변환  

1. 다른 자료형을 문자열로  
   
  - 문자열과 다른 일반 자료형을 연결하면 결과는 문자열이 된다.  

2. 문자열을 다른 자료형으로  
   
  - 일반 자료형은 일반 자료형끼리만 형변환이 가능하다.  
  - 문자열 타입은 클래스 타입이므로, 일반 자료형의 클래스타입의 도움을 받아야한다.  

		Integer.parseInt("") => 문자열에서 변환된 정수 값
		Double.parseDouble("") => 문자열에서 변환된 실수 값
		...

## 2-17. 입력   

- 커서가 깜빡이고 있는 상태.  
- 입력하기 전에 출력을 통해 어떤 값을 입력해야할지 사용자에게 알려주어야 한다.  

## 2-18. 입력 클래스  

	Scanner sc = new Scanner(System.in);

<hr/>

# DAY 03

## 3-1. 입력 메소드  

- next() : 사용자가 입력한 문자열 값
  
  - 사용자가 입력한 값 중 공백 또는 줄바꿈 문자를 구분점으로 각 문자열을 분리한다.  
  - 첫 번째 문자열을 첫 번째 next()에 담고  
    두 번째 문자열은 두 번째 next()에 담는다.  

- nextLine() : 사용자가 입력한 문자열 값
  
  - 공백 또는 줄바꿈 문자도 값으로 취급하기 때문에 그대로 입력받는다.

## 3-2. 연산자  

- 기능이 있는 특수문자

## 3-3. 연산자의 우선순위  

	최우선 연산자
	단항 연산자
	산술 연산자
	쉬프트 연산자
	관계 연산자
	논리 연산자
	삼항 연산자
	대입 연산자

## 3-4. 결합성  

- 하나의 수식에 동일한 연산자가 여러 번 사용되면 알맞은 방향으로 결합되어 연산되는 성질.

## 3-5. 논리형(boolean)  

	참 : true
	거짓 : false

	boolean 변수명 = 값(true, false);
	-------
	1byte

## 3-6. 조건식  

- 결과가 참 또는 거짓, 둘 중 하나가 나오는 식.

- 관계 연산자
  
      ==	: 같다
      !=	: 같지 않다
      >, <	: 초과, 미만
      >=, <=	: 이상, 이하

- 논리 연산자
  
      &&, A && B, AND, 두 조건식 모두 참이면 참
      ||, A || B, OR, 둘 중 하나라도 참이면 참

- 단항 연산자
  
      !, !A, NOT, 조건식이 참이면 거짓으로, 거짓이면 참으로 변경

- 삼항 연산자(? :) : 값으로 봐야한다!
  
    	조건식 ? 참 : 거짓
    
    	int result = 10 > 9 ? 10 : 9;
    	단, 참과 거짓 자리에는 값만 작성할 수 있다.

- 삼항 연산자를 사용해야 할 때
  
	 - 조건식이 딱 한 개 있을 때에만 사용하자!

## 3-7. 제어문  

▶ 조건문  

  ▷ if문

          	if(조건식){
          		실행할 문장;
          	}
          	위의 조건식 결과와 상관없이 무조건 검사
          	if(조건식){
          		실행할 문장;
          	}
          	if(조건식){
          		실행할 문장;
          	}...
        
        
          	if(조건식){
          		실행할 문장;
          	}
          	위 조건식이 false일 경우만 검사, 아니면 검사하지 않음.
          	else if(조건식){
          		실행할 문장;
          	}
          	...
          	else {
          		실행할 문장;
          	}


▷ switch문
	
          	switch(값){
          	case 값1:
          		실행할 문장;
          	case 값2:
          		실행할 문장;
          	case 값3:
          		실행할 문장;
          	...
          	default:
          		실행할 문장;
          		break;
          	}

## 3-8. 삼항 연산자, if문, switch문의 비교  
 
- 삼항 연산자: 조건식이 1개 있을 경우 사용  
- if문: 조건식에 비교(>, <, >=, <=) 연산자를 사용하거나, 여러 개의 조건식을 논리 연산자(&&, ||) 사용  
- switch: 하나의 변수에 여러 개의 값이 담길 수 있고, 각 값이 같은 지를 비교할 때 사용  

▶ 반복문
	- 대입 연산자(복합 대입 연산자, 누적 연산자)

    	int money = 10000;
    	// money = money - 1000;	
    	money -= 1000;
    	System.out.println(money);
    
    	int data = 0;
    	// data = data + 1;
    	// data += 1;
    	data++;
    	System.out.println(data);
 
- 증감 연산자
  
   - 전위형 : 해당 라인부터 바로 적용
     
			++data, --data

	 - 후위형 : 다음 라인부터 적용
     
			data++, data--
	


	▷ for문

		for(초기식; 조건식; 증감식){
			실행할 문장;
		}

	▷ while문
	▷ do~while문
 
<hr/>

# DAY 04

## 4-1. 기타 제어문  
 
- break: 즉시 해당 중괄호 영역을 탈출한다.
  
   - if문 안에서 사용 시 if문을 탈출하지 않고 if문을 감싸고 있는 중괄호 영역을 탈출한다.


- continue: 즉시 다음 반복.
  
   - 아래에 작성된 코드를 실행하고 싶지 않을 때 사용한다.

▷ while문  

		while(조건식){
			실행할 문장;
		}

- for문과 while문의 목적
  - for: 몇 번 반복할지 알 때
  - while: 몇 번 반복할지 모를 때

▷ do~while문  

		do {
			실행할 문장;
		} while(조건식);

## 4-2. 배열 : 저장공간의 나열
	
1. 변수를 여러 개 선언하면 이름도 여러 개 생긴다. 이 때 각 저장공간을 관리하기가 불편하다.  
   따라서 n칸 배열을 한 번만 선언하면 저장공간도 n개 생기고, 이름도 한 개이기 때문에 관리하기 편하다.  


2. 규칙성이 없는 값에 규칙성을 부여하기 위해서  


## 4-3. 배열의 선언  

    자료형[] 배열명 = {값1, 값2, 값3, ...}; // 어떤 값을 넣을지 알 때 사용
    자료형[] 배열명 = new 자료형[칸수]; // 어떤 값을 넣을지는 모르나, 몇 칸 만들지는 알 때 사용
    자료형[] 배열명 = null; // 어떤 값을 넣을지도 모르고, 몇 칸 만들지도 모를 때 사용
    배열명 = new 자료형[칸수];
  
    ※ new : Heap 메모리에 할당, 초기값을 자동으로 초기화
    ※ null : 주소의 초기값, 어떤 주소를 넣을지 모를 때 작성하는 값
    ※ 자바에서 배열은 항상 Heap(동적 메모리)에 할당되기 때문에 메모리 상으로는 동적배열만 존재한다.


## 4-4. 배열의 구조  

	int[] arData = {3, 5, 1, 2, 8};

- arData라는 이름의 저장공간은 한 개 만들어지며, 여기에는 한 개의 값만 담을 수 있다.    
- 5개의 값을 담기 위해서는 5칸이 필요하며, 이는 Heap 메모리에 할당된다. 5칸의 저장공간 중    
  첫 번째 주소값이 arData 저장공간으로 들어가며, 다음 주소에 접근하기 위해서는    
  + n을 한다. 예를 들어 arData + 2는 1이라는 값이 담긴 주소값이 되며,    
  \*(arData + 2)는 해당 주소에 가서 읽어온 1이라는 값이 된다. JAVA에서는 직접 주소에 접근하는    
  연산자가 없기 때문에 위와 같은 식을 []로 치환하여 사용하며, arData[2]로 사용한다.    
  각각의 방 번호는 index라고 부르며, 배열은 시작주소를 가지고 있기 때문에 인덱스 번호는 항상 0부터 시작된다.    

## 4-5. length  

- 배열을 선언하면 length라는 상수가 선언되고, 해당 배열의 길이가 담긴다.  
- 배열명.length로 사용하게 된다.  

## 4-6. 배열의 사용  

	int[] arData = new int[5]; // 저장공간
	arData[0] = 10; // 저장공간
	arData[0] + 9; // 값
	System.out.println(arData); // 주소값
	arData[2] = arData[0] + arData[1]; // 저장공간, 값, 값
	System.out.println(arData[5]); // 오류

<hr/>

## DAY 05

## 5-1. 2차원 배열: 배열 안에 배열  

- 1차원 배열을 여러 개 선언할 때 관리하기 힘들기 때문에  
  2차원 배열을 한 번 선언한다.  

  ※ 2차원 배열부터는 메모리 낭비가 심하므로 선호하지 않는다.  

## 5-2. 2차원 배열 선언  

	자료형[][] 배열명 = {{값1, 값2, 값3, ...}, {값4, 값5, 값6, ...}};
	자료형[][] 배열명 = new 자료형[행][열];
	자료형[][] 배열명 = null;
	배열명 = new 자료형[행][열];

	int[][] arrData = new int[2][3];

	□	arrData			arrData.length : 행의 길이
	□□	arrData[행]		arrData[행].length : 열의 길이
	□□□	arrData[행][열]		

	※ 무조건 행부터 접근한다.

## 5-3. 메소드  

- 이름 뒤에 소괄호.  
- 단, 키워드 뒤에 소괄호가 있는 경우는 메소드가 아니다.  

		f	(x) 	= 	2x+1
		메소드의	매개		리턴값
		이름	변수

## 5-4. 메소드 선언  

	(1)리턴타입 (2)메소드명(자료형 (3)매개변수명, ...) {
		(4)실행할 문장;
		(5)return 리턴값;
	}

	(1) 리턴값의 타입을 작성한다, 리턴값이 없으면 void를 작성한다.
	(2) 동사로 작성한다(연필(매개변수)을 쓴다(메소드)).
	(3) 외부에서 전달받을 값이 있다면, 자료형과 순서에 맞게 선언해준다.
	(4) 생략이 가능하다. 메소드의 기능을 구현하는 로직을 작성한다.
	(5) 생략이 가능하다. 리턴값이 있다면, 사용한 부분 통채로를 리턴값으로 봐야한다.

## 5-5. 메소드 선언 순서  

- 문제) 두 정수의 덧셈 메소드 선언

		1. 메소드 이름을 생각한다.
			add(){}
	
		2. 매개변수를 생각한다.
			add(int number1, int number2){}
	
		3. 실행할 문장을 작성한다.
			add(int number1, int number2){
				int result = number1 + number2;
			}
	
		4. 리턴값을 작성한다.
			add(int number1, int number2){
				int result = number1 + number2;
				return result;
			}		
		
		5. 리턴 타입을 결정한다.
			int add(int number1, int number2){
				int result = number1 + number2;
				return result;
			}				

<hr/>

# DAY 06

## 6-1. 메소드 주의사항  

- 메소드를 선언할 때에는 {}(중괄호)가 있으며, 반드시 메소드 밖에서 선언한다.  
- 메소드를 사용할 때에는 {}(중괄호)가 없으며, 반드시 메소드 안에서 사용한다.  

## 6-2. 메소드 사용  

- 메소드의 리턴 타입이 void라면 실행 메소드이므로 값으로 봐서는 안 된다.  
- 메소드의 리턴 타입이 void가 아니라면 사용한 부분 통째로가 리턴값이다.  

## 6-3. 메소드 목적  

1. 재사용(특정성을 부여해서는 절대 안 된다).  
2. 소스코드 간결화   

## 6-4. 리턴해야 할 때  

- 사용한 쪽에 로직의 결과를 전달해야 할 때.  

## 6-5. 리턴하면 안 될 때  

- 사용한 쪽에 로직의 결과를 전달할 필요가 없을 때.  

<hr/>

# DAY 07

## 7-1. 클래스(반)  

- 공통요소를 한 번만 선언해놓고 가져다 사용만 하도록 설계한다.  

1. 타입이다.  
   
- 클래스 안에 선언된 변수와 메소드를 사용하고 싶다면,  
  해당 클래스 타입으로 객체를 선언해야 한다.  

2. 주어이다.
   
- 원숭이가 바나나를 먹는다.

  		Monkey.eat("바나나");

## 7-2. 클래스 선언  

	class 클래스명 {
		필드(변수, 메소드)
	}

## 7-3. 클래스의 필드 사용  

1. 객체화(instance) :
   
	- 객체(instance variable)를 만드는 작업.  
	- 추상적인 개념을 구체화시키는 작업.  
	- 클래스명 객체명 = new 클래스명();  
			     -----------  
				생성자  
	  객체명.필드명;  
	※ .(마침표):   
		- 하위 연산자, 멤버변수 접근 연산자, 닷 연산자, 점 연산자  
		- 주소값 뒤에서만 사용이 가능하며 해당 주소를 참조하는 명령어이다.

2. static 키워드를 사용하여 클래스 이름으로 직접 접근할 수 있다.
   
   - static 필드는 컴파일러가 최초 한 번만 메모리에 올려주기 때문에,  
     객체로 접근할 필요가 없다. 이러한 필드를 static 필드라고 부른다.  

## 7-4. 생성자  

- 클래스 이름 뒤에 소괄호가 있는 형태, 메소드와 기능이 똑같지만 메소드라고 부르지 않는다.  
  생성자는 리턴이라는 기능이 존재하지 않기 때문이다.  

1. 해당 클래스의 필드를 메모리에 할당한 후 부여된 주소값을 가져온다.  

### 기본 생성자  

 	public 클래스명(){}


## 7-5. this  

- 필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근할 수 있다.  
- 이 때 접근한 객체가 가지고 있는 할당된 필드의 주소값이 this라는 변수에 자동으로 담긴다.  


## 7-6. Storage class (저장 기억 부류)  

			Stack			Data영역
			지역변수, 매개변수	전역변수, 정적변수(static)
	
	1. 초기화	직접			자동
	2. 생명주기	}			new, 프로그램 종료


※ static: 모든 객체가 공유해야 하는 필드에서만 사용한다.

## 7-7. 다형성 (polymorphism)  

1. 오버로딩(Overloading)
   
- 매개변수의 개수 또는 타입이 다르면 동일한 이름의 메소드로 선언할 수 있다.


<hr/>

# DAY 08

## 8-1. 클래스 실습(ClassTask2.java)

	학생
		번호
		국어점수
		영어점수
		수학점수
		총점
		평균
	-----------------------------------------------------------------------------------
	상점
		상품명
		상품가격
		재고
	
		판매하기
	
	손님
		이름
		휴대폰번호
		통장잔고
		할인율
	
	상점에서 상품 판매 시
	손님의 할인율을 적용해서 판매
	-----------------------------------------------------------------------------------
	최댓값과 최솟값 구하는 메소드 선언
	
	결과
		최댓값
		최솟값

## 8-2. 상속(Inheritance)  

1. 기존에 선언된 클래스의 필드를 새로 만든 클래스의 필드로 사용하고자 할 때  
2. 여러 클래스 선언 시 필드가 겹칠 때 부모 클래스를 먼저 선언하고  
   공통 필드를 묶어서 자식 클래스들에게 상속해준다(추상화).  


## 8-3. 상속 문법  

	class A {
		A필드
	}

	class B extends A{
		A필드, B필드
	}


	A: 부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스
	B: 자식 클래스, 하위 클래스, 서브 클래스, 파생 클래스

## 8-4. super(): 부모 생성자  

- 자식 클래스 타입의 객체로 부모필드에 접근할 수 있다.  
- 하지만 자식 생성자만 호출하기 때문에, 자식 필드만 메모리에 할당된다고 생각할 수 있다.  
- 사실 자식 생성자에는 항상 부모 생성자를 호출하기 때문에 자식 생성자 호출 시 부모와 자식 필드 모두 메모리에 할당된다.  
- 이 때 부모 생성자를 호출하는 방법은 super()를 사용하는 것이다.  
- 만약, super()를 작성하지 않더라도 컴파일러가 자동으로 작성해준다.  

## 8-5. 다형성(polymorphism)  

1. 오버로딩  
2. 오버라이딩(Overriding)
   
- 부모 필드에서 선언한 메소드를 자식 필드에서 수정하고자 할 때 재정의를 해야 한다.  
- 이는 자식에서 부모 필드의 메소드와 동일한 이름으로 선언하는 것이다.  
  부모 필드가 메모리에 먼저 할당되고 a라는 메소드가 먼저 올라간다고 하면,  
  자식 필드가 메모리에 할당되면서 재정의한 a메소드가 새롭게 만들어지는 것이 아니라  
  기존에 할당된 a메소드 저장공간에 새롭게 정의한 메소드가 담기는 것이다.


<hr/>

# DAY 09

## 9-1. 접근 권한 제어자(접근자)  

	default : 다른 패키지에서 접근 불가
	public : 모든 곳에서 접근 가능, 해당 파일의 메인 클래스일 경우만 사용 가능
	protected : 다른 패키지에서 접근 불가, 자식은 가능
	private : 다른 클래스에서 접근 불가, 메소드(getter, setter)로만 접근하자!

## 9-2. Casting   
> ※ 모든 자식은 부모 타입이다.

1. up casting: 자식 값을 부모 타입으로 형 변환  
2. down casting: up casting된 객체를 자식 타입으로 형변환  
※ 부모 값을 자식 타입으로 형변환 시 오류  


## 9-3. 추상 클래스  

- 필드 안에 구현이 안 된 메소드가 선언되어 있는 클래스를 추상 클래스라고 한다.  
- 이 때 구현되지 않은 메소드를 추상 메소드라고 부른다.  
- 반드시 재정의를 통해 구현을 해야지만 메모리에 할당되기 때문에  
  "강제성"을 부여하기 위해서 추상 메소드로 선언한다.  

## 9-4. 추상 클래스 선언  

	abstract class 클래스명{
		abstract 리턴타입 메소드명(매개변수, ...);
		일반 메소드도 선언 가능
	}


## 9-5. 인터페이스(interface) : 틀  
 
- 추상 클래스를 고도화시킨 문법.  
- 상수와 추상메소드만 존재한다.  
- 구현은 지정한 클래스에서 진행하고, 인터페이스를  
  다른 클래스에 지정할 때에는 implements 키워드를 사용한다.


<hr/>

# DAY 10

## 10-1. 추상 클래스와 인터페이스 간의 관계  

- 인터페이스를 클래스에 바로 지정하면 모든 메소드에 강제성이 부여되어서  
  전부 다 구현해야 한다. 하지만 일반적인 상황에서는 모든 것이 아닌,  
  필요한 메소드를 골라서 재정의해야한다.  
- 인터페이스를 직접 지정하지 않고 다른 클래스에 지정한 후 바디를 만들어 놓는다면,  
  강제성이 소멸되고 이 클래스를 상속받아서 필드를 구현한다면, 골라서 재정의할 수 있게 된다.  
- 이 때 중간에서 강제성을 없애주는 클래스를 추상클래스로 선언하기로 하며,  
  추상클래스 이름 뒤에는 Adapter를 붙여서 목적을 알려준다.  
	

## 10-2. 마커 인터페이스(Marker Interface)  

- 클래스들을 그룹화하기 위한 목적으로 사용한다.  
- 인터페이스는 지정한 클래스의 부모이며, 모든 자식은 부모의 타입이므로  
  마커 인터페이스를 지정받은 클래스들이 하나의 타입으로 묶이게 된다.  
-이름 뒤에 Marker를 붙여줘야 한다.  

## 10-3. 내부 클래스(Inner Class)

- 하나의 클래스에서 a작업과 b작업이 있을 때에는 따로 분리하여 클래스로 만들지 않고,  
  클래스 안에 클래스를 선언하여 설계한다. 이 때 밖에 있는 클래스를 외부 클래스라고 하며,  
  안에 선언된 클래스를 내부 클래스라고 한다. 외부 클래스가 메모리에 할당되어야  
  내부 클래스를 객체화할 수 있기 때문에 클래스를 숨기기 위해서 내부 클래스를 사용하기도 하며,  
  이를 캡슐화 또는 은닉화라고 한다. 내부 클래스는 외부 클래스의 필드이기 때문에  
  외부 클래스의 필드를 자신의 필드처럼 가져다 사용할 수 있지만 상속관계가 아니기 때문에  
  내부 클래스일지라도 extends를 통해 다른 클래스를 상속받아서 사용할 수 있다.  
  
  ※ 어떤 영역 안에 선언된 클래스는 내부 클래스이다.  

## 10-4. 익명 내부 클래스(Anonymous Inner Class)  

- 이름이 없는 클래스이며 구현되지 않은 필드를 구현하기 위해 일회성으로 생성되는 클래스이다.  


## 10-5. 함수형 인터페이스(Functional Interface)  

- 인터페이스 중 추상 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.  
- 이 때 @FunctionalInterface를 인터페이스 위에 작성하여 단 하나의 추상 메소드만  
  선언할 수 있도록 제한해야 한다.  

## 10-6. 람다식(Lambda Expression)  

- 이름이 없는 메소드로서 값처럼 사용이 가능하며, 매개변수로도 전달이 가능하다.  
- 함수형 인터페이스는 추상 메소드가 한 개만 선언되기 때문에 구현할 때 메소드 이름이 필요 없다.  
- 따라서 람다식을 익명 메소드(Anonymous Method)라고도 부른다.  

## 10-7. 람다식 문법  

1. (매개변수 형식 나열, ... ) -> 리턴값;  
2. (매개변수 형식 나열, ... ) -> {2개 이상의 문장 작성; return 리턴값; };  
3. 매개변수가 딱 한 개 있을 경우에만 소괄호 전부 생략 가능  


### 심화 실습  

- 여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 어플리케이션 제작

		입력 예1) 7 + 35 - 9
		출력 예1) 33
		
		입력 예2) -9 + 8 + 10
		출력 예2) 9
		
		* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
		   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
		   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
		   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
		   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
		
		* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
		* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
		* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
		* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
		* main메소드에 getOpers를 람다식으로 구현
		* 첫번째 정수가 음수일 경우 오류 해결

<hr/>

# DAY 11

## 11-1. 예외 처리  

- 컴파일 시, 빌드 시, 런타임 시 오류가 발생하면  
  이를 제어문으로 막을 수 있으나, 제어문으로도 막을 수 없는  
  오류들을 직접 처리할 수 있어야 한다.  


## 11-2. 예외 처리 문법  

	try {
		예외가 발생할 수 있는 문장
		예외가 없을 때 실행할 문장

	} catch(예외이름 객체명){
		예외 발생 시 실행할 문장
	
	} catch(예외이름 객체명){
		예외 발생 시 실행할 문장

	} ...

	} finally {
		예외 발생 여부에 상관없이 무조건 실행할 문장
		※ 외부 장치와 연결했을 경우 다시 닫을 때 주로 사용한다.
	}

## 11-3. 예외 발생  

- 직접 예외를 발생시키기 위해서는 예외 던지기를 사용해야 하며, 이 때에는 생성자 호출 전 throw 키워드를 사용한다.
  
		예) throw new BadWordException();

## 11-4. 사용자 정의 예외  
 
- 기본적으로 제공되는 예외가 아닌 특정 상황에서 직접 예외를 만들어야 한다면, Exception 혹은  
  RuntimeException을 상속받아서 예외 클래스를 선언해야 한다.  
- Exception은 컴파일러가 체크를 하기 때문에 예외처리를 강제로 해야하고,  
  RuntimeException은 컴파일러가 체크하지 않기 때문에 예외처리를 선택할 수 있다.  
	

## 11-5. API(Application Programming Interface)  

- 개발에 필요한 라이브러리들의 집합  
- 선배 개발자들이 만들어 놓은 소스코드  

- 내부 API  
	JDK 설치 시 제공해주는 기본 API  
	docs.oracle.com/javase  

- 외부 API  
	선배 개발자들이 개발한 패키지 및 클래스들을 의미한다.  
	보통 JAR 파일로 배포하며 자바 프로젝트의 build path에 추가하여 사용할 수 있다.

<hr/>

# DAY 12

## 12-1. Object 클래스  

1. toString()
   
	- 항상 객체명을 출력할 때에는 toString()을 붙여서 출력해준다.  
	- 따라서 객체명만 출력메소드에 전달하더라도 toString() 문자열 값이 출력된다.  
	- 기본적으로 Object에서는 소속과 필드 주소를 문자열로 리턴해주지만,  
	  실사용에서는 불필요한 정보이기 때문에, 재정의한 뒤 필드의 정보를 확인하도록 구현한다.  
	- 실무에서는 클래스 선언 시 각 필드의 초기화 여부를 확인하기 위해 toString()을 재정의하여 사용한다.  


2. equals()
   
	- 주소값 비교(==),  
	  객체 주소 비교가 아닌 특정 필드를 비교해야 할 경우 재정의한다.  


3. hashCode()
   
	- JVM에서 관리하는 중복 없는 값. 실제 메모리에 할당되는 주소와 다르다.  
	※ 컬렉션 프레임워크 챕터에서 재정의 목적을 이해하도록 한다.  


## 12-2. 알고리즘  

- 어떤 문제가 발생되었을 때 해결할 수 있는 절차 혹은 순서  

## 12-3. 자료구조(저장공간)  

- 의미 없는 데이터를 하나의 정보로 만들어주는 알고리즘들의 집합.  
  수집한 자료를 저장하는 방법.  

## 12-4. 컬렉션 프레임워크(Collection Framework)  

- 많은 데이터를 쉽고 효과적으로 관리할 수 있는 표준화된 방법을 제공하는 클래스들의 집합.


		1. List extends Collection
			- Vector: 용량 관리, 보안성 강화, 처리량 감소
			- LinkedList: FILO로 인해 넣을 때는 빨라도 원하는 위치의 데이터를 가져오는 것이 상대적으로 느리다.
			- ArrayList: 인덱스로 데이터를 관리한다. 컬렉션 클래스 중 실무에서 가장 많이 사용되는 클래스이다.
				     배열의 특징인 인덱스를 이용하여 값을 저장하고 관리한다.
		
			※ 배열과 ArrayList의 차이
				배열은 길이에 제한을 두어야할 때 자주 사용되고,
				ArrayList는 몇 개의 데이터가 들어올지 알 수 없을 때 사용한다.


<hr/>

# DAY 13

	2. Set extends Collection
	 - HashSet
		집합에서는 중복되는 원소를 포함할 수 없는 것처럼
		HashSet이라는 자료구조는 중복되는 값을 무시한다.
		저장된 값들은 인덱스가 없기 때문에 순서가 없다.
		값의 유무 검사에 특화되어 있는 자료구조이고
		해시코드로 유무 검사가 진행되기 때문에 속도가 상대적으로 좋다.


<hr/>

# DAY 14

	3. Map
	 - HashMap(서버 간 데이터 교환)
		Key와 Value 한 쌍으로 저장되며, 검색의 목적을 가지고 있따.
		Key에 중복된 값을 넣으면 Value가 최근 값으로 수정되고
		중복되지 않은 값을 넣으면 새롭게 추가된다. Value는 중복이 가능하다.


<hr/>

# DAY 15

## 15-1. 프로그램  

> 실행되지 않은 상태.  

## 15-2. 프로세스  
 
> 실행된 프로그램.  

## 15-3. 쓰레드  

> 프로세스 처리 경로  

- 단일 쓰레드   
  
	- 처리 경로를 한 개만 가지고 있기 때문에 직렬적이다.  
	- 동시에 많은 양을 처리하기 힘들기 때문에 상대적으로 비효율적이다.  
	- 하지만 하나의 작업에 문제가 발생하더라도 다른 작업에는 영향을 끼치지 않는다.  
	- 따라서 안전성이 보장되고 설계 시 멀티 쓰레드에 비해 수비다.  

- 멀티 쓰레드  
  
	- 하나의 프로세스를 동시에 처리하는 것처럼 보이지만 사실은 매우 짧은 단위로 분할해서 차례로 처리한다.  
	- 여러 개의 처리 경로를 가질 수 있도록 하며, 동시 작업이 가능해진다.  
	- 설계하기 굉장히 어려우며, 하나의 쓰레드 문제 발생 시 모든 쓰레드에 문제가 발생하게 된다.  
	- JAVA 웹서버가 대표적인 멀티 쓰레드이다. 멀티 쓰레드로 설계했다면, 처리량 증가, 효율성 증가,  
	  처리비용 감소의 장점이 있기 때문에 단점을 감수하고 설계하는 편이다.  

- 멀티 쓰레드 구현 방법
  
	핵심: run() 메소드 재정의  

	1. Thread 클래스 상속  
	2. Runnable 인터페이스 구현  


<hr/>

# DAY 16

## 16-1. 파일 입출력  

- Stream이라는 연결통로를 통해 원본 데이터가 알맞는 인코딩 방식으로 전송된다.  
- byte단위로 입출력되기 때문에 개별처리이며, 상세 연산이 필요하지 않다면  
  Buffer를 사용한 입출력을 권장한다. Buffer를 사용하면 일괄처리가 가능해진다.  

※ 인코딩 방식    
	- 인코딩 방식은 완성형과 조합형이 있다.  
	- 완성형: 각, 간, 갇, 갈, 감, ... , 갛, ...  
	- 조합형: ㄱ + ㅏ + ㄱ  
 
	조합형이 효율적이며 byte단위로 데이터를 전송할 때 고정된 byte가  
	아니기 때문에 가변형 인코딩 방식을 선호한다.  
	조합형이면서 가변형인 인코딩 방식은 UTF-8이며, 전 세계에서 가장 많이  
	사용되는 방식이다.  




## 16-2. Writer(출력)  

- BufferedWriter: 버퍼를 사용한 출력 클래스  
- FileWriter: 전달한 경로의 파일을 출력하기 위한 목적으로 열어준다.  
	      전달한 경로에 파일이 없다면 새롭게 만든 후 열어준다.  

## 16-3. Reader(입력)  

- BufferedReader: 버퍼를 사용한 입력 클래스  
- FileReader: 전달한 경로의 파일을 입력하기 위한 목적으로 열어준다.  
	      전달한 경로에 파일이 없다면 FileNotFoundException이 발생한다.  

## 16-4. File(파일 정보)  

- 전달한 경로에 있는 파일의 정보를 담는 타입.    
- 디렉터리 생성, 해당 경로의 전체 파일 목록, 파일 삭제 등


<hr/>

