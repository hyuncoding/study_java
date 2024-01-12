# JAVA (WEB)
> 웹개발 강의에서 공부한 Java 관련 내용입니다.
> study_java repository의 공부 내용은 Java 1, 2 강의에서 공부한 내용인 반면,
> 이 repository의 내용은 추후 Spring Boot를 활용한 Java 기반 웹개발을 배우기 위해
> 공부한 내용이므로, Java의 기초 문법도 포함되어 있지만 보다 상위 과정의 내용도 있습니다.


# DAY 01

## JAVA - 프로그래밍 언어  

- 프로그래밍 언어는 개발자와 컴퓨터가 소통하기 위한 언어이다.

## 소스코드  

- 명령어를 작성해 놓은 것.  
- 개발자와 컴퓨터가 소통할 것을 글로 작성해 놓은 것.

## 소스파일  

- 소스코드가 작성되어 있는 파일.

## 컴파일  

- 사람의 언어를 컴퓨터 언어로 바꿔주는 작업.

## 컴파일러  

- 컴파일을 해주는 프로그램 또는 명령어.

## 콘솔  

- 개발자와 컴퓨터가 소통한 결과를 보여주는 창.

## 프로그램  

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


## JVM(Java Virtual Machine)  

- JAVA 프로그램을 실행해줌.

## JRE(Java Runtime Environment)  

- JVM을 생성하며, 실행할 때 필요한 라이브러리 파일들을 가지고 있다.

## JDK(Java Development Kit)  

- JRE외에 개발에 필요한 도구들을 가지고 있다.  
- 컴파일 명령어와 실행 명령어를 담고 있다.	  

## 기본 구조
	프로젝트
		패키지
			클래스(앞글자 대문자)
				메소드(이름())
					소스코드

<hr/>

# DAY 02

## 출력 메소드  

	print() : 마지막에 자동 줄바꿈이 되지 않고 아래의 문장과 이어서 출력된다.
	println() : 마지막에 자동으로 줄바꿈된다.
	printf()

## 서식 문자(format)  

- 반드시 따옴표 안에서 작성한다.

    	%d : decimal(10진수 정수)
    	%o : ocatal(8진수 정수)
    	%x : hexadecimal(16진수 정수)
    	%f : float(실수)
    	%c : character(문자)
    	%s: String(문자열)

## 출력 메소드의 목적  

- 전달받은 데이터 및 전달할 데이터 검사, 오류 발생 지점 구체화 및 검사


## 변수: 저장공간

    	x 		        =		      10
    저장공간의	    대입		    값
    이름		      연산자

## 자료형(type, 종류)

	자료형	type	  byte	값
	
	정수형	int	    4	    10, 32, 543, -32, 2147483647, ... (21억 정도까지)
	실수형	float	  4	    10.5, -0.9, 0.0, 123.45645, ...
		    double	8	    10.5, -0.9, 0.0, 123.45645, ...
	문자형	char	  2	    '김', 'A', '0', '.', ...
	문자열	String	?	    "양현", "ABC", "A", "0", ...

## 변수의 선언  

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

## 주소(해시코드)  

	int x = 10;
	x라는 이름의 저장공간이 RAM에 할당되면 고유한 값인 주소값이 부여된다.


## 변수의 사용  

	int data = 20; // 저장공간
	data = 30; // 저장공간
	System.out.print(data + 9); // 값
	data = data + 7; // 저장공간, 값
	data - 9; // 값

## 변수 선언 시 주의사항  

1. 같은 이름의 변수로 선언할 수 없다.  
2. 초기화를 해준다.  
3. 되도록 선언부에 한꺼번에 선언한다(영역 상단).  


## 변수명 주의사항  

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

## 변수를 사용하는 이유  

1. 반복되는 값을 쉽게 관리할 수 있다.
2. 의미 없는 값을 하나의 정보로 만들기 위해서 사용한다(자료구조).

## 상수 : 항상 그대로인 수  

- 값을 변경할 수 없도록 한다.


## 상수의 선언  

	final type name = value;

## 상수를 사용하는 이유  

1. 의미 없는 값에 의미를 부여하기 위해서  
2. 오타 방지  

## 형변환  

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

## 문자열 형변환  

1. 다른 자료형을 문자열로  
   
  - 문자열과 다른 일반 자료형을 연결하면 결과는 문자열이 된다.  

2. 문자열을 다른 자료형으로  
   
  - 일반 자료형은 일반 자료형끼리만 형변환이 가능하다.  
  - 문자열 타입은 클래스 타입이므로, 일반 자료형의 클래스타입의 도움을 받아야한다.  

		Integer.parseInt("") => 문자열에서 변환된 정수 값
		Double.parseDouble("") => 문자열에서 변환된 실수 값
		...

## 입력   

- 커서가 깜빡이고 있는 상태.  
- 입력하기 전에 출력을 통해 어떤 값을 입력해야할지 사용자에게 알려주어야 한다.  

## 입력 클래스  

	Scanner sc = new Scanner(System.in);

<hr/>

# DAY 03

## 입력 메소드  

