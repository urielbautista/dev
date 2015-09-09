package mx.umb.pattern.concurrency.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.umb.pattern.concurrency.join.forkjoindecomposable.ComposableResult;

public class ListOfPrices extends ComposableResult<List<Map<String, Double>>> {

	public ListOfPrices(List<Map<String, Double>> firstpeace) {
		super(firstpeace);
	}

	@Override
	public ComposableResult<List<Map<String, Double>>> compose(ComposableResult<List<Map<String, Double>>> result) {
		List<Map<String, Double>> listOfPrices = new ArrayList<>();
		listOfPrices.addAll(result.getRawResult());
		listOfPrices.addAll(rawResult);
		ListOfPrices prices = new ListOfPrices(listOfPrices);
		return prices;
	}
	
	@Override
	public String toString() {
		return getRawResult().toString();
	}

}