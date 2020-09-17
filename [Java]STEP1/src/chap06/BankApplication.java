package chap06;

import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			switch (selectNo) {
			case 1: createAccount(); break;
			case 2: accountList(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: run = false; break;
			}	
			
		}		
		System.out.println("프로그램 종료");
	}
	
	// create an account
	private static void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		accountArray[count++] = new BankAccount(ano, owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	// show the lists of account
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for (BankAccount bankaccount : accountArray) {
			if (bankaccount == null) {
				break;
			} else {
				System.out.println(bankaccount.getAno() + "     " + bankaccount.getOwner() + "     " + bankaccount.getBalance());
			}			
		}
	}
	
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int plusMoney = scanner.nextInt();
		
		BankAccount bankaccount = findAccount(ano);
		
		if(bankaccount != null) {
			int originalBalance = bankaccount.getBalance();
			bankaccount.setBalance(originalBalance + plusMoney);
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("결과: 예금이 실패되었습니다. 해당 계좌가 존재하는지 확인해주십시오.");
		}
	}
	
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int minusMoney = scanner.nextInt();
		
		BankAccount bankaccount = findAccount(ano);
		
		if(bankaccount != null) {
			int originalBalance = bankaccount.getBalance();
			bankaccount.setBalance(originalBalance - minusMoney);
			System.out.println("결과: 출금이 성공되었습니다.");
		} else {
			System.out.println("결과: 출금이 실패되었습니다. 해당 계좌가 존재하는지 확인해주십시오.");
		}
	}
	
	// Account 배열에서 ano와 동일한 BankAccount 객체 찾기
	private static BankAccount findAccount(String ano) {
		for (BankAccount bankaccount : accountArray) {
			if (bankaccount == null) {
				break;
			} else if (bankaccount.getAno().equals(ano)) {
				return bankaccount;
			}
		}

		return null;
	}
}
