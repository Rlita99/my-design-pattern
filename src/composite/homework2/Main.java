package composite.homework2;

public class Main {
	public static void main(String args[]) {
		
		Worker 민호 = new Worker("민호", "개발자");
		Worker 아라 = new Worker("아라", "개발자");
		Worker 진원 = new Worker("진원", "엔지니어");
		
		민호.say();
	
		Worker 성태 = new Worker("성태", "개발자");
		Worker 노래 = new Worker("노래", "???");
		
		Dept 보안사업부 = new Dept("보안사업부");
		Dept 연구소 = new Dept("연구소");
		
		보안사업부.addWorkers(민호);
		보안사업부.addWorkers(아라);
		보안사업부.addWorkers(진원);
		
		연구소.addWorkers(노래);
		연구소.addWorkers(성태);
		
		보안사업부.say();
		보안사업부.sayWokrers();
		연구소.say();
		연구소.sayWokrers();
		
		System.out.println("안녕히 계세요 여러분~~~!!!");
		연구소.removeWorkers(노래);
		연구소.sayWokrers();
		
	}

}
