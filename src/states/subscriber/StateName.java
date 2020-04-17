package states.subscriber;

/**
 * @author kkontog, ktsiouni, mgrigori an enumeration of all the available
 *         IState names that can be created using the
 *         {@link StateFactory#createState(StateName)} note that normally, for
 *         each new implementation of the {@link AbstractState} interface, a new
 *         entry must be added here
 */
public enum StateName {
	Astate, Bstate, Cstate, Dstate, DefaultState
}
