package src.springA.di.entity;

import org.springframework.stereotype.Repository;

@Repository
public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

}
