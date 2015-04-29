package mystate;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class State<E> extends HashMap<String, E> {
	
	public State() {
		super();
	}
	
	public State(Map<? extends String, ? extends E> m) {
		super(m);
	}
	// returns the value of a variable in the state
	public E lookup(String var) {
		return get(var);
	}
	// binds a variable in the state
	public void bind(String var, E value) {
		put(var, value);
	}
	
}

