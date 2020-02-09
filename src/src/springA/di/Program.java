package src.springA.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import src.springA.di.entity.Exam;
import src.springA.di.entity.NewlecExam;
import src.springA.di.ui.ExamConsole;
import src.springA.di.ui.GridConsole;
import src.springA.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 스프링에게 지시하는 방법으로 코드를 변경(생성 및 결합[의존성 인젝션])
	    Exam exam = new NewlecExam(); 
		ExamConsole console = new InlineExamConsole(exam); // DI
		//ExamConsole console = new GridConsole(exam);
		console.setter(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("src/springA/di/setting.xml");
		//지시서를 찾아서 객체를 만든다. context가 IoC가 된다.
		
		ExamConsole console = (ExamConsole) context.getBean("console");// 방식1
		//ExamConsole console = context.getBean(ExamConsole.class);// 방식 2
		console.print();
		//만약, InlineExam 대신 Grid를 사용하고 싶으면 setting.xml(DI 지시서) 에서 클래스만 바꿔주면된다.
		//즉 java code 수정 필요 없다.
	}
	//https://www.youtube.com/watch?v=gtqctgfywn4
	//https://www.youtube.com/watch?v=R_6fW1tVj8Y
}