- next() : 사용자가 입력한 문자열 값
  
  - 사용자가 입력한 값 중 공백 또는 줄바꿈 문자를 구분점으로 각 문자열을 분리한다.  
  - 첫 번째 문자열을 첫 번째 next()에 담고  
    두 번째 문자열은 두 번째 next()에 담는다.  

- nextLine() : 사용자가 입력한 문자열 값
  
  - 공백 또는 줄바꿈 문자도 값으로 취급하기 때문에 그대로 입력받는다.

## 연산자  

- 기능이 있는 특수문자

## 연산자의 우선순위  

	최우선 연산자
	단항 연산자
	산술 연산자
	쉬프트 연산자
	관계 연산자
	논리 연산자
	삼항 연산자
	대입 연산자

## 결합성  

- 하나의 수식에 동일한 연산자가 여러 번 사용되면 알맞은 방향으로 결합되어 연산되는 성질.

## 논리형(boolean)  

	참 : true
	거짓 : false

	boolean 변수명 = 값(true, false);
	-------
	1byte

## 조건식  

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

## 제어문  

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

## 삼항 연산자, if문, switch문의 비교  
 
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

## 기타 제어문  
 
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

## 배열 : 저장공간의 나열
	
1.
  변수를 여러 개 선언하면 이름도 여러 개 생긴다. 이 때 각 저장공간을 관리하기가 불편하다.  
  따라서 n칸 배열을 한 번만 선언하면 저장공간도 n개 생기고, 이름도 한 개이기 때문에 관리하기 편하다.  


2.
  규칙성이 없는 값에 규칙성을 부여하기 위해서  


## 배열의 선언  

    자료형[] 배열명 = {값1, 값2, 값3, ...}; // 어떤 값을 넣을지 알 때 사용
    자료형[] 배열명 = new 자료형[칸수]; // 어떤 값을 넣을지는 모르나, 몇 칸 만들지는 알 때 사용
    자료형[] 배열명 = null; // 어떤 값을 넣을지도 모르고, 몇 칸 만들지도 모를 때 사용
    배열명 = new 자료형[칸수];
  
    ※ new : Heap 메모리에 할당, 초기값을 자동으로 초기화
    ※ null : 주소의 초기값, 어떤 주소를 넣을지 모를 때 작성하는 값
    ※ 자바에서 배열은 항상 Heap(동적 메모리)에 할당되기 때문에 메모리 상으로는 동적배열만 존재한다.


## 배열의 구조  

	int[] arData = {3, 5, 1, 2, 8};

- arData라는 이름의 저장공간은 한 개 만들어지며, 여기에는 한 개의 값만 담을 수 있다.    
- 5개의 값을 담기 위해서는 5칸이 필요하며, 이는 Heap 메모리에 할당된다. 5칸의 저장공간 중    
  첫 번째 주소값이 arData 저장공간으로 들어가며, 다음 주소에 접근하기 위해서는    
  + n을 한다. 예를 들어 arData + 2는 1이라는 값이 담긴 주소값이 되며,    
  \*(arData + 2)는 해당 주소에 가서 읽어온 1이라는 값이 된다. JAVA에서는 직접 주소에 접근하는    
  연산자가 없기 때문에 위와 같은 식을 []로 치환하여 사용하며, arData[2]로 사용한다.    
  각각의 방 번호는 index라고 부르며, 배열은 시작주소를 가지고 있기 때문에 인덱스 번호는 항상 0부터 시작된다.    

## length  

- 배열을 선언하면 length라는 상수가 선언되고, 해당 배열의 길이가 담긴다.  
- 배열명.length로 사용하게 된다.  

## 배열의 사용  

	int[] arData = new int[5]; // 저장공간
	arData[0] = 10; // 저장공간
	arData[0] + 9; // 값
	System.out.println(arData); // 주소값
	arData[2] = arData[0] + arData[1]; // 저장공간, 값, 값
	System.out.println(arData[5]); // 오류

<hr/>

## DAY 05

## 2차원 배열: 배열 안에 배열  

- 1차원 배열을 여러 개 선언할 때 관리하기 힘들기 때문에  
  2차원 배열을 한 번 선언한다.  

  ※ 2차원 배열부터는 메모리 낭비가 심하므로 선호하지 않는다.  

## 2차원 배열 선언  

	자료형[][] 배열명 = {{값1, 값2, 값3, ...}, {값4, 값5, 값6, ...}};
	자료형[][] 배열명 = new 자료형[행][열];
	자료형[][] 배열명 = null;
	배열명 = new 자료형[행][열];

	int[][] arrData = new int[2][3];

	□	arrData			arrData.length : 행의 길이
	□□	arrData[행]		arrData[행].length : 열의 길이
	□□□	arrData[행][열]		

	※ 무조건 행부터 접근한다.

## 메소드  

- 이름 뒤에 소괄호.  
- 단, 키워드 뒤에 소괄호가 있는 경우는 메소드가 아니다.  

		f	(x) 	= 	2x+1
		메소드의	매개		리턴값
		이름	변수

