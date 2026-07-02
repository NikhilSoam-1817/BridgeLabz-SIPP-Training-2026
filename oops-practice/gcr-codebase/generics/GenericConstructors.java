

public class GenericConstructors {
    
    private static class Box<T> {
        private T value;
        
        // Generic constructor
        public <U extends T> Box(U value) {
            this.value = value;
        }
        
        public T getValue() {
            return value;
        }
        
        public void setValue(T value) {
            this.value = value;
        }
    }
    
    private static class Container<T> {
        private T item;
        
        // Generic constructor for type-safe instance creation
        public <V> Container(V item) {
            this.item = (T) item;
        }
        
        public T getItem() {
            return item;
        }
    }
    
    public static void main(String[] args) {
        // Type-safe instance creation with generic constructors
        Box<Number> numberBox = new Box<>(42);
        System.out.println("Box value: " + numberBox.getValue());
        
        Container<String> stringContainer = new Container<>("Hello Generic");
        System.out.println("Container item: " + stringContainer.getItem());
    }
}
