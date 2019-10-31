package e_oop;

public class JVM_Memory {
	/*
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 *  운영체제 -> 프로그램
	 *  운영체제 -> JVM -> 프로그램
	 */
	
	/*
	 * << Method Area >>
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable, ClassMethod()
	 * 
	 * << Call Stack >>
	 * - main() : cm1
	 * - random() : 삭제
	 * - println() : 삭제
	 * - println() : 삭제
	 * - println() : 삭제
	 * 
	 * << Heap >>
	 * - cm1 = new ClassMember() : instanceVariable, instanceMethod()
	 * - cm2 = new ClassMember() : instanceVariable, instanceMethod()
	 * 
	 */
}
