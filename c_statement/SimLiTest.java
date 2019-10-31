package c_statement;
import java.util.Scanner;
//http://www.seoulmilkblog.co.kr/wp/wp-content/uploads/2019/01/190130-%EC%97%AC%EC%9C%A0%EA%B3%B5%EB%B0%A9-%EC%9D%B8%ED%8F%AC%EA%B7%B8%EB%9E%98%ED%94%BDjpg.jpg
public class SimLiTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String yn = "맞다 -> 'y' / 아니다 -> 'n'";
		String A = " A타입 입니다. ";
		String B = " B타입 입니다. ";
		String C = " C타입 입니다. ";
		String D = " D타입 입니다. ";
		
		System.out.println("나는 금사빠다.");
		System.out.println("* 금방 사랑에 빠진다");
		System.out.println(yn);
		char a = s.next().charAt(0);
		
		if ( a == 'Y' || a == 'y' ){
			System.out.println("연애할 때 끌려다니는 타입이다.");
			System.out.println(yn);
			a = s.next().charAt(0);
			if ( a == 'Y' || a == 'y' ){
				System.out.println("감정 표현에 솔직한 편이다.");
				System.out.println(yn);
				a = s.next().charAt(0);
				if ( a == 'Y' || a == 'y' ){
					System.out.println("이성친구는 존재할 수 없다.");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y' ){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y' ){
							System.out.println(D);
						} else if (a=='N' || a=='n'){
							System.out.println(C);
						}
					} else if ( a=='N' || a=='n' ){
						System.out.println(B);
					}
				} else if (a=='N' || a=='n'){
					System.out.println("활동적인 데이트가 좋다.");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y'){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y'){
								System.out.println(D);
							} else if ( a=='N' || a=='n'){
								System.out.println(C);
							}
						} else if (a=='N' || a=='n'){
							System.out.println(B);
						}
					} else if (a=='N' || a=='n'){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println(D);
						} else if (a=='N' || a=='n'){
							System.out.println(C);
						}
					}
				}		
			} else if (a == 'N' || a == 'n'){
				System.out.println("데이트 코스는 미리 짜는게 편하다");
				System.out.println(yn);
				a = s.next().charAt(0);
				if ( a == 'Y' || a == 'y' ){
					System.out.println("활동적인 데이트가 좋다");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y'){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y'){
								System.out.println(D);
							} else if (a=='N' || a=='n'){
								System.out.println(C);
							}
						} else if (a=='N' || a=='n'){
							System.out.println(B);
						}
					} else if (a=='N' || a=='n'){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println(D);
						} else if (a=='N' || a=='n'){
							System.out.println(C);
						}
					}
				} else if (a == 'N' || a == 'n'){
					System.out.println("감정 표현에 솔직한 편이다.");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y' ){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y' ){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y' ){
								System.out.println(D);
							} else if (a == 'N' || a == 'n'){
								System.out.println(C);
							}
						} else if (a == 'N' || a == 'n'){
							System.out.println(B);
						}
					} else if (a == 'N' || a == 'n'){
						System.out.println("활동적인 데이트가 좋다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println("이성친구는 존재할 수 없다.");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y'){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								System.out.println(yn);
								a = s.next().charAt(0);
								if ( a == 'Y' || a == 'y'){
									System.out.println(D);
								} else if (a=='N' || a=='n'){
									System.out.println(C);
								}
							} else if (a=='N' || a=='n'){
								System.out.println(B);
							}
						} else if (a=='N' || a=='n'){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y'){
								System.out.println(D);
							} else if (a=='N' || a=='n'){
								System.out.println(C);
							}
						}
					}
				}
			}	
		} else if (a == 'N' || a == 'n'){
			System.out.println("감정기복이 크지 않다.");
			System.out.println(yn);
			a = s.next().charAt(0);
			if ( a == 'Y' || a == 'y' ){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				System.out.println(yn);
				a = s.next().charAt(0);
				if ( a == 'Y' || a == 'y' ){
					System.out.println(A);
				} else if (a == 'N' || a == 'n'){
					System.out.println("이성친구는 존재할 수 없다.");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y' ){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y' ){
							System.out.println(D);
						} else if (a == 'N' || a == 'n'){
							System.out.println(C);
						}
					} else if (a == 'N' || a == 'n'){
						System.out.println(B);
					}
				}
			} else if (a == 'N' || a == 'n'){
				System.out.println("감정 표현에 솔직한 편이다");
				System.out.println(yn);
				a = s.next().charAt(0);
				if ( a == 'Y' || a == 'y'){
					System.out.println("이성친구는 존재할 수 없다");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y'){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println(C);
						} else if ( a == 'N' || a == 'n'){
							System.out.println(D);
						}
					} else if ( a == 'N' || a == 'n'){
						System.out.println(B);
					}
				} else if (a=='N' || a=='n'){
					System.out.println("활동적인 데이트가 좋다.");
					System.out.println(yn);
					a = s.next().charAt(0);
					if ( a == 'Y' || a == 'y'){
						System.out.println("이성친구는 존재할 수 없다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							System.out.println(yn);
							a = s.next().charAt(0);
							if ( a == 'Y' || a == 'y'){
								System.out.println(D);
							} else if (a=='N' || a=='n'){
								System.out.println(C);
							}
						} else if (a=='N' || a=='n'){
							System.out.println(B);
						}
					} else if (a=='N' || a=='n'){
						System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
						System.out.println(yn);
						a = s.next().charAt(0);
						if ( a == 'Y' || a == 'y'){
							System.out.println(D);
						} else if (a=='N' || a=='n'){
							System.out.println(C);
						}
					}
				}
			}
		}
	}
}