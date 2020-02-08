package src.springA.di.ui;

import src.springA.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole(Exam exam) {
		//super();
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.println("total is "+exam.total()+", "+exam.avg());

	}

}
