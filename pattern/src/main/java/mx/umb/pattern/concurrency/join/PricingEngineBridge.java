package mx.umb.pattern.concurrency.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.umb.pattern.concurrency.join.forkjoindecomposable.ComposableResult;
import mx.umb.pattern.concurrency.join.forkjoindecomposable.ComputationActivityBridge;
import mx.umb.pattern.concurrency.join.forkjoindecomposable.DecomposableInput;

public class PricingEngineBridge extends ComputationActivityBridge<List<Proposal>, List<Map<String, Double>>> {

	private PricingEngine engine = new PricingEngine();
	
	@Override
	public ComposableResult<List<Map<String, Double>>> compute(DecomposableInput<List<Proposal>> input) {
		Map<String, Double> result = engine.calculatePrices(input.getRawInput().get(0));
		List<Map<String, Double>> priceList = new ArrayList<>();
		priceList.add(result);
		return new ListOfPrices(priceList);
	}


}