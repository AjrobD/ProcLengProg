// Generated from C:/Users/Usuario/Desktop/URJC/Segundo Cuatrimestre/Procesadores de Lenguajes/Programacion/T2-Ejercicios/T2-Ej1/src\Vowel.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link VowelVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class VowelBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements VowelVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(VowelParser.RContext ctx) { return visitChildren(ctx); }
}