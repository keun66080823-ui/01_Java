package edu.kh.oop.practice.model.vo;

public class Hero {
	
	//필드
	private String nickname; 	//닉네임
	private String job;		 	//직업
	private int hp;				//체력
	private int mp;				//마력
	private int level;			//레벨
	private double exp;			//경험치
	
	public Hero(){}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println("=========캐릭터 생성==========");
		System.out.println(job+" 직업으로 "+"\'"+nickname+"\'님이 생성되었습니다.");
		System.out.println("현재 레벨 : "+level+"\n현재 hp : "+hp+"\n현재 mp : "+mp+"\n현재 exp : "+this.exp);

	};
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	// 공격 기능
	public void attack(double exp) {
//		전달받은 경험치를 현재 경험치에
//		누적하고, 공격했다는 메세지 출력.
//		(단, 현재 경험치가 300 이상이면
//		현재 레벨을 1 증가시키고,
//		레벨이 올랐다는 메세지 출력)
		
		this.exp += exp; // 전달받은 경험치를 현재 경험치에 누적
		System.out.println("\'"+nickname+"\'"+"은/는 공격을 했다!!! 현재 경험치 : "+this.exp);
		
		// 현재 경험치가 300 이상이면 레벨업
		if(this.exp>=300) {
			level++;
			System.out.println("레벨이 올랐습니다! 현재 레벨 : "+level);
		}
		
	}
	
	// 대쉬 기능
	public void dash() {
//		대시 할 때 마다 현재 mp에서
//		-10씩 감소되며 대시했다는
//		메세지 출력.
//		(단, 현재 mp가 0 이하라면
//		마력이 부족하여 대시할 수
//		없다는 메세지 출력)
		if(mp<=0||mp<10) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!\n");
		}else {
			mp-=10;
			System.out.println("\'"+nickname+"\'"+"의 엄청 빠른 대시!!! 남은 마력 : "+mp);
		}
		

	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "==========\'"+nickname+"\'님의 정보==========="+"\n- 현재 레벨 : "+level+"\n- 현재 hp : "+hp+"\n- 현재 mp : "+mp+"\n- 현재 exp : "+this.exp+"\n";
	}
	
	

}
