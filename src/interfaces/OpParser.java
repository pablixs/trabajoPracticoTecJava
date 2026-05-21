package interfaces;
@FunctionalInterface
public interface OpParser<T> {
	public T parse(String texto);
}
