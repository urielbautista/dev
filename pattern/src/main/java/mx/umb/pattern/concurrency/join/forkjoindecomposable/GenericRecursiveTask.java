package mx.umb.pattern.concurrency.join.forkjoindecomposable;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * A generic recursive task that implements the typical fork and join workflow. Input objects are split into two sub
 * lists by using {@link GenericSplitProcessor}.
 * 
 * @author Niklas Schlimm
 * 
 */
@SuppressWarnings("rawtypes")
public class GenericRecursiveTask extends RecursiveTask<ComposableResult> implements
		ForkAndJoinTaskPrototype<GenericRecursiveTask> {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -3017444953400657168L;

	private DecomposableInput input;

	private ComputationActivityBridge activity;

	private ForkAndJoinProcessor<GenericRecursiveTask> processor;

	public GenericRecursiveTask(DecomposableInput input, ComputationActivityBridge activity) {
		super();
		this.input = input;
		this.activity = activity;
		this.processor = createForkAndJoinProcessor();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected ComposableResult<?> compute() {

		if (input.computeDirectly()) { // task is small enough to compute linear in this thread
			return activity.compute(input);
		}

		List<DecomposableInput<?>> decomposedInputs = input.decompose();
		return processor.forkAndJoin(decomposedInputs);

	}

	@Override
	public GenericRecursiveTask prototype(DecomposableInput input) {
		return new GenericRecursiveTask(input, activity);
	}

	@Override
	public ForkAndJoinProcessor<GenericRecursiveTask> createForkAndJoinProcessor() {
		return new GenericSplitProcessor(this);
	}

}