## 메소드 선언  

	(1)리턴타입 (2)메소드명(자료형 (3)매개변수명, ...) {
		(4)실행할 문장;
		(5)return 리턴값;
	}

	(1) 리턴값의 타입을 작성한다, 리턴값이 없으면 void를 작성한다.
	(2) 동사로 작성한다(연필(매개변수)을 쓴다(메소드)).
	(3) 외부에서 전달받을 값이 있다면, 자료형과 순서에 맞게 선언해준다.
	(4) 생략이 가능하다. 메소드의 기능을 구현하는 로직을 작성한다.
	(5) 생략이 가능하다. 리턴값이 있다면, 사용한 부분 통채로를 리턴값으로 봐야한다.

## 메소드 선언 순서  

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

## 메소드 주의사항  

- 메소드를 선언할 때에는 {}(중괄호)가 있으며, 반드시 메소드 밖에서 선언한다.  
- 메소드를 사용할 때에는 {}(중괄호)가 없으며, 반드시 메소드 안에서 사용한다.  

## 메소드 사용  

- 메소드의 리턴 타입이 void라면 실행 메소드이므로 값으로 봐서는 안 된다.  
- 메소드의 리턴 타입이 void가 아니라면 사용한 부분 통째로가 리턴값이다.  

## 메소드 목적  

1. 재사용(특정성을 부여해서는 절대 안 된다).  
2. 소스코드 간결화   

## 리턴해야 할 때  

- 사용한 쪽에 로직의 결과를 전달해야 할 때.  

## 리턴하면 안 될 때  

- 사용한 쪽에 로직의 결과를 전달할 필요가 없을 때.  

<hr/>

# DAY 07

## 클래스(반)  

- 공통요소를 한 번만 선언해놓고 가져다 사용만 하도록 설계한다.  

1. 타입이다.  
   
- 클래스 안에 선언된 변수와 메소드를 사용하고 싶다면,  
  해당 클래스 타입으로 객체를 선언해야 한다.  

2. 주어이다.
   
- 원숭이가 바나나를 먹는다.

  		Monkey.eat("바나나");

## 클래스 선언  

	class 클래스명 {
		필드(변수, 메소드)
	}

## 클래스의 필드 사용  

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

## 생성자  

- 클래스 이름 뒤에 소괄호가 있는 형태, 메소드와 기능이 똑같지만 메소드라고 부르지 않는다.  
  생성자는 리턴이라는 기능이 존재하지 않기 때문이다.  

1. 해당 클래스의 필드를 메모리에 할당한 후 부여된 주소값을 가져온다.  

### 기본 생성자  

 	public 클래스명(){}


## this  

- 필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근할 수 있다.  
- 이 때 접근한 객체가 가지고 있는 할당된 필드의 주소값이 this라는 변수에 자동으로 담긴다.  


## Storage class (저장 기억 부류)  

			Stack			Data영역
			지역변수, 매개변수	전역변수, 정적변수(static)
	
	1. 초기화	직접			자동
	2. 생명주기	}			new, 프로그램 종료


※ static: 모든 객체가 공유해야 하는 필드에서만 사용한다.

## 다형성 (polymorphism)  

1. 오버로딩(Overloading)
   
- 매개변수의 개수 또는 타입이 다르면 동일한 이름의 메소드로 선언할 수 있다.


<hr/>

# DAY 08

## 클래스 실습(ClassTask2.java)

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

## 상속(Inheritance)  

1. 기존에 선언된 클래스의 필드를 새로 만든 클래스의 필드로 사용하고자 할 때  
2. 여러 클래스 선언 시 필드가 겹칠 때 부모 클래스를 먼저 선언하고  
   공통 필드를 묶어서 자식 클래스들에게 상속해준다(추상화).  


## 상속 문법  

	class A {
		A필드
	}

	class B extends A{
		A필드, B필드
	}


	A: 부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스
	B: 자식 클래스, 하위 클래스, 서브 클래스, 파생 클래스

## super(): 부모 생성자  

- 자식 클래스 타입의 객체로 부모필드에 접근할 수 있다.  
- 하지만 자식 생성자만 호출하기 때문에, 자식 필드만 메모리에 할당된다고 생각할 수 있다.  
- 사실 자식 생성자에는 항상 부모 생성자를 호출하기 때문에 자식 생성자 호출 시 부모와 자식 필드 모두 메모리에 할당된다.  
- 이 때 부모 생성자를 호출하는 방법은 super()를 사용하는 것이다.  
- 만약, super()를 작성하지 않더라도 컴파일러가 자동으로 작성해준다.  

다형성(polymorphism)
	1. 오버로딩
	2. 오버라이딩(Overriding)
		부모 필드에서 선언한 메소드를 자식 필드에서 수정하고자 할 때 재정의를 해야 한다.
		이는 자식에서 부모 필드의 메소드와 동일한 이름으로 선언하는 것이다.
		부모 필드가 메모리에 먼저 할당되고 a라는 메소드가 먼저 올라간다고 하면,
		자식 필드가 메모리에 할당되면서 재정의한 a메소드가 새롭게 만들어지는 것이 아니라
		기존에 할당된 a메소드 저장공간에 새롭게 정




	













