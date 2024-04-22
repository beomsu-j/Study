package com.test.model;

public class AccExerciseVO {
	// 누적 식별자
	private int acc_idx;
	// 회원 아이디
	private String mem_id;
	// 운동 식별자
	private String ex_name; // 원래 ex_idx인데 운동명을 받아와야해서 Strig ex_name으로 바꿔놈
	// 운동 날짜
	private String ex_date;
	// 운동 완료 여부
	private String ex_done;
	// 운동 횟수
	private int ex_reps;
	// 소요 시간
	private int ex_time;
	// 등록 일자
	private String created_at;

	public AccExerciseVO() {
	}

	public int getAcc_idx() {
		return acc_idx;
	}

	public void setAcc_idx(int acc_idx) {
		this.acc_idx = acc_idx;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getEx_idx() {
		return ex_name;
	}

	public void setEx_idx(String ex_idx) {
		this.ex_name = ex_idx;
	}

	public String getEx_date() {
		return ex_date;
	}

	public void setEx_date(String ex_date) {
		this.ex_date = ex_date;
	}

	public String getEx_done() {
		return ex_done;
	}

	public void setEx_done(String ex_done) {
		this.ex_done = ex_done;
	}

	public int getEx_reps() {
		return ex_reps;
	}

	public void setEx_reps(int ex_reps) {
		this.ex_reps = ex_reps;
	}

	public int getEx_time() {
		return ex_time;
	}

	public void setEx_time(int ex_time) {
		this.ex_time = ex_time;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public AccExerciseVO(int acc_idx, String mem_id, String ex_name, String ex_date, String ex_done, int ex_reps,
			int ex_time, String created_at) {
		this.acc_idx = acc_idx;
		this.mem_id = mem_id;
		this.ex_name = ex_name;
		this.ex_date = ex_date;
		this.ex_done = ex_done;
		this.ex_reps = ex_reps;
		this.ex_time = ex_time;
		this.created_at = created_at;
	}
}
