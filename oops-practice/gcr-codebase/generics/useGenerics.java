

public class useGenerics {

	// Simple generic container
	static class Box<T> {
		private T value;

		public void set(T value) { this.value = value; }
		public T get() { return value; }
	}

	public static void main(String[] args) {
		// Using generics prevents ClassCastException and enforces type checking
		Box<String> stringBox = new Box<>();
		stringBox.set("hello");
		String s = stringBox.get(); // safe, no cast needed

		Box<Integer> intBox = new Box<>();
		intBox.set(42);
		Integer i = intBox.get();

		System.out.println(s + " " + i);
	}
}
