package src.springA.di.ui;

import src.springA.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole(Exam exam) {
		//super();
		this.exam = exam;
	}

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("total is "+exam.total()+", "+exam.avg());

	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;

		
	}
	

}
