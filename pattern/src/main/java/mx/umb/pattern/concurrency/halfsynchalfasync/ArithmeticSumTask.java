package mx.umb.pattern.concurrency.halfsynchalfasync;

public class ArithmeticSumTask implements AsyncTask<Long> {

	private long n;

	public ArithmeticSumTask(long n) {
		this.n = n;
	}

	/*
	 * This is the long running task that is performed in background. In our
	 * example the long running task is calculating arithmetic sum with
	 * artificial delay.
	 */
	@Override
	public Long call() throws Exception {
		return ap(n);
	}

	/*
	 * This will be called in context of the main thread where some validations
	 * can be done regarding the inputs. Such as it must be greater than 0. It's
	 * a small computation which can be performed in main thread. If we did
	 * validated the input in background thread then we pay the cost of context
	 * switching which is much more than validating it in main thread.
	 */
	@Override
	public void onPreCall() {
		if (n < 0) {
			throw new IllegalArgumentException("n is less than 0");
		}
	}

	@Override
	public void onPostCall(Long result) {
		// Handle the result of computation
		System.out.println(result);
	}

	@Override
	public void onError(Throwable throwable) {
		throw new IllegalStateException("Should not occur");
	}

	private static long ap(long i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
		}
		return (i) * (i + 1) / 2;
	}

}
